package eif.viko.lt;

import java.util.List;

public class Main {

    public static void main(String[] args) {


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

        for(Baldas b: baldai){
            System.out.println(b);
        }
        for(int i=0; i < baldai.size(); i++){
            System.out.println(baldai.get(i));
        }
        baldai.forEach(System.out::println);

































    }
}
