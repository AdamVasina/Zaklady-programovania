import javax.print.DocFlavor;
import java.util.Random;
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

        /*int vek;
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
        }*/

        //KALKULACKA BMI INDEXU hmotnost (kg) / vyska na 2 (m)
        /*float vyska;
        float hmotnost;
        float bmi;

        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoju vysku(m):");
        vyska = mujScanner.nextFloat();

        System.out.println("Zadaj svoju hmotnost(kg):");
        hmotnost = mujScanner.nextFloat();

        bmi = hmotnost / (vyska * vyska);


        if (bmi < 18.5f && bmi>0){
            System.out.println("Uzivatel ma podvahu:");
        } else if (bmi >=18.5f && bmi<25) {
            System.out.println("Uzivatel ma optimalnu vahu:");
        } else if (bmi>=25) {
            System.out.println("Uzivatel ma nadvahu:");
        }
        else {
            System.out.println("Uzivatel zadal zapornu hmotnost:");
        }
            System.out.println(bmi);*/


        //VETVENIE: KOCKA: PARNE CISLO = VYHRAVA / NEPARNE = PREHRAVA

        /*int hodeneCislo;
        Random nahodnyGenerator = new Random();

        System.out.println ("Pre hodenie kocky stac enter");
        Scanner mujScanner = new Scanner(System.in);
        mujScanner.nextLine();


        hodeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println("Hodene Cislo je: " + hodeneCislo);

        if (hodeneCislo % 2 == 1) {
            System.out.println ("Parne - Vyhravas");
        } else{
            System.out.println ("Neparne - Prehravas");
    }*/

        //Switch - den v tyzdni
       /* Scanner mujScanner = new Scanner(System.in);
        int cisloDne;
        System.out.println("Zadej cislo dne:");
        cisloDne = mujScanner.nextInt();

        switch (cisloDne) {
            case 1:
                System.out.println("Je pondeli");
                break;
            case 2:
                System.out.println("Je utery");
                break;
            case 3:
                System.out.println("Je streda");
                break;
            case 4:
                System.out.println("Je ctvrtek");
                break;
            case 5:
                System.out.println("Je patek");
                break;
            case 6:
                System.out.println("Je sobota");
                break;
            case 7:
                System.out.println("Je nedele");
                break;
            default:
                System.out.println("Neplatne cislo dna");
        }*/

        //POLE
        int[] znamky = new int [5];
        znamky [0] = 3;
        znamky [1] = 5;
        znamky [2] = 1;
        znamky [3] = 3;
        znamky [4] = 1;

        int[] znamky2 = new int[] {3,5,1,3,1};
        System.out.println(znamky[3]);

    }
}