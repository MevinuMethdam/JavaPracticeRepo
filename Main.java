import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the Second number: ");
        int num2 = scanner.nextInt();

        if(num1<num2){
            System.out.println("This is the biggest number: "+num2);
        }
        else{
            System.out.println("This is the biggest number: "+num1);
        }
    }
}