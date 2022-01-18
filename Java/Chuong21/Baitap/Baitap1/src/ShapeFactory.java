public class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        } else if (type.equals("rectangle")) {
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
