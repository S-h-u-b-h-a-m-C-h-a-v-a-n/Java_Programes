/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guess_number_mini_project;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GUESS_NUMBER_MINI_PROJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int MyNumber = (int)(Math.random()*100);
        int userNumber = 0;
        
        do
        {
        
                    System.out.println(" Gueess a Number 1 - 100  ");
                    
                    userNumber = sc.nextInt();
                    
                    if(userNumber == MyNumber )
                    {
                    
                        System.out.println(" ohhh Correct Guess   ");
                       break;
                    }
                    
                    else if(userNumber > MyNumber)
                    {
                        System.out.println(" YouR Nummber is Large");
                    }
                    else if(userNumber < MyNumber)
                    {
                        System.out.println(" YouR Nummber is Small");
                    }
        } 
        
        
        
        while(userNumber >= 0);
        
        
        System.out.println(" My Number Was");
        System.out.println(MyNumber);
        
        
        
        
        
    }
    
}
