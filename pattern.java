
import java.util.Scanner;

public class pattern {
    public static void main(String [] args){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Please enter number of lines");
     int n = scanner.nextInt();
        int space = n / 2, string = 1;

        
        for (int i = 1; i <= n; i++) {

      
            for (int j = 1; j <= space; j++)
                System.out.print(" ");

            
            int count = string / 2 + 1;
            for (int k = 1; k <= string; k++) {
                System.out.print(count);
                if (k <= string / 2)
                    count--;
                else
                    count++;
            }

            
            System.out.println();
            if (i <= n / 2) {

                // sp decreased by 1
                // st increased by 2
                space = space - 1;
                string = string + 2;
            }

            else {

                
                space = space + 1;
                string = string - 2;
            }
        }

  
    }}



