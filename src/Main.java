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

        /*//ULOHA - UZIVATEL ZADA SLOVO - VO VYPISE BUDU VSETKY PISMENA VELKYM
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo.toUpperCase());
        System.out.println(slovo.length());
        System.out.println(slovo.isEmpty());
        System.out.println(slovo.indexOf('j'));*/

        //Parsovanie -prevody medzi typmi
        //int prevedeneCilo = Integer.parseInt('5');

        /*int prveCislo = 25;
        int druheCislo = 2;
        //prveCislo = prveCislo + druheCislo;
        prveCislo += druheCislo;*/

        /*int prvCislo;
        int druhCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println ("Zadaj prve cislo");
        prveCislo = mujScanner.nextInt();

        System.out.println ("Zadaj druhe cislo");
        druheCislo = mujScanner.nextInt();

        // ROVNAKE ULOHY SA DAJU SA ZAPISAT ROZNE

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);

        System.out.println(prveCislo > druheCislo);*/

        //APLIKACIA NA KONTROLU VEKU (FEATURE) - ak bude uzivate starsi 18 a viac vypis do kozole - Vitaj

        int vek;
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoj vek:");
        vek =mujScanner.nextInt();

        //LOGICKY RETAZEC
        if(vek >= 18) {
            System.out.println("Uzivatel je dospely");
             if (vek >= 65) {
                System.out.println("Uzivatel senior");
            }
        }

        else if (vek >=0 && vek < 18) {
            System.out.println("Uzivatel je nezletily");
        }
        else {
            System.out.println("neda sa zadat zaporny vek");
        }


    }
}