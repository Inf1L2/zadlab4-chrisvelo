import java.util.Scanner;

/**
 *
 * @author krzysiek
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
    
    public String getImie(){
        return this.imie;
    }
    
    public void setImie(String imie){
        this.imie=imie;
    }
    
    public String getNazwisko(){
        return this.nazwisko;
    }
    
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    
    public String getKierunek(){
        return this.kierunek;
    }
    
    public void setKierunek(String kierunek){
        this.kierunek=kierunek;
    }
    
    
    public int getNr_albumu(){
        return this.nr_albumu;
    }
    
    public void setNr_albumu(int nr_albumu){
        this.nr_albumu=nr_albumu;
    }
    
    
     public int getRok(){
        return this.rok;
    }
    
    public void setRok(int rok){
        this.rok=rok;
    }
    
    public void pokazDane() {
        System.out.println("Student");
        System.out.print("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("nr albumu: " + this.nr_albumu);
        System.out.print("kierunek: " + this.kierunek);
        System.out.println("rok: " + this.rok);
        
    }
}