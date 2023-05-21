
package array_java;

public class ARRAY_JAVA 
 {

    /* TYPES OF ARRAY
       * SINGLE DIMESNSION ARRAY
       

    */
    
    public static void main(String[] args)
    
    
    {
       
      /*
        int age[];
        age = new int[4];    //  FIRST TYPE TO REFER AND ASSIGN ARRAY
        
        
        int age1[] = new int[4]; //  SECOND TYPE TO REFER AND ASSIGN ARRAY
        
        age1[0]=11;
        age1[1]=12;
        age1[2]=13;
        age1[3]=14;
        
        
        int age2[] = {21,22,23,24};  //  THIRD TYPE TO REFER AND ASSIGN ARRAY
                
        
                System.out.println("SECOND TYPE");  
                System.out.println(  age1[0] + " " + age1[1] + " " + age1[2] + " " + age1[3]  );
                
                
                System.out.println("THIRD TYPE");
                System.out.println(age2[0] + " " + age2[1] + " " + age2[2] + " " + age2[3]  );
        
        */
        
        
        //         STRING ARRAY
        
        
       /* 
        String Names[] = new String[5];
        
        Names[0]="Shubham";
        Names[1]="SHUBH";
        Names[2]="ShUBHI";
        Names[3]="sHUBHYA";
        Names[4]="SHUBHU";       // FIRST TYPE TO DECLARE STRING ARRAY
        
        
        
        String Fruits[]={"Banana","Apple","Mango"};
        
        System.out.println(Names[1]);
        System.out.println(Fruits[1]);
                
        */
        
        
         // HOW TO  ACCESS ALL ARRAY ELEMENTS IN LOOOP ONE TIME   ( int varibale  )
        
        
        int age2[]  = {1 ,2 , 3 ,4};
        /*
        
           // Firts type to get value
           // for loop
        
        for (int i = 0; i < age2.length; i++) 
        {
            
            System.out.println("YOUR VALUES ARE :- " +age2[i]);
           
        }
        
        */
        
            // second value to get value
            // For Each Loop || Enhance For Loop
            
          /*  
            for(int i : age2)
        
            { 
                System.out.println(" your values are:- " +i);
            
            }
        
        */
        // HOW TO  ACCESS ALL ARRAY ELEMENTS IN LOOOP ONE TIME   ( String varibale  )
        
        
        String Names[] = new String[5];
        
        Names[0]="Shubham";
        Names[1]="SHUBH";
        Names[2]="ShUBHI";
        Names[3]="sHUBHYA";
        Names[4]="SHUBHU";
        
        
        
        String Fruits[]={"Banana","Apple","Mango"};
        
               // first Type 
       /*
               for(int i = 0; i < Names.length ;i++)
        
        {
 
            System.out.println(Names[i]);
        
        }
         */
       
       
              // for each loop
              
            for(String i: Fruits )
            {
                System.out.println(i);
            
            }
              
        
    }
    
}
