import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        System.out.println("Revers is :");
        problem12(m,m.length()-1);
    }


    public static void problem12(String m, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(m.charAt(index));
        problem12(m, index - 1);
    }
}


