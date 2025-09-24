interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}

class Orignated {
    private Engine engine;

    public Orignated(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        engine.start();
    }
}

public class Car {
    public static void main(String[] args) {
        Orignated or1 = new Orignated(new DieselEngine());
        or1.startEngine();

        Orignated or2 = new Orignated(new PetrolEngine());
        or2.startEngine();
    }
}
