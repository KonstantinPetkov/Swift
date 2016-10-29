package Task4_PersonCharacteristics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PersonCharacteristics {

    private static Person readPerson(String data) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        String[] arr = data.split(";");

        String firstName = arr[0];
        String surName = arr[1];
        char gender = Character.toUpperCase(arr[2].toCharArray()[0]);
        int height = Integer.parseInt(arr[3].trim());
        LocalDate yearOfBirth = LocalDate.parse(arr[4].trim(), formatter);

        String degree = arr[5].trim();
        String institutionName = arr[6].trim();
        LocalDate enrollmentDate = LocalDate.parse(arr[7].trim(), formatter);
        LocalDate graduationDate = LocalDate.parse(arr[8].trim(), formatter);

        Education education;
        if (degree.equalsIgnoreCase("P")) {
            education = new PrimaryEducation(institutionName, enrollmentDate, graduationDate);
        } else if (degree.equalsIgnoreCase("S")) {
            education = new SecondaryEducation(institutionName, enrollmentDate, graduationDate);
        } else {
            education = new HigherEducation(institutionName, enrollmentDate, graduationDate, degree);
        }

        if (graduationDate.isBefore(LocalDate.now())) {
            ((GradedEducation) education).gotGraduated(Float.parseFloat(arr[9].trim()));
        }

        Person person = new Person(firstName, surName, gender, height, yearOfBirth);
        person.addEducation(education);

        return person;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Person person = new readPerson(sc.nextLine());
            System.out.println(person.getInfo());
        }
    }

}
