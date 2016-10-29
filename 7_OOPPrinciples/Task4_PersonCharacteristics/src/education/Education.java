package Task4_PersonCharacteristics;

import java.time.LocalDate;

public abstract class Education {

    boolean graduated;
    private final LocalDate enrollmentDate;
    LocalDate graduationDate;
    private final String institutionName;

    public abstract String getDegree();

    abstract void gotGraduated();

    Education(String institution, LocalDate enrollmentDate, LocalDate graduationDate) {
        this.institutionName = institution;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }
}
