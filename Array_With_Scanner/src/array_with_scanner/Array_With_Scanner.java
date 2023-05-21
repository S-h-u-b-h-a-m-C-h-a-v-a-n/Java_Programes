
package array_with_scanner;
import java.util.Scanner;


public class Array_With_Scanner 

{

    
    public static void main(String[] args) 
    
   
    {
        // INTIALIZING ARRAY WITH USER INPUT 
        
        Scanner User_Input = new Scanner(System.in);
        
/*        
         int Arr[] = new int[5];
         int f = 0;
         
         for (int i = 0; i < 5; i++) 
         {   
             
             System.out.println("Enter a Age Of Student :- "+ ++f);
             
             Arr[i] = User_Input.nextInt();
            
         
         }
             
            int  g = 0;
             for(int j=0; j < 5 ; j++)
             {
                 System.out.println("You Enters Age of Student ON Location Number is :- "+ ++g + " And Age is  " + Arr[j]);
               }
      */       
             
              String Names_Arr[] = new String[5];
         int f = 0;
         
         for (int i = 0; i < 5; i++) 
         {   
             
             System.out.println("Enter a Name Of Student :- "+ ++f);
             
             Names_Arr[i] = User_Input.nextLine();
            
         
         }
             
            int g = 0;
             for(int j=0; j < 5 ; j++)
             {
                 System.out.println("You Enters Name of Student ON Location Number is :- "+ ++g + " And Age is  " + Names_Arr[j]);
               }
         
         
         
         
         
                
        
    }
    
}
