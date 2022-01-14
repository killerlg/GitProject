import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String label;
    private double price;

    public Product() {
    }

    public Product(String id, String name, String label, double price) {
        this.id = id;
        this.name = name;
        this.label = label;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", price=" + price +
                '}';
    }
}
