class Car {
    String req;
    int speed;

    Car() {
        req = "blue";
        speed = 120;
    }

    void show() {
        System.out.println("Curr colour is :" + req + "and " + "speed is " + speed);
    }
}

public class Constr {
    public static void main(String[] args) {
        Car cc = new Car();
        cc.show();
        cc.req = "RED";
        cc.speed = 190;
        cc.show();

    }
}
