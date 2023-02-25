import java.lang.*;
import java.util.Scanner;
public class task_2_solution_2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double c = Math.hypot(a,b);
        double p = (a + b + c) /2;
        double S=Math.sqrt(p * (p-a) * (p-b) * (p-c));
        double kut_a = Math.toDegrees (Math.asin ((2 * S) /(a*b)));
        double kut_b =Math.toDegrees (Math.asin ((2 * S) /(c*b)));
        double kut_c =Math.toDegrees (Math.asin ((2 * S) /(a*c)));
        System.out.println("Кути");
        System.out.println(kut_a);
        System.out.println(kut_b);
        System.out.println(kut_c);
    }
}
