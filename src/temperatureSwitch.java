import java.util.Scanner;

public class temperatureSwitch {
    public static double CtoF(double Celsius){
        return (9.0 / 5) * Celsius + 32;
    }
    public static double FtoC(double Fahenheit){
        return (5.0 / 9) * (Fahenheit - 32);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = -1;
        double F;
        double C;
        while ( i != 0){
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhap lua chon cua ban: ");
            i = sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("Fahrenheit to Celsius");
                    System.out.println("Nhap Fahrenheit: ");
                    F = sc.nextDouble();
                    System.out.println(F + " = " + FtoC(F) + " do C");
                    break;
                case 2:
                    System.out.println("Celsius to Fahrenheit: ");
                    System.out.println("Nhap Celsius: ");
                    C = sc.nextDouble();
                    System.out.println(C + " = " + CtoF(C) + " do F");
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
