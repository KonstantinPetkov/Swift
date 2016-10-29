package Task4_PersonCharacteristics;

import java.time.LocalDate;


public class PrimaryEducation extends Education{

    public PrimaryEducation(String institution, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institution, enrollmentDate, graduationDate);
    }

    @Override
    public String getDegree() {
        return "Primary";
    }

    @Override
    public void gotGraduated() {
        graduated = true;
    }
    
}
