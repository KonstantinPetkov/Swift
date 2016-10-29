package Task4_PersonCharacteristics;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class Person {
    
    //fields
    private String firstName;
    private String surName;
    private char gender;
    private final LocalDate yearOfBirth;
    private int height;
    private Education education;
    
    //constructor
    public Person(String firstName, String surName, char gender, int height, LocalDate yearOfBirth){
        setFirstName(firstName);
        setSurName(surName);
        setGender(gender);
        setHeight(height);
        this.yearOfBirth = yearOfBirth;
    }
    
    public int getAge() {
        return (int) yearOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    
    public String getInfo() {
        
        String heOrShe;
        String hisOrHer;
        
        if (gender == 'M'){
            heOrShe = "He";
            hisOrHer = "His";
        }else {
            heOrShe = "She";
            hisOrHer = "Her";
        }
        
        String result = String.format("%s %s is %d years old.", firstName, surName, getAge());
        result += String.format(" %s was born in %d.", heOrShe, yearOfBirth.getYear());
        result += String.format(" %s started %s degree in %s on %s", 
                heOrShe, education.getDegree().toLowerCase(), 
                education.getInstitutionName(), education.getEnrollmentDate());
        if(education.isGraduated()){
            result += String.format(" and finished on %s.", education.getGraduationDate());
            
            if( ! education.getDegree().equalsIgnoreCase("Primary")) {
                result += String.format(" %s grade was %.3f.", hisOrHer, ((GradedEducation) education).getFinalGrade());
            }
        } else{
            result += String.format(" and is supposed to graduate on %s.", education.getGraduationDate());
        }

        if (isUnderAged()) {
            result += String.format(" %s %s is under-aged.", firstName, surName);
        }

        return result;
    }
    
    public boolean isUnderAged() {
        return getAge() < 18;
    }
    
    //get & set methods
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getSurName(){
        return surName;
    }
    
    public void setSurName(String surName){
        this.surName = surName;
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public LocalDate getDateOfBirth() {
        return yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public void addEducation(Education education){
        this.education = education;
    }
    
}//Person
