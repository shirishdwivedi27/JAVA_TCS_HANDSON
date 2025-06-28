//single inheritance
class Vehicle {
    int n;

    void speed() {
        System.out.println("speed is: 10 km/h");
    }
}

class Car extends Vehicle {
    void show() {
        speed();
    }
}

// multiple inheritance through interface

interface Dog {
    void bark();
}

interface Cat {
    void meow();
}

class Animal implements Dog, Cat {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void meow() {
        System.out.println("Cat is meowing");
    }
}

// multilevel inheritance
class Parent1 {
    void show() {
        System.out.println("This is the top parent1");
    }
}

class Pran_2_chil_1 extends Parent1 {
    void show1() {
        show();
        System.out.println("this is the middle parent");
    }
}

class child2 extends Pran_2_chil_1 {
    void last_show() {
        show1();
        System.out.println("this is last part of the class,where all the classes is inhertied by the base class");
    }
}

// Heirarichal inheritance
class Parent {

}

class child1 extends Parent {

}

class childd2 extends Parent {

}

class child3 extends Parent {

}

public class inher_pra {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        Animal a = new Animal();
        a.bark();
        a.meow();
        child2 cc = new child2();
        cc.last_show();
    }
}
