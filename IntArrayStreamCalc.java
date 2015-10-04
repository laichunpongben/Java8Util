//Array Sum using Stream

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class IntArrayStreamCalc {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
        }
        int sum = sumArray(inputs);
        System.out.println(sum);
    }
    
    private static int sumArray(int[] inputs)
    {
        return IntStream.of(inputs).sum();
    }
    
    private static int countArrayPositive(int[] inputs)
    {
        return (int) IntStream.of(inputs).filter(x -> x > 0).count();
    }
    
}
