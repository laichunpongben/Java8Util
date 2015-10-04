//Array Sum using Stream

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class StreamArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputs = new int[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextInt();
        }
        int sum = IntStream.of(inputs).sum();
        System.out.println(sum);
    }
}
