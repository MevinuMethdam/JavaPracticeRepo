import java.util.Scanner;
public class Number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("This number is Even: "+num);
        }
        else{
            System.out.println("This number is Odd "+num);
        }
    }
}