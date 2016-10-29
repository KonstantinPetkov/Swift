package Task1_PeoplePresentation;

import java.util.Scanner;

public class PeoplePresentation {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String string;
        
        while(!(string = sc.nextLine()).equals("END")){
            String[] arr = string.split(" ");
            String fName = arr[0].trim();
            String lName = arr[1].trim();
            
            Person person = null;
            
            if(arr.length == 5) {
                String fNumb = arr[2].trim(); 
                int lectureCount = Integer.parseInt(arr[3].trim());
                int exerciseCount = Integer.parseInt(arr[4].trim());
                
                person = new Student(fName, lName, fNumb, lectureCount, exerciseCount);
                
            } else {
                double weekSalary = Double.parseDouble(arr[2].trim());
                double workHoursPerDay = Double.parseDouble(arr[3].trim());
                
                person = new Worker(fName, lName, weekSalary, workHoursPerDay);
            }
            System.out.println(person.getInfo());
            System.out.println();
        }
        
    }
    
}
