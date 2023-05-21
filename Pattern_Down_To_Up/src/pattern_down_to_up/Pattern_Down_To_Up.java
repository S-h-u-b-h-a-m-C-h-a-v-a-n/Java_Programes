
package pattern_down_to_up;


public class Pattern_Down_To_Up {

    
    
    public static void main(String[] args) {
        
        
        
        Pattern1(4);
        
    }
    
    static void Pattern1(int n){
        
        for (int Row =0; Row <=4; Row++) 
        {
            
            for (int Col = 0; Col <=n-Row-1; Col++) {
               System.out.print("*"); 
            }
            System.out.println();
        }
        
     
        
    }
    
}
