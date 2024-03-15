package forlol;

import java.util.Scanner;


public class ForLol {

   
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
  
            int y = 0; 
            
            for(int x = 7546923; x > 0; x = x /10 ){
                y = y + (x%10);
                int b = x %10;
                System.out.println("ito ang b "+b);
                System.out.println("ito ang x "+x);
                System.out.println("ito ang y "+y);
            }
           
       
    }
}
