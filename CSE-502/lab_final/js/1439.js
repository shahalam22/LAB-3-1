document.getElementById('contactForm').addEventListener('submit', function(e) {
    let valid = true;
    const inputs = this.querySelectorAll('input, textarea');
    
    inputs.forEach(input => {
        if (!input.value.trim()) {
            valid = false;
            input.style.border = '1px solid red';
        } else {
            input.style.border = '';
        }

        if (input.name === 'email') {
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(input.value.trim())) {
                valid = false;
                input.style.border = '1px solid red';
                alert('Please enter a valid email address!');
            }
        }
    });

    if (!valid) {
        e.preventDefault();
        if (!alert('All fields are required!')) {
        }
    }
});