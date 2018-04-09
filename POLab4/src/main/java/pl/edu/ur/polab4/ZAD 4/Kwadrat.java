import java.util.*; 
/**
 *
 * @author krzysiek klosek
 * ZAD 4
 */
public class Kwadrat {
    
    public String name;
    public double side;
     Scanner r = new Scanner(System.in);
    
    
    
    public Kwadrat(String name, double side){
       // this.name=name;
       // this.radius=radius;
          System.out.println("Podaj bok");
   this.side = r.nextDouble();
   System.out.println("Podaj nazwe");
  this.name = r.next();
    }
    
    
    public double circa(double side){
      
        return side*4;
    }
    
    
     public double field(double side){
   
        return side*side;
    }
     
     
     public void show(){
         System.out.println(name+"bok: "+side+"\nObwod: "+this.circa(side)+"\nPole: "+this.field(side));
     }
}
