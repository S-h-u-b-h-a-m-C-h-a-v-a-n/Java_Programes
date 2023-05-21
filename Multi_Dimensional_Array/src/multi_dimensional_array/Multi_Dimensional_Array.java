
package multi_dimensional_array;


public class Multi_Dimensional_Array 
{
         // Multi-Dimensiional Array
    
    public static void main(String[] args) 
    
    {
        
            // First Type To Declare Array
        
         /*
           int age[][] = new int [3][4];
           
           age [0][0] = 11;
           age [0][1] = 22;
           age [0][2] = 33;
           age [0][3] = 44;
           
           age [1][0] = 111; 
           age [1][1] = 222;
           age [1][2] = 333;
           age [1][3] = 444;
           
           age [2][0] = 1111;
           age [2][1] = 2222;
           age [2][2] = 3333;
           age [2][3] = 4444;
           
           System.out.println(age[0][1]);
        */
         
                  // Second Type
        
        
        int age [][] =
        {
                {11,22,33,44},
                {111,222,333},
                {1111,2222,3333}
        };
           //System.out.println(age[2][2]);
        
        
         // FOR STRING
        
        
        
      /*     String Name[][] = new String [3][4];
           
           Name [0][0] = "Shubham";
           Name [0][1] = "Sachin";
           Name [0][2] = "Ashwin";
           Name [0][3] = "Sanket";
           
           
           Name [1][0] = "Shubham 2";
           Name [1][1] = "Sachin  2";
           Name [1][2] = "Ashwin  2";
           Name [1][3] = "Sanket  2";
           
           
           Name [2][0] = "Shubham 3";
           Name [2][1] = "Sachin  3";
           Name [2][2] = "Ashwin  3";
           Name [2][3] = "Sanket  3";
           
           
           
           System.out.println(Name[0][1]);
           
         */
                  // Second Type
        
        /*
        String Name [][] =
        {
                {"Shubham","Sachin","Ashwin","Sanket"},
                {"Shubham2","Sachin2","Ashwin2","Sanket2"},
                {"Shubham3","Sachin3","Ashwin3","Sanket3"},
        };
           System.out.println(Name[2][2]);
        */
        
       // HOW TO  ACCESS ALL MULTI-DIMENSIONAL ARRAY ELEMENTS IN LOOOP ONE TIME   ( int varibale  ) 
        
      
       //for loop
       /*
        for (int row = 0; row < 3; row++) 
        {
            for (int col = 0; col < 4; col++) 
            {
                System.out.println(age[row][col]);
            }
        }
        */     

                // for each Loop
                
                  for(int i[]: age)
                  {
                           for (int j : i ) 
                           {
                                System.out.println(j);
                           }
                  }
        
                  
                  
                  
                  
                  // SAME GOES TO STRING ARRAY
                  
                  
        
    }
    
}
