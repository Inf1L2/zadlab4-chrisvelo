/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzysiek
 */
public class Figury {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kolo k = new Kolo("a",2);
        k.circa(3);
        k.show();
        
        Kwadrat kw = new Kwadrat("a",2);
        kw.circa(3);
        kw.show();
        
         Rect pr = new Rect("a",2,3);
        
        pr.show();
    }
    
}
