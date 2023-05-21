
package nested_for_loop;


public class Nested_For_Loop {


    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        for(int i = 1; i<=3; i++)
        {
            
            System.out.println("THIS IS OUTER FOR LOOP !!!!!!"+i);   
            
              for(int j =1;j<=3;j++)
                  
              {
              
                  System.out.println("THIS IS INNER FOR LOOP"+i);
              
              }
         
        }
    }
    
}
