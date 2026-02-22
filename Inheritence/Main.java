import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();

        System.out.println("click add:1, sub:2, mul:3, div:4, mod:5, pow:6");
        Advcalculator obj=new Advcalculator();
        int choice =sc.nextInt();
        switch(choice){
            case 1 : System.out.println("Adddintion is :"+ obj.add(a,b));
                          break;
            case 2 : System.out.println("Subtration of two number is : "+obj.sub(a,b));
            break;
            case 3 : System.out.println("Multiplication of the number is : "+ obj.mul(a,b));
            break;

            case 4 : System.out.println("Divison of the number is : "+ obj.div(a,b));
            break;

            case 5 : System.out.println("mod of two number is : "+ obj.mod(a,b));
            break;
            
            case 6 : System.out.println("square of the number is : "+ obj.pow(a));
        }
    }
}
