package org.example;

/* FINAL keyword:
    - final pada kelas Constants mencegah kelas lain untuk mewarisinya.
    - final pada metode displayMaxSize mencegah metode tersebut dioverride.
    - final pada field MAX_SIZE memastikan nilainya tetap konstan setelah diinisialisasi.
* */
final class Constants {
    final int MAX_SIZE = 100;

    final void displayMaxSize() {
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

