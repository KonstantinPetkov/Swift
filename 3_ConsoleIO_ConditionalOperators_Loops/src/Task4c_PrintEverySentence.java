

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task4c_PrintEverySentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str = sc.nextLine();

        String delims = ".?!";

        StringTokenizer st = new StringTokenizer(str, delims);
        while (st.hasMoreElements()) {
            System.out.println("Every sentence is: " + st.nextElement());
        }
    }
}
