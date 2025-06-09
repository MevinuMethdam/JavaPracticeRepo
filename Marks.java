import java.util.Scanner;
public class Marks{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Physics Marks: ");
        int mark1 = scanner.nextInt();

        System.out.println("Enter the Chemistry Marks: ");
        int mark2 = scanner.nextInt();

        System.out.println("Enter the Maths Mark: ");
        int mark3 = scanner.nextInt();

        int Total = mark1 + mark2 + mark3;
        int total = mark1 + mark3;

        if((mark1 >= 55 && mark2 >= 50 && mark3 >= 65)&& Total >= 180 || total >= 140) {
            System.out.println("This candidate is eligible for admission");
        }
        else{
            System.out.println("This candidate not eligible for admission");
        }

    }
}