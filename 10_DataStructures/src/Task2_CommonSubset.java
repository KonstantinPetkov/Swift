
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNumb = sc.nextInt();
        int secondNumb = sc.nextInt();

        Set<Integer> firstUnorderedSet = new HashSet<>();
        Set<Integer> secondUnorderedSet = new HashSet<>();

        for (int i = 0; i < firstNumb; i++) {
            firstUnorderedSet.add(sc.nextInt());
        }

        for (int i = 0; i < secondNumb; i++) {
            secondUnorderedSet.add(sc.nextInt());
        }

        Set<Integer> set = new HashSet<>(firstUnorderedSet);
        set.retainAll(secondUnorderedSet);

        if (set.isEmpty()) {
            System.out.println("NO");
        } else {
            for (Integer i : set) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
