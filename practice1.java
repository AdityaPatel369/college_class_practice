package college_class_practice;
import java.util.Scanner;
public class practice1{
    public static void main(String[] args) {
        // 6. Swap two numbers using a temporary variable

        System.out.println("PRACTICE SESSION");
//  swap_using_temp();
//  swap_without_temp();  
// even_odd();

calculator();
  }
  public static void calculator(){
    Scanner input = new Scanner(System.in);
    System.out.println("enter a and b :");
    int a = input.nextInt();
    int b = input.nextInt();
   System.out.println("To solve : 1.add \n 2.sub ");
   int c = input.nextInt();
    switch(c){
        case 1: 
        System.out.println("The sum is : ");
        System.out.print(a+b);
        break;
        case 2: 
        System.out.print("The difference is : ");
        System.out.print(a-b);
        break;
        
 default:
 System.out.println("INVALID INPUT");
    }
    

  }

    public static void swap_using_temp() {
        int a = 12, b = 78;
        int temp ;
        
        temp =a ;
        a = b;
        b = temp ;
        
        System.out.println("a is ");
        System.out.println(a);
        System.out.println("b is ");
        System.out.println(b);

    }
    public static void even_odd (){
           int a = 3;
           if(a%2 == 0){
            System.out.print(a);
            System.out.println(" is even");
           }else{
            System.out.print(a);
            System.out.println(" is odd");
           }
    }

    public static void swap_without_temp(){
        int a = 12, b = 78;
        a = a + b;
        b= a - b;
        a = a - b ;
        System.out.println("a is ");

        System.out.println(a);
        System.out.println("b is ");

        System.out.println(b);        
    }
}