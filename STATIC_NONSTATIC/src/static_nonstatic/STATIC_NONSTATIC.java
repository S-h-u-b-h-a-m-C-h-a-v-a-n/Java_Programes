/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package static_nonstatic;

/**
 *
 * @author HP
 */
public class STATIC_NONSTATIC {
int x = 20;
static int y = 30;



void show()
       {
           System.out.println(x+y);
       
       }


static void show2()
        {
            STATIC_NONSTATIC obj = new STATIC_NONSTATIC(); 
            System.out.println(obj.x);
        }
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // We Can Call static varible by two types first using instence(object) second direct
        STATIC_NONSTATIC.show2(); //with object
        show2(); // direct
         
        STATIC_NONSTATIC Obj_ins = new STATIC_NONSTATIC();
        
        Obj_ins.show();
        
        
        
    }
    
}
