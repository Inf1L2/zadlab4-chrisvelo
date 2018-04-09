import java.util.*; 
/**
 *
 * @author krzysiek klosek
 * ZAD 4
 */
public class Rect {
    
    public String name;
    public double side;
    public double side1;
     Scanner r = new Scanner(System.in);
    
    
    
    public Rect(String name, double side,double side1){
       // this.name=name;
       // this.radius=radius;
          System.out.println("Podaj bok");
   this.side = r.nextDouble();
   System.out.println("Podaj bok2");
   this.side1 = r.nextDouble();
   System.out.println("Podaj nazwe");
  this.name = r.next();
    }
    
    
    public double circa(double side,double side1){
      
        return side*2 + side1*2;
    }
    
    
     public double field(double side,double side1){
   
        return side*side1;
    }
     
     
     public void show(){
         System.out.println(name+"bok: "+side+"\nObwod: "+this.circa(side,side1)+"\nPole: "+this.field(side,side1));
     }
}
