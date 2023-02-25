import java.util.Scanner;
import java.lang.*;
public class task_1_solution_2 {
    public static void main(String[] args) {

        String str =  args[0];
        int b = Integer.parseInt(str);
        for ( int i = 0; i < b; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    System.out.println("голосна");
                    break;
                case 'y': case 'w':
                    System.out.println("іноді голосна");
                    break;
                default:
                    System.out.println("приголосна");
            }
        }
    }

}












