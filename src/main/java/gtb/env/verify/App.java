package gtb.env.verify;

public class App {

    public String getGreeting() {
        return "Hello Java";
    }

    public String getProperty(String javaProperty) {
        return System.getProperty(javaProperty);
    }

    public void printProperty(String javaProperty) {
        var property = getProperty(javaProperty);
        System.out.printf("%-25s%s\n", javaProperty, property);
    }

    public static void main(String[] args) {
        var app = new App();
        System.out.println();
        System.out.println("==================================");
        System.out.println(app.getGreeting());
        System.out.println("==================================");
        app.printProperty("java.version");
        app.printProperty("user.name");
        app.printProperty("os.arch");
        app.printProperty("os.name");
        System.out.println("==================================");
        System.out.println();
        System.out.println();
    }
}
