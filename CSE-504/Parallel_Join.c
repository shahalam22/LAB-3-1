#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

#define NUM_THREADS 4
#define DATA_SIZE 100

int main() {
    int column1[DATA_SIZE], column2[DATA_SIZE];
    int result[DATA_SIZE * DATA_SIZE] = {0};  // Result array for joined data
    int result_count = 0;

    // Initialize columns with some data
    for (int i = 0; i < DATA_SIZE; i++) {
        column1[i] = i;
        column2[i] = i + (i % 3);  // Some overlap to simulate joins
    }

    // Set number of threads
    omp_set_num_threads(NUM_THREADS);

    // Parallel join operation with OpenMP
    #pragma omp parallel
    {
        int local_result[DATA_SIZE] = {0};  // Local array to hold results per thread
        int local_count = 0;

        int thread_id = omp_get_thread_num();
        int chunk_size = DATA_SIZE / NUM_THREADS;
        int start = thread_id * chunk_size;
        int end = (thread_id == NUM_THREADS - 1) ? DATA_SIZE : start + chunk_size;

        // Perform join for this chunk
        for (int i = start; i < end; i++) {
            for (int j = 0; j < DATA_SIZE; j++) {
                if (column1[i] == column2[j]) {
                    local_result[local_count++] = column1[i];  // Store match locally
                }
            }
        }

        // Add local results to the global result array in a critical section
        #pragma omp critical
        {
            for (int k = 0; k < local_count; k++) {
                result[result_count++] = local_result[k];
            }
        }
    }

    // Print the result
    printf("Joined Data:\n");
    for (int i = 0; i < result_count; i++) {
        printf("%d ", result[i]);
    }
    printf("\n");

    return 0;
}
