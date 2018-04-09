
import java.util.Scanner;
/**
 *
 * @author Krzysztof Klosek
 */
//package pl.edu.ur.polab4;

public class stud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        Student student = new Student("Marcin","Chyla",1111,"Informatyka",2);
        Student student1 = new Student("Krzysztof","Klosek", 1223,"Sieci",2);
        Student student2 = new Student("Andrzej","Duda", 1944);
        Student student3 = new Student("Marian");
        Student student4 = new Student("Marcin","Chyla",1111,"Informatyka",2);
        Student student5 = new Student("aa","bb",3333,"Informatyka");
        Student skanowany = new Student("aa");
        student.pokazDane();
        student1.pokazDane();
        student1.nr_albumu=7777;
        student1.pokazDane();
        student2.pokazDane();
        student3.pokazDane();
        student4.pokazDane();
        student5.pokazDane();

       // Scanner klawiatura = new Scanner(System.in);
       // student5.rok = klawiatura.nextInt();
      //  student5.pokazDane();

        System.out.println("Podaj imie: ");
        Scanner imie = new Scanner(System.in);
        skanowany.imie = imie.next();
        //skanowany.pokazDane();
        System.out.println("Podaj nazw: ");
        Scanner nazwisko = new Scanner(System.in);
        skanowany.nazwisko=nazwisko.next();

        System.out.println("Podaj nr_indeksu: ");
        Scanner nr_albumu = new Scanner(System.in);
        skanowany.nr_albumu=nr_albumu.nextInt();

        System.out.println("Podaj kierunek: ");
        Scanner kierunek = new Scanner(System.in);
        skanowany.kierunek=kierunek.next();

         System.out.println("Podaj rok: ");
        Scanner rok = new Scanner(System.in);
        skanowany.rok=rok.nextInt();
        skanowany.pokazDane();
    }
}
