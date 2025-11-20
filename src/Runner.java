//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Runner {
    public static void print(String msg, boolean newLine) {
        System.out.println(msg + ((newLine) ? "\n" : ""));
    }

    public static void main(String[] args) {
       System.out.println("Hello world");
       print("HI", false);
    }
}