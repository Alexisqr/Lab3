import java.util.Scanner;
import java.lang.*;
public class task_1_solution_1 {
    public static void main(String[] args) {
        System.out.println("Введіть бажану кількість генерованих символів");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int b = Integer.parseInt(str);
        SymbolTest (b);
    }
    public static void SymbolTest (int b) {
        for (int i = 0; i < b; i++) {
            char c = (char) (Math.random() * 26 + 'a');
            System.out.print(c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("голосна");
                    break;
                case 'y':
                case 'w':
                    System.out.println("інколи голосна");
                    break;
                default:
                    System.out.println("приголосна");
            }
        }
    }
}












