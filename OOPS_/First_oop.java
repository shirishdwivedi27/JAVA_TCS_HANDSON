class Car {
    String req_color;
    int speed;

    void color_is() {
        System.out.println("Speed is" + speed + "and color is " + req_color);
    }
}

public class First_oop {
    public static void main(String[] args) {

        System.out.println((args.length));

        Car ge = new Car();
        ge.req_color = "blue";
        ge.speed = 456;

        ge.color_is();
    }
}