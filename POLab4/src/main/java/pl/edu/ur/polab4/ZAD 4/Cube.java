import java.util.*; 
/**
 *
 * @author krzysiek klosek
 * ZAD 4
 */
public class Cube {
    
    public String name;
    public double side;
    //public double side1;
     Scanner r = new Scanner(System.in);
    
    
    
    public Cube(String name, double side){
       // this.name=name;
       // this.radius=radius;
          System.out.println("Podaj bok");
   this.side = r.nextDouble();
   //System.out.println("Podaj bok2");
 //  this.side1 = r.nextDouble();
   System.out.println("Podaj nazwe");
  this.name = r.next();
    }
    
    
    public double circa(double side){
      
        return side*side*6.0D;
    }
    
    
     public double bulk(double side){
   
        return side*side*side;
    }
     
     
     public void show(){
         System.out.println(name+"bok: "+side+"\nObwod: "+this.circa(side)+"\nObjetosc: "+this.bulk(side));
     }
}
