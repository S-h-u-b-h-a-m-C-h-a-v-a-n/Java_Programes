
package decision_making_statment;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Decision_Making_Statment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*     int z = 20;
        
        if(z < 10)
        {
            System.out.println(" Value Is Greater");
        }
        else
        {
            System.out.println(" Your Value is Leser");
    }
        
             / String  ***
    */
    
     /*   String name = "Sachin" ;
                if(name == "Shubham")
        {
            System.out.println(" Yes Its Your Name "  +name);
            
        }
        else
        {
            System.out.println("Sorry Its Not Your Name ");
        }
      */
     
     
     // if else if
     
   /*  int percentage = 75;
       
     if(percentage >= 80)
     {
         System.out.println(" A Grade");
     }
     else if(percentage >= 70)  
     {
         System.out.println(" B Grade  ");
     }
     else if(percentage >=60 )
     {
         System.out.println(" C Grade  ");
     }
     
     else
     {
         System.out.println(" You are Fail ");
     }
     
     */
       // NESTED IF 
       
       
     /* int x = 30;
      if(x > 30)
              {
                  if (x ==40)
                  {
                      System.out.println("  Your Value is 40");
                  }
                  else
                  { 
                      System.out.println("  Value is Not 40");
                  }
              }
      
      */
      
         // Nested Switch 
         
         
        /* 
         String pizza = "Vegitable";
         String veg = "Olives";
         switch (pizza)
         {
             case "Tikka":
                 System.out.println("Your Selected Tikka Pizzza");
                 break;
                 case "Fazita":
                 System.out.println("Your Selected Fazita Pizzza");
                 break;
                 case "Cheese":
                 System.out.println("Your Selected Tikka Pizzza");
                 break;
                 
                 
                 case "Vegitable":
                 System.out.println("Your Selected Vegitables");
                 
                 switch (veg)
                 {
                     case "Potato":
                         System.out.println("Your Selected Potatto Vegitable in Your Pizza");
                             break;
                              case "Tommato":
                         System.out.println("Your Selected Tomamato Vegitable in Your Pizza");
                             break;
                              case "Olives":
                         System.out.println("Your Selected Olives Vegitable in Your Pizza");
                             break;
                              default:
                                  System.out.println("Vegitable Not Avaliable");
                                  break;
                 }
                 
                 break;
                 default:
                     System.out.println("Flaour Not Available !!");
                     break;
         }
                  
      */
                       System.out.println("Enter a Number");
        Scanner input = new Scanner(System.in);
        
        int c = input.nextInt();
        System.out.println(c);
          
    
    }
    
    
}
