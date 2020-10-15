package eif.viko.lt;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Sandelys {
  private String pavadinimas;
  private List<Baldas> baldai = new ArrayList<>();

  public Sandelys(String pavadinimas) {
    this.pavadinimas = pavadinimas;
  }

  public void idetiBalda(Baldas baldas) {
    baldai.add(baldas);
  }

  public void idetiBalda() {
    Scanner scanner = new Scanner(System.in);
    int id = 0;
    String pavadinimas;
    int input = 0;

    System.out.println("======================Baldo įvedimas===================================");

    System.out.println("Įveskite id:");
    id = scanner.nextInt();

    System.out.println("Įveskite pavadinima:");

    pavadinimas = scanner.nextLine();
    pavadinimas = scanner.nextLine();

    System.out.println("==========================Medžiagų sąrašas===========================");
    System.out.println("1. Mediena.");
    System.out.println("2. Plastikas.");
    System.out.println("3. Geležis.");
    System.out.println("Pasirinkite medžiagą:");

    try {
      input = scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Iveskite skaiciu!");
    }


    switch (input) {
      case 1:
        idetiBalda(new Baldas(id, pavadinimas, Medziaga.MEDIENA));
        break;
      case 2:
        idetiBalda(new Baldas(id, pavadinimas, Medziaga.PLASTIKAS));
        break;
      case 3:
        idetiBalda(new Baldas(id, pavadinimas, Medziaga.GELEZIS));
        break;
      default:
        System.out.println("Bloga ivestis!!!");
        break;
    }


  }

  public void spausdintiBaldus() {
    for (Baldas baldas : baldai) {
      System.out.println(baldas);
    }
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

  public void issaugotiFaile() {
    try {
      FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
      ObjectOutputStream o = new ObjectOutputStream(f);

      for (Baldas baldas : baldai) {
        o.writeObject(baldas);
      }
      o.close();
      f.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("Error initializing stream");
    }
  }

  public void uzkrautiIsFailo() {

    try {


      FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
      ObjectInputStream oi = new ObjectInputStream(fi);


      for (Baldas baldas : baldai) {
        System.out.println(oi.readObject());
      }





      // Read objects
//      Person pr1 = (Person) oi.readObject();
//      Person pr2 = (Person) oi.readObject();
//
//      System.out.println(pr1.toString());
//      System.out.println(pr2.toString());

      oi.close();
      fi.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("Error initializing stream");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }


  @Override
  public String toString() {
    return "Sandelys{" +
        "pavadinimas='" + pavadinimas + '\'' +
        ", baldai=" + baldai +
        '}';
  }
}
