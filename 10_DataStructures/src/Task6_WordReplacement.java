
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6_WordReplacement {

    public static void main(String[] args) {

        Map<String, String> unorderedMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {

            String keys = sc.nextLine();
            String[] split = keys.split(" ");
            unorderedMap.put(split[0].trim(), split[1].trim());
        }

        String[] splitSentence = msg.toLowerCase().split(" ");

        for (int i = 0; i < splitSentence.length; i++) {

            if (unorderedMap.containsKey(splitSentence[i])) {
                splitSentence[i] = unorderedMap.get(splitSentence[i]);
            }
            System.out.print(splitSentence[i] + " ");
        }
    }

}
