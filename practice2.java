package college_class_practice;

import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        // check_even_odd();
        // positive_negative();
        // vowel();
        // sum_natural_numbers();
        // sum_natural_numbers_while();
        // table_of_5();
        // divisibility_5_11();
        // ascii();
// divisibility_3();
calculator();

    }
    public static void calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a and b :");
        int a = input.nextInt();
        int b = input.nextInt();
       System.out.println("To solve : + - * / ");
      //  int c = input.nextInt();
      char c = input.next().charAt(0);
        switch(c){
            case '+': 
            System.out.println("The sum is : ");
            System.out.print(a+b);
            break;
            case '-': 
            System.out.print("The difference is : ");
            System.out.print(a-b);
            break;
            case '/': 
            System.out.print("The division is : ");
            System.out.print(a/b);
            break;
            case '*': 
            System.out.print("The multiply is : ");
            System.out.print(a*b);
            break;
            
            
     default:
     System.out.println("INVALID INPUT");
        }
        input.close();
        
    
      }
public static void divisibility_3() {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        if(num%3==0){
            System.out.println("The given number is a multiple of 3");
        }else{
            System.out.println("not a multiple of 3");
        }

    
}

   public static void ascii(){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your character");
        char newcharacter = input.next().charAt(0);
        System.out.print("ASCII value of given character is ");
        System.out.println((int)newcharacter);

   }

    public static void divisibility_5_11(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        if(num%5==0){
            System.out.println("The given number is divisible by 5");
        }else{
            System.out.println("not divisible by 11");
        }

        if(num%11==0){
            System.out.println("The given number is divisible by 11");
        }else{
            System.out.println("not divisible by 11");
        }
    }
   public static void table_of_5() {
    System.out.println("Table of 5 :");
        for(int i = 1;i<=12;i++){

            System.out.print("5 * ");
           System.out.print(i);
           System.out.print(" = ");
           System.out.println(5*i);

        }
    
   }


    public static void sum_natural_numbers_while() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number(while loop)");
        int num = input.nextInt();
        int i =1;
        int sum = 0;
        while(i<=num){
            sum = sum + i ;
            i++;
        }
   System.out.println("the sum is ");
   System.out.print(sum);
        
    }

    public static void sum_natural_numbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int sum = 0;
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.print("The sum of first natural numbers : ");
        System.out.println(sum);

    }

    public static void check_even_odd() {

        // q. no. - 1. Check Even or Odd using if-else
        // Input: Any integer
        // Output: "Even" or "Odd"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.print(num);
            System.out.println(" is even no.");
        } else {
            System.out.print(num);
            System.out.println(" is odd number");
        }

    }

    public static void positive_negative() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative number");
        } else if (num == 0) {
            System.out.println("zero");
        }

    }

    public static void vowel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your character");
        char charac = input.next().charAt(0);

        // if (charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u' ||
        //         charac == 'A' || charac == 'E' || charac == 'I' || charac == 'O' || charac == 'U') {
        //     System.out.println(charac + " is a vowel.");
        // } else {
        //     System.out.println((char) charac + " is not a vowel.");
        // }
      
        // switch () {
        // case 'a':

        // break;

        // default:
        // break;
    }

}
