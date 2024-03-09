import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = in.nextInt();
        System.out.println("Enter the Third Number");
        int num3 = in.nextInt();
        if(num1 >= num2) {
        if(num1 >= num3)
          System.out.println(num1+" is the largest Number");
        else
          System.out.println(num3+" is the largest Number");
        } 
        else {
        if(num2 >= num3)
          System.out.println(num2+" is the largest Number");
        else
          System.out.println(num3+" is the largest Number");
        }
     }
}
