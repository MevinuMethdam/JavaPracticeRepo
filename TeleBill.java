import java.util.Scanner;
public class TeleBill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit count: ");
        int unit = scanner.nextInt();

        double amount,surcharge,Total;
        if(unit<=100){
            amount = unit*1.00;
        }
        else if(unit>=101 && unit<=200){
            amount = 100*1.00 + (unit-100)*1.50;
        }
        else if(unit>=201 && unit<=300){
            amount = 100*1.00 + 100*1.50 + (unit-200)*2.00;
        }
        else{
            amount = 100*1.00 + 100*1.50 + 100*2.00 + (unit-300)*2.50;
        }
        surcharge = amount*0.10;
        Total = surcharge + amount;

        System.out.println("-----------Telephone Bill-------------");

        System.out.println("Total Telephone Bill: "+Total);
        System.out.println("Surcharge: "+surcharge);
    }
}