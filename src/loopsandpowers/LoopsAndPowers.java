/*
 * Peter Horne-Deus
 * LoopsAndPowers.java
 * gets user input and outputs a number
 * October 19,2018
 */

package loopsandpowers;

//Importing libraries 
import java.util.Scanner;

public class LoopsAndPowers {

    
    public static void main(String[] args) {
        //Creating scanner
        Scanner userImput = new Scanner(System.in);
        
        //Constents
        final double SQUARED = 0;
        final double CUBED = 0;
        
        //Variables
        int userNum,sum;
        int userPower;
        int userOption;
        int repeat = 0;
        
        while (repeat < 1){
        //Code
        System.out.println("Enter A Number As A Choice For One Of The Following Options");
        
        //Options
        System.out.println("1... Calculates a number squared \n"
                + "2... Calculates a number cubed \n"
                + "3... Calculates a number with a power of the users choice \n"
                + "4... Exit");
        userOption = Integer.parseInt(userImput.nextLine());
        //Calculations
        if (userOption == 1){
            System.out.println("Enter A Number");
            userNum = Integer.parseInt(userImput.nextLine());
            for (int i = 0; i <= SQUARED; i = i + 1 ){
                userNum = userNum * userNum;
            }
            System.out.println("The Total Is: " + userNum);
        }
        else if (userOption == 2){
            System.out.println("Enter A Number");
            userNum = Integer.parseInt(userImput.nextLine());
            for (int i = 0; i <= CUBED; i = i + 1 ){
                userNum = userNum * userNum * userNum;
            }
            System.out.println("The Total Is: " + userNum);
        }
        else if (userOption == 3){
            sum = 1;
            System.out.println("Enter A Number");
            userNum = Integer.parseInt(userImput.nextLine());
            System.out.println("Enter A Power");
            userPower = Integer.parseInt(userImput.nextLine());
            for (int i = 0; i <= userPower - 1; i = i + 1 ){
                sum = sum * userNum;
            }
            System.out.println("The Total Is: " + sum);
        }
        else if (userOption == 4){
            System.out.println("Goodbye!");
            repeat = 5;
        }
        else {
            System.out.println("Enter a valid Operator");
            System.out.println("System will restart");
        }
        
        }
    }
    
}
