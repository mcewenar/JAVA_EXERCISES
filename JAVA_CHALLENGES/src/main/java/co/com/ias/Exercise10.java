package co.com.ias;

import java.util.Scanner;

public class Exercise10 {
    //Create a menu with basic options (add, subtract, exit)

    public static int menuOperation() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        boolean flag = true;
        while(flag){
            System.out.println("1. Adding");
            System.out.println("2. Substraction");
            System.out.println("3. Exit");
            String userInput = myObj.nextLine();

            if(userInput.equals("3")){
                flag = false;
            } else  if(userInput.equals("1")){
                System.out.println("Enter first number: " );
                int sum1 = myObj.nextInt();
                System.out.println("Enter second number: " );
                int sum2 = myObj.nextInt();
                return sum1 + sum2;
            } else if(userInput.equals("2")) {
                System.out.println("Enter first number: " );
                int subs1 = myObj.nextInt();
                System.out.println("Enter second number: " );
                int subs2 = myObj.nextInt();
                return subs2 + subs1;
            } else {
                System.out.println("Wrong input");
            }

        }
        System.out.println("See you next time");
        return -1;
    }
}
