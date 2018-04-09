/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Student {
     public String imie;      
    public String nazwisko;
    public int nr_albumu;
     public int rok;
    public String kierunek;
  
    
    
    Student(String imie) {
        this.imie = imie;
        nazwisko = "brak";
         nr_albumu= 0000;
         kierunek = "niepodany";
         rok=0;
        
    }
    
    Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
         nr_albumu= 0000;
         kierunek = "niepodany";
         rok=0;
        
    }
    
    Student(String imie, String nazwisko, int nr_albumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
         this.nr_albumu= nr_albumu;
         kierunek = "niepodany";
         rok=0;
        
    }
        
       Student(String imie, String nazwisko, int nr_albumu, String kierunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
         this.nr_albumu= nr_albumu;
        this.kierunek= kierunek;
        rok=0;
    } 
        
    Student(String imie, String nazwisko, int nr_albumu, String kierunek, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
         this.nr_albumu= nr_albumu;
        this.kierunek= kierunek;
        this.rok=rok;
    }
    
    public void pokazDane() {
        System.out.println("Student");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("nr albumu: " + this.nr_albumu);
        System.out.println("kierunek: " + this.kierunek);
        System.out.println("rok: " + this.rok);
        
    }
}
