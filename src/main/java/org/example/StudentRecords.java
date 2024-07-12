package org.example;

/* RECORDS:
    - adalah kelas yang digunakan untuk menyimpan data
    - tidak ada setter karena field bersifat final
    - auto memiliki constructor, getter, hashCode dll
    - cocok digunakan untuk DTO atau object yg bersifat read-only
    - pada record terdapat 2 jenis constructor : Canonical Constructor dan Compact Constructor
    - Canonical Constructor : secara eksplisit mendefinisikan semua komponen dari record
    - Compact Constructor : lebih ringkas tanpa menyebutkan field. berguna jika ingin menampahkan logika tanpa menulis ulang paramter field
* */
public record StudentRecords(String name, String npm) {
    public StudentRecords(String name) {
        this(name, null);
    }
}
