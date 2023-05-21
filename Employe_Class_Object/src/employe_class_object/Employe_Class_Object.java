
package employe_class_object;

import java.util.Scanner;


public class Employe_Class_Object 
{
       private int Emp_ID;
       private String Emp_Name;
       private String Designation;
       private String Contact;
       private int Salary;
       
       
       public void SetData(int Emp_ID ,String Emp_Name,String Designation,String Contact,int Salary)
       {
       this.Emp_ID = Emp_ID;
       this.Emp_Name = Emp_Name;
       this.Designation = Designation;
       this.Contact = Contact;
       this.Salary = Salary;
       }
       
       public void GetData()
       {
           System.out.println("Employe ID is "+Emp_ID);
           System.out.println("Employe Name is "+Emp_Name);
           System.out.println("Employe Designation is "+Designation);
           System.out.println("Employe ID Contact is "+Contact);
           System.out.println("Employe ID Salary is "+Salary);
           System.out.println(" *-*-*-*-*-*-*-*-*-*-* ");
           
       
          
       }
       
    public static void main(String[] args) 
    
    {
        
        // USING SCANNER
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employye ID");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Employye Name");
        String Name = sc.nextLine();
        
        System.out.println("Enter Employye Designation");
        String designation = sc.nextLine();
        
        System.out.println("Enter Employye Contact");
        String Contact = sc.nextLine();
        
        System.out.println("Enter Employye Salary");
        int Salary = sc.nextInt();
        
        
       
      
        Employe_Class_Object Shubham  = new Employe_Class_Object();
         
        Shubham.SetData(01, "Shubham", "Softwere Devloper", "8830198706", 30000);
        Shubham.GetData();
       
        
        //// USING SCANNER
        
        Employe_Class_Object Sachin  = new Employe_Class_Object();
        
        Sachin.SetData(id,Name,designation,Contact,Salary);
        Sachin.GetData();
        
        
        
        
        
        
        
       
        }
        
    }
        
        
        
    
    

