import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Temperature: ");
        int temp = scanner.nextInt();

        if(temp<0){
            System.out.println("Freezing Weather");
        }
        else if(temp>=0 && temp<=10){
            System.out.println("Very Cold Weather");
        }
        else if(temp>=10 && temp<=20){
            System.out.println("Cold Weather");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("Normal in Temperature");
        }
        else if(temp>=30 && temp<=40){
            System.out.println("Its Hot");
        }
        else{
            System.out.println("Its very Hot");
        }
    }
}
