package org.example;

/* StringBUilder :
 *   - tidak thread safe
 *   - performa lebih baik dari StringBuffer
 * */
public class StringBuilderExample {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append("Java ");
        sb.append("Backend");
        String str = sb.toString();
        System.out.println("String object : " + str);
    }
}