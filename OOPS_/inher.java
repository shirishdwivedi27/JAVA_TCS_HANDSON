class Vehicle {
    void run() {
        System.out.println("Run at speed of 90km/h");
    }
}

class Bike extends Vehicle {
    void start() {
        run();
    }
}

class rectangle {
    int len = 10;
    int bred = 20;

    void area() {
        int areaa = len * bred;
        System.out.println(areaa);
    }
}

class Circle {
    int rad = 12;

    void area() {
        int areaa = 22 / 7 * rad * rad;
        System.out.println(areaa);
    }
}

class shape {
    rectangle r = new rectangle();
    Circle c = new Circle();

    void show() {
        r.area();
        c.area();
    }
}

interface Person {
    void show();
}

interface Employee {
    void show1();
}

class Manager implements Person, Employee {
    public void show() {
        System.out.println("Beg");
    }

    public void show1() {
        System.out.println("MID");
    }
}

public class inher {
    public static void main(String args[]) {
        Bike b = new Bike();
        b.start();
        shape s = new shape();
        s.show();
        Manager m = new Manager();
        m.show();
        m.show1();
    }
}
