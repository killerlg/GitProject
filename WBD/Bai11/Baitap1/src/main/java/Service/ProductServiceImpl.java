package Service;

import Model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone11", "11", "11000"));
        products.put(2, new Product(2, "Iphone12", "12", "12000"));
        products.put(3, new Product(3, "Iphone13", "13", "13000"));
        products.put(4, new Product(4, "Iphone14", "14", "14000"));
        products.put(5, new Product(5, "Iphone15", "15", "15000"));
        products.put(6, new Product(6, "Iphone16", "16", "16000"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
