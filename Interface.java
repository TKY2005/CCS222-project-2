import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String carType1;
        float startKms1;
        float endKMS1;
        float litersUsed1;
        float pricePerLiter1;

        System.out.print("Enter car type and model : "); carType1 = in.nextLine();
        System.out.println("1- Mile, Gallon\n2- Kilometer, Liter");
        System.out.print("Enter reading mode : "); int readingMode = in.nextInt();

        if (readingMode != 1 && readingMode != 2){
            System.out.println("Invalid reading mode. setting it to default value of 1");
            readingMode = 1;
        }
        System.out.print("Enter start distance : "); startKms1 = in.nextFloat();
        System.out.print("Enter end distance : "); endKMS1 = in.nextFloat();
        System.out.print("Enter the amount of fuel used : "); litersUsed1 = in.nextFloat();

        if (readingMode == 1) System.out.print("Enter price per gallon : ");
        else if (readingMode == 2) System.out.print("Enter price per liter : ");
        pricePerLiter1 = in.nextFloat();

        Fuel2 car1 = new Fuel2(carType1, startKms1, endKMS1, litersUsed1, pricePerLiter1);
        if (readingMode == 1) car1.setReadingMethod(new MPGStartegy());
        else if (readingMode == 2) car1.setReadingMethod(new LP100KMStartegy());
        car1.displayAllInfo();
    }
    
}
