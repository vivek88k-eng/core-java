import java.util.Scanner;

public class OperaterQuestions{
    static Scanner sc =new Scanner(System.in);
    static void q1(){
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(n%2 == 0 ? "Even": "odd");
    }
    static void q2(){
        System.out.println("Enter two number");
        int a =sc.nextInt(), b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Largest = " + max);
    }
    static void q3(){
        System.out.println("Enter the two number");
        int a = sc.nextInt(), b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swap:a=" + a + " b=" +b);
    }
    static void q4(){
        System.out.println("Enter your year");
        int y = sc.nextInt();
        boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        System.out.println(leap ? "Leapyear" : "Not Leap Year");
    }
       static void q5(){
           System.out.println("Enter divinded and divisor:");
           int a = sc.nextInt(), b = sc.nextInt();
           System.out.println("Quotient = " + (a /b));
           System.out.println("Remnder = " + (a % b));
       }
       static void q6 (){
           System.out.println("Enter the Three number");
           int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
           int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
           System.out.println("Maximum " + max);
       }

    static void q14(){
        System.out.println("Enter a number");
        int n= sc.nextInt();
        String res= (n> 0) ? "+tive" : (n < 0 ? "-tive" : "Zero");
        System.out.println(res);
    }
static void q18(){
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int max = 0;
    while (n > 0){
        int d = n% 10;
        if(d > max) max = d;
        n/= 10;
    }
    System.out.println("Largest digit = " + max);
}
static void q20(){
    System.out.println("Enter number");
    int n = sc.nextInt();
    System.out.println((n%3 == 0 && n%5 ==0) ? "By both" : "BY None");
}
static void q8() {
    System.out.println("Enter number");
    int n = sc.nextInt();
    int abs = (n < 0) ? -n : n;
    System.out.println("Absolute value =" + abs);

}
static void q17() {
        int a = 1;
        a += 4;
    System.out.println("a+=4 => " + a);
    a -= 3;
    System.out.println("a-=3 => " + a);
    a *= 2;
    System.out.println("a*=2 =>" + a);
    a /= 4;
    System.out.println("a/=4 => " + a);
}
static void q12() {
        int a = 0;
        if (a != 0 && 10/a >1){
            System.out.println("thisn will not print");
        }
    System.out.println("short circuit worked safely!");
}
static void q7() {
        int a = 5;
    System.out.println("Pre-increment" + (++a));
    a = 5;
    System.out.println("Post-increment " +(a++));
    System.out.println("After postincrement value " + a);
}
public static void main(String[] args){

}
}
