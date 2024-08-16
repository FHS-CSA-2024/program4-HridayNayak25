//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import  java.util.Scanner;
public class program4{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        
        int x = 0;
        int y = 0;
        int z = 0;
        int w = 0;
        int sum = 0;
        int average = 0;
        double average_1 = 0;
        
        System.out.println("x = ");
        x = myScanner.nextInt();
        System.out.println("y = ");
        y = myScanner.nextInt();
        System.out.println("z = ");
        z = myScanner.nextInt();
        System.out.println("w = ");
        w = myScanner.nextInt();
        
        //calculate
        sum = (x+y+z+w);
        average = ((x+y+z+w)/4);
        average_1 = (double) ((x+y+z+w)/4.0);
        
        System.out.println("The sum is: " + sum );
        System.out.println();
        System.out.println("The average is: " + average);
        System.out.println();
        System.out.println("The Decimal average is: " + average_1);
        
        
        
    
        
        
        
        
    }
    
    
    
    

    
}



//Paste console output below:
/*


*/
