import java.util.*;
import java.io.InputStream;

public class HelloWorld {
     public int abc(int a, int b){
        return a+b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        HelloWorld obj = new HelloWorld();
        int x = obj.mul(a,b);
        System.out.println("multiplication: " +  x);
        int y = obj.abc(a,b);
        System.out.println("Addition: " +  y);

    }
}