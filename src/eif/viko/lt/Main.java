package eif.viko.lt;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Dalyba is nulio blogai!");
        }


        Baldas laukoStalas = new Baldas(
            1,
            "Lauko stalas Venecija",
            Medziaga.PLASTIKAS);

        Baldas laukoKede = new Baldas(
            2,
            "Lauko kedė Paryžius",
            Medziaga.PLASTIKAS);

        Sandelys sandelys = new Sandelys("SANITEX");
        sandelys.idetiBalda(laukoStalas);
        sandelys.idetiBalda(laukoKede);

        List<Baldas> baldai = sandelys.getBaldai();

//        for(Baldas b: baldai){
//            System.out.println(b);
//        }
//        for(int i=0; i < baldai.size(); i++){
//            System.out.println(baldai.get(i));
//        }
//        baldai.forEach(System.out::println);


        int input = 1;

        Scanner scanner = new Scanner(System.in);

        while (input != 3) {

            System.out.println("=====================Baldų sąrašas==============================");
            System.out.println("1. Įdėti baldą.");
            System.out.println("2. Atspausdinti baldų sąrašą.");
            System.out.println("3. Uždaryti programą.");
            System.out.println("4. Išsaugoti faile.");
            System.out.println("5. Duomenys faile.");


            System.out.println("Nurodykite meniu punktą: ");
            input = scanner.nextInt();

            switch (input){
                case 1:
                    sandelys.idetiBalda();
                    break;
                case 2:
                    sandelys.spausdintiBaldus();
                    break;
                case 3:
                    break;
                case 4:
                    sandelys.issaugotiFaile();
                    break;
                case 5:
                    sandelys.uzkrautiIsFailo();
                    break;
                default:
                    System.out.println("Pasirinkite nuo 1-3");
                    break;
            }

        }
    }



}
