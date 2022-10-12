import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);

        int alas,tinggi;
        double luas;
        System.out.println("\tMenghitung luas segitiga\n");

        System.out.println("Inputkan Alas :");
        alas = userInput.nextInt();

        System.out.println("Inputkan Tinggi");
        tinggi = userInput.nextInt();

        luas=(alas*tinggi)*0.5;

        System.out.println("\nLuas Segitiga adalah :"+luas);
    }
}
