package eif.viko.lt;

import java.util.ArrayList;
import java.util.List;

public class Sandelys {
  private String pavadinimas;
  private List<Baldas> baldai = new ArrayList<>();

  public Sandelys(String pavadinimas) {
    this.pavadinimas = pavadinimas;
  }

  public void idetiBalda(Baldas baldas){
    baldai.add(baldas);
  }


  public String getPavadinimas() {
    return pavadinimas;
  }

  public List<Baldas> getBaldai() {
    return baldai;
  }

  public void setPavadinimas(String pavadinimas) {
    this.pavadinimas = pavadinimas;
  }

  @Override
  public String toString() {
    return "Sandelys{" +
        "pavadinimas='" + pavadinimas + '\'' +
        ", baldai=" + baldai +
        '}';
  }
}
