package org.example;

/* INTERFACE:
    - gunakan jika ingin mendefinisikan perilaku yang dapat diimplementasikan oleh berbagai kelas yang tidak terkait.
    - secara default semua metode dalam interface adalah abstract dan publik
    - hanya berisi abstract method
    - ga punya field, kecuali konstanta yaitu public static final
    - ga punya constructor
    - ga bisa di-instance
    - Interface tidak memiliki constructor karena tidak ada implementasi konkret yang perlu diinisialisasi (misalnya inisialisasi nilai field, padhal ga ada field).
* */
public interface Registration {
    void registration(String name);
    Person getRegisteredPerson(String name);
}
