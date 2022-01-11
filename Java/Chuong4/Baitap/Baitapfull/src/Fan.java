public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,"yellow",10);
        Fan fan2 = new Fan(2,false,"blue",5);
        System.out.println(fan1);
        System.out.println(fan2);
    }
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed ;
    private boolean on;
    private String color;
    private double radius;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is ON: Radius: "+this.radius+", Speed: "+this.speed +
                    ", Color: "+this.color;
        }
        return "Fan is OFF: Radius: "+this.radius + ", Color: "+this.color;
    }
}
