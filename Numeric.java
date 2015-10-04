import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Numeric {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }
    
    public static BigInteger Factorial(int i)
    {
        return (i <= 1) ? BigInteger.ONE : Factorial(i - 1).multiply(BigInteger.valueOf(i));
    }
}
