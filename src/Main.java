import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double Armut, Elma, Domates ,Muz ,Patlıcan;

        double priceArmut = 2.14;
        double priceElma = 3.67;
        double priceDomates = 1.11;
        double priceMuz = 0.95;
        double pricePatlıcan = 5.0;
        System.out.print("Armut kaç kilo ? : ");
        Armut = keyboard.nextDouble();
        System.out.print("Elma kaç kilo ? : ");
        Elma = keyboard.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        Domates = keyboard.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        Muz = keyboard.nextDouble();
        System.out.print("Patlıcan kaç kilo ? : ");
        Patlıcan = keyboard.nextDouble();


        double Total;
        Total = (Armut * priceArmut) + (Elma * priceElma) + (Domates * priceDomates) + (Muz * priceMuz) + (Patlıcan * pricePatlıcan);
        System.out.println("TotalPrice: " + Total);

    }
}