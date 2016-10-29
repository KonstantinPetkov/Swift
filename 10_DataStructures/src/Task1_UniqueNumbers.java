
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Set<Integer> unorderedSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unorderedSet.add(sc.nextInt());
        }
        
        for(Integer i : unorderedSet){
            System.out.println(i + " ");
        }

    }

}
