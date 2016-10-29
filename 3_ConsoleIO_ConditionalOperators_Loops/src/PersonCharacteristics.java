

import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //insert the number of persons
        System.out.print("Number of persons: ");
        int persons = sc.nextInt();
        sc.nextLine();

        for (int a = 0; a < persons; a++) {

            System.out.println("Person " + (a + 1) + ":");

            //fisrtName
            System.out.print("First name: ");
            String firstName = sc.nextLine();
            char[] charArr = firstName.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (((charArr[i] != 32) && (charArr[i] != 45) && (charArr[i] < 65)) || ((charArr[i] > 90)
                        && (charArr[i] < 97)) || (charArr[i] > 122)) {
                    System.out.println("Error type of data! Try again.");
                    firstName = sc.nextLine();
                    charArr = firstName.toCharArray();
                    i = 0;
                }
            }

            //surName
            System.out.print("Surname: ");
            String surName = sc.nextLine();
            char[] charArr2 = surName.toCharArray();
            for (int i = 0; i < charArr2.length; i++) {
                if (((charArr2[i] != 32) && (charArr2[i] != 45) && (charArr2[i] < 65)) || ((charArr2[i] > 90)
                        && (charArr2[i] < 97)) || (charArr2[i] > 122)) {
                    System.out.println("Error type of data! Try again.");
                    surName = sc.nextLine();
                    charArr2 = surName.toCharArray();
                    i = 0;
                }
            }

            //yearOfBirth
            System.out.print("Year of birth: ");
            String yearOfBirth = sc.nextLine();
            char[] charArrYear = yearOfBirth.toCharArray();
            for (int i = 0; i < charArrYear.length; i++) {
                if ((charArrYear[i] < 48) && (charArrYear[i] > 57)) {
                    System.out.println("Error type of data! Try again.");
                    yearOfBirth = sc.nextLine();
                    charArrYear = yearOfBirth.toCharArray();
                    i = 0;
                }
            }
            int y = Integer.parseInt(yearOfBirth);
            
            //check whether the person is an adult
            if (y > 1998) {
                System.out.println("The person isn't an adult!");
            } else {
                System.out.println("The person is an adult!");
            }

            //weight
            System.out.print("Weight: ");
            String weight = sc.nextLine();
            char[] charWeight = weight.toCharArray();
            for (int i = 0; i < charWeight.length; i++) {
                if ((charWeight[i] < 48) && (charWeight[i] > 57)) {
                    System.out.println("Error type of data! Try again.");
                    weight = sc.nextLine();
                    charWeight = weight.toCharArray();
                    i = 0;
                }
            }
            float w = Integer.parseInt(weight);

            //height
            System.out.print("Height: ");
            String height = sc.nextLine();
            char[] charHeight = height.toCharArray();
            for (int i = 0; i < charHeight.length; i++) {
                if ((charHeight[i] < 48) && (charHeight[i] > 57)) {
                    System.out.println("Error type of data! Try again.");
                    height = sc.nextLine();
                    charHeight = height.toCharArray();
                    i = 0;
                }
            }
            int h = Integer.parseInt(height);

           
            System.out.print("Profession: ");
            String profession = sc.nextLine();
            char[] charPro = profession.toCharArray();
            for (int i = 0; i < charPro.length; i++) {
                if (((charPro[i] != 32) && (charPro[i] != 45) && (charPro[i] < 65)) || ((charPro[i] > 90)
                        && (charPro[i] < 97)) || (charPro[i] > 122)) {
                    System.out.println("Error type of data! Try again.");
                    profession = sc.nextLine();
                    charPro = profession.toCharArray();
                    i = 0;
                }
            }
        }

    }
}
