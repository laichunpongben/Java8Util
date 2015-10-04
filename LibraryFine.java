/*
Hackerrank
Algorithms > Warmup > Library Fine
https://www.hackerrank.com/challenges/library-fine/
Test Case #11 Wrong
*/

import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actualReturnDateStr = sc.nextLine();
        String expectedReturnDateStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M y", Locale.ENGLISH);
        LocalDate actualReturnDate = LocalDate.parse(actualReturnDateStr, formatter);
        LocalDate expectedReturnDate = LocalDate.parse(expectedReturnDateStr, formatter);
        
        int fine = computeFine(actualReturnDate, expectedReturnDate);
        System.out.println(fine);
    }
    
    private static int computeFine(LocalDate actualReturnDate, LocalDate expectedReturnDate)
    {
        if (!(actualReturnDate.isAfter(expectedReturnDate))) return 0;
        else if (actualReturnDate.getMonth() == expectedReturnDate.getMonth()) 
            return 15 * actualReturnDate.compareTo(expectedReturnDate);
        else if (actualReturnDate.getYear() == expectedReturnDate.getYear())
            return 500 * (actualReturnDate.getMonthValue() - expectedReturnDate.getMonthValue());
        else return 10000;
    }
}
