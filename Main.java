import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int first, second, third, fourth, fifth;
        Scanner calObj = new Scanner (System.in);

        System.out.println("Enter first integer");
        first = calObj.nextInt();
        System.out.println("Enter second integer");
        second = calObj.nextInt();
        System.out.println("Enter third integer");
        third = calObj.nextInt();
        System.out.println("Enter fourth integer");
        fourth = calObj.nextInt();
        System.out.println("Enter fifth integer");
        fifth = calObj.nextInt();

        int sum = (first+second+third+fourth+fifth);
        System.out.println("Sum of five integers are :"+sum);
    }
}