/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cs2;

public class App {
    public String getGreeting() {
        return "Hello World from App!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        for(int i=0; i<args.length; i++) {
            System.out.println("Argument " + i + " is " + args[i]);
        }
    }
}
