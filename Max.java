import java.util.Scanner;
public class Max{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("This is a maximum number: "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("This is a maximum number: "+num2);
        }
        else{
            System.out.println("This is a maximum number: "+num3);
        }
    }
}