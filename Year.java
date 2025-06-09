import java.util.Scanner;
public class Year{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();

        if(year%4 == 0){
            System.out.println("This year is leap year: "+year);
        }
        else{
            System.out.println("This year is not leap year: "+year);
        }
    }
}