/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package local_instance_variable;

/**
 *
 * @author HP
 */
public class Local_Instance_Variable {

    
    int z = 25;  // Instance Variable But Before you use you have to declare Object of class (declared on Line 22)
    
    public void MyFunction()
    {
       int a = 10;
        System.out.println(a);
        System.out.println(z);
         
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //  int a =30;    // LOCAL VARIABLE
       Local_Instance_Variable obj_Name = new Local_Instance_Variable();
       
       
       // System.out.println(   obj_Name.z);
        obj_Name.MyFunction();
       
    }
    
    
    
    
    
    
}
