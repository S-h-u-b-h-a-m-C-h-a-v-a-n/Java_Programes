
package function_java;
import java.util.Scanner;


     // There are Two Type of Function.
     // i] Built in Function or Pre-Defined Function.
     // ii] Custom Function or User-Defined Function. 
           // -> Function With Parameneter
           // -> Without Parameneter
public class Function_Java 
{

    
     void show()  //User-Defined Function   // -> Function With Parameneter  // Takes Nothing Return Nothing  
     
     {
         System.out.println("This is User defined Function With No Parameter");
         System.out.println("This is User defined Function With No Parameter");
         System.out.println("This is User defined Function With No Parameter");
         
     }
     
     int ADD()    //User-Defined Function   // -> Function With Parameneter  // Takes Nothing Return SomeThing  
     
        {
            int a = 20;
            int b = 30;
            int c = a + b;
           return c;
        }
     
     void Sub(int a, int b) //  Formal Arguments or Parameters  //User-Defined Function   // -> Function With Parameneter  // Takes Nothing Return Nothing  
     
       {
           
           int g = a-b;
           System.out.println("Sub Result is"+g);
       }
       
       int Mul(int a , int b)
           {
          
              int u = a * b;
              return u;
            
           }
   
    public static void main(String[] args) 
    
     {
         
         
         Scanner User_input = new Scanner(System.in);
         System.out.println("Enter First Number");
         int Num1= User_input.nextInt();
         
         System.out.println("Enter First Number");
         int Num2 = User_input.nextInt();
         
          
         Function_Java Obj = new Function_Java();
          
         Obj.show();
         
             // two type of print Output
             
         Obj.ADD();
         System.out.println(Obj.ADD());   // i] First 
         
         int z = Obj.ADD();                 // ii] Second
            System.out.println(z);
         
         Obj.Sub(10, 20);
         
        int r = Obj.Mul(Num1,Num2);
         System.out.println("Your Multiplication Output is "+r);
         
     }
    
}
