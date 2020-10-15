package eif.viko.lt;

import java.io.Serializable;
import java.util.Random;

public class Baldas implements Serializable {

  private static final long serialVersionUID = 1L;

  private int id;
  private String pav;
  private Medziaga medziaga;

  public Baldas(int id, String pav, Medziaga medziaga){
    this.id = id;
    this.pav = pav;
    this.medziaga = medziaga;
  }
  public Baldas(int id, Medziaga medziaga){
    this.id = id;
    this.medziaga = medziaga;
  }

  public String gautiPavadinima(){
    return pav;
  }
  public String gautiMedziaga(){
    return medziaga.name();
  }
  public void pakeistiPavadinima(String naujasPav){
    pav = naujasPav;
  }

  public void nusidevejimas(){
    System.out.println(pav+" buklė:"+
        new Random().nextInt(100) + "%");
  }


  @Override
  public String toString(){
    return
        "id: " + id +
        " Pavadinimas: " + pav +
        " Medziaga: "+ medziaga.name();
  }







}
