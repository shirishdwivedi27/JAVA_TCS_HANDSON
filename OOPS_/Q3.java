// Create a class Employee that has two constructors:

// One default

// One parameterized (name, salary)

// Use both in your main() method

class Employee {
    String name;
    int sallery;

    Employee() {
        name = "Rohan";
        sallery = 100000;
    }

    Employee(String req_name, int req_sallery) {
        name = req_name;
        sallery = req_sallery;
    }

    void show() {
        System.out.println("name is:" + name + "sallery is" + sallery);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.show();
        Employee e1 = new Employee("reqq", 12222222);
        e1.show();

    }
}
