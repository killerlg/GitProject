import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if(qe.getDiscriminant()>0) {
            System.out.println("2 root: " + qe.getRoot1() + ", "+ qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("1 root: "+ qe.getRoot1());
        } else {
            System.out.println("0 root");
        }
    }
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return b*b - 4*a*c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        }
        return (-b+Math.pow((b*b -4*a*c),0.5))/(2*this.a);
    }
    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        }
        return (-b-Math.pow((b*b -4*a*c),0.5))/(2*this.a);
    }
}
