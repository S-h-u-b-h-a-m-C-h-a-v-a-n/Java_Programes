
 
package multi_dimensional_array_with_scanner;
import java.util.Scanner;

public class Multi_Dimensional_Array_With_Scanner 

{

    
    public static void main(String[] args) 
    {
        //  INTIALIZING 2D ARRAY WITH USER INPUT USING LOOPS 
        
        Scanner User_Input = new Scanner(System.in);
        
        int Arr [][] = new int [3][3];
        int f = 0;
          
        
        for (int row = 0; row < 3; row++) 
        
        {
            for (int col = 0; col < 3; col++) 
            
            { 
                System.out.println("Enter Age of Student "+ ++f);
                Arr[row][col] = User_Input.nextInt();
                
                
            }
           
           
            
        }
            int g = 0;
            
            for (int j = 0; j < 3; j++) 
            {
                 for (int k = 0; k < 3; k++) 
                 
                {
                    System.out.println("Age Of The Student on Location :- " + ++g + " And Age is:-  " +Arr[j] [k]);
                    
                }
            
            
            }
            
        
        
    }
    
}
