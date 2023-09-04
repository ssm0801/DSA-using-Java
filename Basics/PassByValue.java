package Basics;

public class PassByValue {
    static void modifyValue(int num) {
        num = 10;
    }
    public static void main(String[] args) {
        int num = 20;
        modifyValue(num);
        // it will print 20
        System.out.println(num);   
    }
}
