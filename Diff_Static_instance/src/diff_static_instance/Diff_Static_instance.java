/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// WE WILL TAKE EXAMPLE SCHOOL TO UNDERSTAND 



package diff_static_instance;

/**
 *
 * @author HP
 */
public class Diff_Static_instance {

    int roll;     // instance varibale
    String Name;  // instance varibale
    int Standard; // instance varibale
   
    static String schoolname = " SGM SCHOOL ";  // Static Variable Cant Change 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        Diff_Static_instance Shubham = new Diff_Static_instance();
        Shubham.Name= "Shubham Chavan";
        Shubham.Standard = 15;
        Shubham.roll = 03;
     
          
        
        Diff_Static_instance Sachin = new Diff_Static_instance();
        Sachin.Name= "Sachin Chavan";
        Sachin.Standard = 25;
        Sachin.roll = 04;
       
        
        System.out.println(Shubham.Name + " " + schoolname); // DIRECT CALLING of static varibale
        System.out.println(Sachin.Name  + " " + Diff_Static_instance.schoolname); //CALLING FROM CLASS NAME of (for static varibale)
        
        
        
        
    }
    
}
