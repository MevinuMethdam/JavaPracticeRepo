import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Units: ");
        int unit = scanner.nextInt();
        double amount,meter,surcharge,TotalBill;
        if(unit<=100){
            amount = unit*4.00;
        }
        else if(unit<= 200){
            amount = 100*4.00 + (unit-100)*5.50;
        }
        else if(unit<=400){
            amount = 100*4.00 + 100*5.50 + (unit-200)*7.20;
        }
        else{
            amount = 100*4.00 + 100*5.50 + 200*7.20 + (unit-400)*8.50;
        }
        surcharge = amount*0.12;
        TotalBill = amount + surcharge+ 150;

        System.out.println("----------------Electricity Bill------------------");
        System.out.println("Base Amount: "+amount);
        System.out.println("Surcharge Amount: "+surcharge);
        System.out.println("Meter Charge: 150");
        System.out.println("Total Bill: "+TotalBill);
    }
}