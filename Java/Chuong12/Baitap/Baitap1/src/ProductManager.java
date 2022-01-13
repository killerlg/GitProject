import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> listProduct = new ArrayList<Product>();


    public Product addproduct(Product product) {
        this.listProduct.add(product);
        return product;
    }

    public int findProduct(String name) {
        for (int i=0; i<this.listProduct.size();i++) {
            if (this.listProduct.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Product deleteProductById(String id) {
        int index = -1;
        for (int i=0; i<this.listProduct.size();i++) {
            if (this.listProduct.get(i).getId().equals(id)) {
                Product product = listProduct.get(i);
                this.listProduct.remove(i);
                return product;
            }
        }
        return null;
    }

    public void display() {
        for (int i=0; i<this.listProduct.size();i++) {
            System.out.println(this.listProduct.get(i));
        }
    }

    public void sortAccesding() {
        Collections.sort(this.listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }
    public void sortDescesding() {
        Collections.sort(this.listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }

}
