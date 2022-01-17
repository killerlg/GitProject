import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Madza1", "Nissan", 210000));
        products.add(new Product("2", "Madza2", "Nissan", 220000));
        products.add(new Product("3", "Madza3", "Nissan", 230000));
        products.add(new Product("4", "Madza4", "Nissan", 240000));
        products.add(new Product("5", "Madza5", "Nissan", 250000));
        products.add(new Product("6", "Madza6", "Nissan", 260000));
        products.add(new Product("7", "Madza7", "Nissan", 270000));
        products.add(new Product("8", "Madza8", "Nissan", 280000));
        products.add(new Product("9", "Madza9", "Nissan", 290000));
        products.add(new Product("10", "Madza10", "Nissan", 2100000));
        products.add(new Product("11", "Madza11", "Nissan", 2110000));
        writeToFile(products);

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.print("Chon chuc nang: ");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    addProduct(products);
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    findProduct();
                    break;
                default:
                    number = 0;
            }
        } while (number != 0);
    }

    public static List<Product> readDataFromFile() {
        List<Product> products = new ArrayList<>();
        try {
            ObjectInputStream ois;
            try (FileInputStream fis = new FileInputStream("File/data.txt")) {
                ois = new ObjectInputStream(fis);
                products = (List<Product>) ois.readObject();
                fis.close();
            }
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
    public static void writeToFile(List<Product> products) {
        try {
            String path = "File/data.txt";
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addProduct(List<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap brand: ");
        String brand = scanner.nextLine();
        System.out.println("Nhap gia");
        double price = scanner.nextDouble();
        products.add(new Product(id,name,brand,price));
    }

    public static void displayProduct() {
        List<Product> products = readDataFromFile();
        for (Product i:products) {
            System.out.println(i);
        }
    }

    public static void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        List<Product> products = readDataFromFile();
        for (Product i:products) {
            if (i.getId().equals(id)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Khong tim thay san pham nao!");
    }
}
