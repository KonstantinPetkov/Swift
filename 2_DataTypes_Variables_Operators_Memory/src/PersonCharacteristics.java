

public class PersonCharacteristics {

    public static void main(String[] args) {

        String firstName = "Konstantin";
        String surName = "Petkov";
        short yearOfBirth = 1987;
        float weight = 81.5f;
        short height = 180;
        String prof = "Engineer";

        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surName);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("Profession: " + prof);
        System.out.println();

        if (yearOfBirth > 1998) {
            System.out.println("The person isn't an adult!");
        } else {
            System.out.println("The person is an adult!");
        }

    }

}
