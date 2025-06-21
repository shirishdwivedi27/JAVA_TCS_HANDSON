class Laptop {
    String brand = "Lenovo";
    int price = 12;

    void showDetails() {
        System.out.println("Current laptop brand is :" + brand + " and the price is:" + price);
    }
}

/*
 * Create a class Circle with:
 * 
 * One constructor that sets radius to 1.0 (default)
 * 
 * Another that takes radius as parameter
 * Calculate and print area in both cases.
 * 
 */

class Circle {
    int rad = 1;

    Circle() {
        System.out.println(22 * rad * rad);
    }

    Circle(int r) {
        this.rad = r;
        System.out.println(rad * rad * 22 / 7);
    }

}

public class Practise216 {
    public static void main(String[] args) {
        Laptop lc = new Laptop();
        lc.showDetails();
        Circle c = new Circle();
        Circle cc = new Circle(12);
        // System.out.println(c);

    }
}