
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class Task4_CountryTour {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String numb = sc.nextLine();
        
        Queue<Integer> distance = new ArrayDeque<>();
        Queue<Integer> amountFood = new ArrayDeque<>();
        
        int city = Integer.parseInt(numb);
                
        for (int i = 0; i < city; i++) {
            String str = sc.nextLine();
            String[] split = str.split(" ");
            distance.add(Integer.parseInt(split[0]));
            amountFood.add(Integer.parseInt(split[1]));
        }
        
    }
    
}
