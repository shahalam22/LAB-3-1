import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    private Map<String, Product> prototypes = new HashMap<>();

    // Register a prototype
    public void addPrototype(String key, Product product) {
        prototypes.put(key, product);
    }

    // Retrieve a clone of the requested prototype
    public Product getPrototype(String key) {
        Product prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}
