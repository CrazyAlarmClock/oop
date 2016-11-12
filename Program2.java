import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a= sc.nextInt();
        Circle circle1 = new Circle (a);

        System.out.println(circle1.area());
    }
}