import java.util.Scanner;

/**
 *
 * @author krzysiek
 */
public class stud {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
      edit e1 = new edit();
      e1.obj();
      int k;
      do{
        
        System.out.println("OPCJE DO WYBORU");
        System.out.println("1-wprowadzanie danych studenta pod wybrany index tablicy");
        System.out.println("2-edycja (nadpisanie danych studenta) spod wybranego indeksu");
        System.out.println("3-usun dane studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi)");
        System.out.println("4-wyświetlenie obiektu o danym indeksie");
        System.out.println("5-wyświetlenie wszystkich obiektów");
        System.out.println("6-wyświetlenie zakresu obiektów w podanym zakresie");
        System.out.println("7-koniec programu");
        Scanner wyb = new Scanner(System.in);
         k = wyb.nextInt();
         
         switch(k){
             case 1:
                e1.wpisz();
                 break;
             case 2:
                 e1.edytuj();
                 break;
             case 3:
                 e1.usun();
                 break;
             case 4:
               e1.wydrukuj();
                 break;
             case 5:
             e1.showall();
                 break;
             case 6:
                 e1.czesc();
                 break;             
             default:
                 System.out.println("Niepoprawny klawisz");
         }      
    }while(k!=7);
    
     
}
}