package org.example;

/* StringBuffer:
*   - merupakan object thread safe : aman dipakai pada program multithreading
*   - performa tidak lebih baik dari StringBUilder
* */
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        sb.append("Java ");
        sb.append("Backend");
        String str = sb.toString();
        System.out.println("String object : " + str);
    }
}
