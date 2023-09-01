public class Functions {
    // Can reference both static and non-static context
    void greet(String name) {
        System.out.println("Hello " + name);
    }

    // Can reference only static context
    static int length(String name) {
        return name.length();
    }

    public static void main(String[] args) {
        Functions f = new Functions();
        f.greet("Sudhanshu");

        // static functions can be called using class name
        int length = Functions.length("Sudhanshu");
        System.out.println(length);
    }
}
