//Create a class Student with a default constructor that sets default name = "John" and roll = 1. Print details.
class Student {
    String name = "john";
    int roll_no = 1;

    void show() {
        System.out.println(name + roll_no);
    }
}

public class Q {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
