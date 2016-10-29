package Task2_UniversityManagement;

import java.util.*;

public class UniversityManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string;

        Person[] people = new Person[500];
        int peopleCount = 0;
        double balance = 500;

        while (!(string = sc.nextLine()).equalsIgnoreCase("END")) {
            String[] arr = string.split(" ");
            String command = arr[0].trim();

            switch (command.toUpperCase()) {
                case "NEW": {
                    String occupation = arr[1].trim();
                    String name = arr[2].trim();
                    String phoneNumber = arr[3].trim();
                    
                    switch (occupation.toUpperCase()) {
                        case "MAINT":{
                            people[peopleCount++] = new MaintenanceEmployee(name, phoneNumber);
                            break;
                        }
                        case "ADIMN":{
                            String[] subjects = Arrays.copyOfRange(arr, 4, arr.length - 1);
                            people[peopleCount++] = new AdministrationEmployee(name, phoneNumber, subjects);
                            break;
                        }
                        case "TEACH":{
                            String[] subjects = Arrays.copyOfRange(arr, 4, arr.length - 1);
                            people[peopleCount++] = new Teacher(name, phoneNumber, subjects);
                            break; 
                        }
                        case "STUD":{
                            String fNumber = arr[4].trim();
                            String[] subjects = Arrays.copyOfRange(arr, 4, arr.length - 1);
                            people[peopleCount++] = new Student(name, phoneNumber, fNumber, subjects);
                            break;
                        }
                    }
                }
                break;
                
                case "WORK":{
                    String name = arr[1].trim();
                    Person person = findPerson(name, people, peopleCount);
                    balance += person.work(people, peopleCount);
                    
                    if(balance < 0){
                        System.out.println("Bankrupcy");
                        return;
                    }
                    
                    for(int i = 0 ; i < peopleCount; i++){
                        if(people[i].getTolerance() <= 0){
                            System.out.println(people[i].getName() + " is not happy.");
                            return;
                        }
                    }
                    break;
                }
                case "IDLE":{
                    
                    for(int i = 0 ; i < peopleCount; i++){
                        people[i].decreaseTolerance(5);
                        if(people[i].getTolerance() <= 0){
                            System.out.println(people[i].getName() + " is not happy.");
                            return;
                        }
                    }
                    break;
                }                    
            }
        }
        
        System.out.println(balance);
    }

    private static Person findPerson(String name, Person[] people, int peopleCount) {
        for(int i = 0 ; i < peopleCount; i++){
            if(people[i].getName().equals(name))
                return people[i];
        }
        
        return null;
    }
}//class UniversityManagement
