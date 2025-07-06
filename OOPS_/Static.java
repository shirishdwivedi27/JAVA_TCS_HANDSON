/*
    Create a class Counter with a static variable count and increment it in constructor. Show count with multiple objects.

    Create a class MathUtil with static method add(int a, int b) and call it without object.

    Create a class Student with:

        static college name

        instance variables: name, roll

        Show that all students share same college
*/
class MathUtil {
    static int a = 12;
    static int b = 0;

    static int s_add(int a1, int b1) {
        int res = a1 + b1;
        return res;
    }
}

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }
}

public class Static {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter();
        int req = MathUtil.s_add(12, 12);
        System.out.println(req);
    }
}
