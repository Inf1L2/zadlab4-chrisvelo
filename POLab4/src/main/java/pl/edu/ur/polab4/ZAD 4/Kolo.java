import java.util.*; 
/**
 *
 * @author krzysiek klosek
 * ZAD 4
 */
public class Kolo {
    
    public String name;
    public double radius;
     Scanner r = new Scanner(System.in);
    
    
    
    public Kolo(String name, double radius){
       // this.name=name;
       // this.radius=radius;
          System.out.println("Podaj promien");
   this.radius = r.nextDouble();
   System.out.println("Podaj nazwe");
  this.name = r.next();
    }
    
    
    public double circa(double radius){
      
        return 2*Math.PI*radius;
    }
    
    
     public double field(double radius){
   
        return Math.PI*radius*radius;
    }
     
     
     public void show(){
         System.out.println(name+"promien: "+radius+"\nObwod: "+this.circa(radius)+"\nPole: "+this.field(radius));
     }
}
