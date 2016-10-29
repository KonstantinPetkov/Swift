

import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonCharacteristics {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //insert the number of persons
        System.out.print("Number of persons: ");        
        int persons = sc.nextInt();
        double[] grades = new double[4];  
        String firstName;
        String surName;
        char gender;
        int yearOfBirth = 0;
        int age = 2016 - yearOfBirth;
        float weight = 0.0f;
        int height = 0;
        String prof;
        double result = 0.0;

        for (int i = 0; i < persons; i++) {
            System.out.printf("Person %d ", i + 1);
            Pattern patternFirst = Pattern.compile("[a-zA-Z]+");

            //firstName
            System.out.print("\nFirst name: ");            
            do {
                firstName = sc.nextLine();
            } while (!patternFirst.matcher(firstName).matches());
            
            //surName            
            Pattern patternSur = Pattern.compile("[a-zA-Z]+");
            System.out.print("Surname: ");
            do {
                surName = sc.nextLine();
            } while (!patternSur.matcher(surName).matches());
            
            //gender
            System.out.print("Gender: ");            
            do {
                gender = sc.next().charAt(0);
            } while (gender != 'F' && gender != 'M');
            
            //yearOfBirth
            System.out.print("Year of birth: ");            
            do {
                yearOfBirth = sc.nextInt();
            } while (yearOfBirth <= 1000);
            
            //weight
            System.out.print("Weight: ");
            do {
                weight = sc.nextFloat();
            } while (weight <= 0.0);

            //height
            System.out.print("Height: ");
            do {
                height = sc.nextInt();
            } while (height <= 0);
            
            //proffesion            
            Pattern profPattern = Pattern.compile("[a-zA-z]+");
            System.out.print("Profession: ");
            do {
                prof = sc.nextLine();
            } while (!profPattern.matcher(prof).matches());
            
            //grades
            System.out.print("Grades: ");            
            for (int j = 0; j < 4; j++) {
                do {
                    grades[j] = sc.nextFloat();
                } while (grades[j] < 2.0 || grades[j] > 6.0);
                result += grades[j];
            }
            
            result = result / 4.0;
            if (gender == 'M') {
                if (yearOfBirth >= 1999) {
                    System.out.printf("%s %s is %d years old. He was born in %d. "
                            + "His weight is %.1f and he is %d cm tall. "
                            + "He is a %s with an average grade of %.3f. %s %s is under-aged.", 
                            firstName, surName, age, yearOfBirth, weight, height, prof, result, firstName, surName);
                }
                if (yearOfBirth < 1999) {
                    System.out.printf("%s %s is %d years old. He was born in %d. "
                            + "His weight is %.1f and he is %d cm tall. "
                            + "He is a %s with an average grade of %.3f.", 
                            firstName, surName, age, yearOfBirth, weight, height, prof, result);
                }
            }
            if (gender == 'F') {
                if (yearOfBirth >= 1999) {
                    System.out.printf("%s %s is %d years old. She was born in %d. "
                            + "Her weight is %.1f and she is %d cm tall. "
                            + "She is a %s with an average grade of %.3f. %s %s is under-aged.", 
                            firstName, surName, age, yearOfBirth, weight, height, prof, result, firstName, surName);
                }
                if (yearOfBirth < 1999) {
                    System.out.printf("%s %s is %d years old. She was born in %d. "
                            + "Her weight is %.1f and she is %d cm tall. "
                            + "She is a %s with an average grade of %.3f.", 
                            firstName, surName, age, yearOfBirth, weight, height, prof, result);
                }
            }
            System.out.println();
        }
    }
}
