import java.util.Scanner;

/**
 *
 * @author krzysiek
 */
public class edit {
    Scanner wpr;
    Student[] tablica;
    
    
    public edit(){
        this.wpr = new Scanner(System.in);
        this.tablica = new Student[100];
    }
    
    public void obj(){
        for(int i=0;i<100;i++){
            this.tablica[i] = new Student("","",0,"",0);
        }
    }
    
    
    public void wpisz(){
        System.out.println("Podaj numer indeksu w tablicy: ");
        int n = this.wpr.nextInt();
        System.out.print("Podaj imie: "); this.tablica[n].setImie(this.wpr.next());
        System.out.print("Podaj nazwisko: "); this.tablica[n].setNazwisko(this.wpr.next());
        System.out.print("Podaj kierunek: "); this.tablica[n].setKierunek(this.wpr.next());
        System.out.print("Podaj nr albumu: "); this.tablica[n].setNr_albumu(this.wpr.nextInt());
        System.out.print("Podaj rok: "); this.tablica[n].setRok(this.wpr.nextInt());
    }
    
    
    public void edytuj(){
        System.out.println("Podaj numer indeksu w tablicy: ");
        int n = this.wpr.nextInt();
         System.out.println("Wpisane imie: "+this.tablica[n].getImie());
        System.out.print("Podaj nowe imie: "); this.tablica[n].setImie(this.wpr.next());
         System.out.println("Wpisane nazwisko: "+this.tablica[n].getNazwisko());
        System.out.print("Podaj nowe nazwisko: "); this.tablica[n].setNazwisko(this.wpr.next());
         System.out.println("Wpisany kierunek: "+this.tablica[n].getKierunek());
        System.out.print("Podaj nowe kierunek: "); this.tablica[n].setKierunek(this.wpr.next());
         System.out.println("Wpisany album: "+this.tablica[n].getNr_albumu());
        System.out.print("Podaj nowe nr albumu: "); this.tablica[n].setNr_albumu(this.wpr.nextInt());
             System.out.println("Wpisany rok: "+this.tablica[n].getRok());
        System.out.print("Podaj nowe rok: "); this.tablica[n].setRok(this.wpr.nextInt());
    }
    
    public void usun(){
         System.out.println("Podaj numer indeksu w tablicy: ");
        int n = this.wpr.nextInt();
        this.tablica[n].setImie("");
        this.tablica[n].setNazwisko("");
        this.tablica[n].setKierunek(""); 
        this.tablica[n].setNr_albumu(0);
        this.tablica[n].setRok(0);
    }
    
    public void wyswietl(int i){
        System.out.println("Student"+i);
        System.out.print("imię: " + this.tablica[i].getImie());
        System.out.println("  nazwisko: " + this.tablica[i].getNazwisko());
        System.out.println("nr albumu: " + this.tablica[i].getNr_albumu());
        System.out.print("kierunek: " + this.tablica[i].getKierunek());
        System.out.println("  rok: " + this.tablica[i].getRok());
    }
    
    public void wydrukuj(){
        System.out.println("Podaj numer indeksu w tablicy: ");
        int n = this.wpr.nextInt();
        this.wyswietl(n);
    }
    
    
    public void showall(){
        for(int i=0; i<100;i++){
            this.wyswietl(i);
        }
    }
    
    public void czesc(){
        System.out.println("Podaj numer indeksu w tablicy: ");
        int a = this.wpr.nextInt();
        System.out.println("Podaj numer indeksu w tablicy: ");
        int b = this.wpr.nextInt();
        
        
        for(int i=a; i<=b;i++){
            this.wyswietl(i);
    }
}
}