package codegym.service;

import codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Lavie", 5000, "Nuoc loc"));
        products.put(2, new Product(2, "Sting dau", 8000, "Nuoc tang luc"));
        products.put(3, new Product(3, "Redbull", 10000, "Nuoc tang luc"));
        products.put(4, new Product(4, "Rocket", 45000, "Duoc pham chuc nang"));
        products.put(5, new Product(5, "Teppy", 7000, "Nuoc ngot"));
        products.put(6, new Product(6, "CocaCola", 8000, "Nuoc ngot"));
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
