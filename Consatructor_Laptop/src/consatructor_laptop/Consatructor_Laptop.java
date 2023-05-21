
package consatructor_laptop;


public class Consatructor_Laptop {
    String Model;
    String Genration;
    int Price;

   Consatructor_Laptop()
   {
      Model ="HP i5";
      Genration = "9 th";
      Price = 35000;
   }
    
    
    public static void main(String[] args) {
        
        Consatructor_Laptop HP_i5= new Consatructor_Laptop();
        System.out.println(HP_i5.Genration);
        System.out.println(HP_i5.Model);
        System.out.println(HP_i5.Price); 
        
        
    }
    
}
