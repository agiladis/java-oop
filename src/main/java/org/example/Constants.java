package org.example;

/* FINAL keyword:
    - final pada class Constants mencegah inheritance.
    - final pada metode displayMaxSize mencegah overriding.
    - final pada field MAX_SIZE memastikan nilainya tetap konstan setelah diinisialisasi.
    - pada final field karena sudah menjadi nilai yang konstan maka lebih baik dibuat menjadi static agar tidak terjadi duplikasi memori setiap instance yang dibuat
* */
public final class Constants {
    static final int MAX_SIZE = 100;

    public final void displayMaxSize() {
        System.out.println("Max Size: " + MAX_SIZE);
    }
}

class Test {
    public static void main(String[] args) {
        Constants constants = new Constants();
        constants.displayMaxSize();

        // Error examples:
        // class ExtendedConstants extends Constants { } // Cannot inherit from final class
        // constants.MAX_SIZE = 200; // Cannot assign a value to final variable
    }
}

