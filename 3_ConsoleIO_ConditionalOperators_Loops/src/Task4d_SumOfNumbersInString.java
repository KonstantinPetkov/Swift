

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4d_SumOfNumbersInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("The string is: ");
        String str = sc.nextLine();

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        
        int start = 0;
        int sum = 0;
        
        while (m.find(start)) {
            String n = m.group();
            sum += Integer.parseInt(n);
            start = m.end();
        }
        System.out.println(sum);
    }
}
