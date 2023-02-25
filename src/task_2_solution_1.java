
import java.lang.*;
import java.util.Scanner;
public class task_2_solution_1 {
    public static void main(String[] args) {
        System.out.println("Введіть першу сторону");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Введіть другу сторону");
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc.next();
        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str2);
        Kut (a,b);
    }
    public static void Kut(double a,double b) {
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
