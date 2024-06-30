package org.example;

/* STATIC Keyword:
    - keyword static di class cuma berlaku di sebuah nested class.
    - keyword static di method supaya method bisa digunakan tanpa meng-instance class tersebut
    - keyword static di  field memiliki memory allocation 1, sehingga objek yang menggunakanya akan berbagi nilai yang sama
* */
public class Outer {
    public Outer() {}

    static class StatNestedDemo {
        public void myMethod() {
            System.out.println("This is a static class");
        }
    }

    class NonStatNestedDemo {
        public void myMethod() {
            System.out.println("This is not a static class");
        }
    }

    public static void main(String[] args) {
        Outer.StatNestedDemo nested = new Outer.StatNestedDemo();
        nested.myMethod();

        Outer outer = new Outer();
        Outer.NonStatNestedDemo nonStatNestedDemo = outer.new NonStatNestedDemo();
        nonStatNestedDemo.myMethod();
    }
}
