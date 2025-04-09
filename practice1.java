// package college_class_practice;
public class practice1{
    public static void main(String[] args) {
        // 6. Swap two numbers using a temporary variable

        System.out.println("PRACTICE SESSION");
 swap_without_temp();
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