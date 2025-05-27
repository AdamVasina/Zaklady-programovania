import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//dve lomitka na ukaldanie napovied do kodu

       /*String pozdrav = "Ahoj Svet!";

        System.out.println(pozdrav);
        System.out.println("Hello, World!");
        System.out.println(pozdrav);
        System.out.println("Hello, World!");*/

        /*int prveCislo = 10;
        int druheCislo = 10;

        prveCislo = druheCislo * 10;*/

        /*System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);

        String pozdrav2 = "Ahoj";
        String meno = "Adam";

        System.out.println(pozdrav2 + " " + meno);*/

        //Uloha:Uzivatel napise svoje meno a program ho pozdravi
        /*String pozdrav3 = "Ahoj uzivatel, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje meno:");
        String meno = mujScanner.nextLine();
        System.out.println(pozdrav3 + meno);*/

        //Kalkulacka - Uloha
        /*float prveCislo;
        float druheCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println ("Zadaj prve cislo");
        prveCislo = mujScanner.nextFloat();

        System.out.println ("Zadaj druhe cislo");
        druheCislo = mujScanner.nextFloat();

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);*/

        //ULOHA - UZIVATEL ZADA SLOVO - VO VYPISE BUDU VSETKY PISMENA VELKYM
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo.toUpperCase());
        System.out.println(slovo.length());
        System.out.println(slovo.isEmpty());
        System.out.println(slovo.indexOf('j'));






    }
}