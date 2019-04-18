package ke.jkuat;

public class Student {

    private int id, yearOfStudy,semesterOfStudy;
    private String firstName, lastName,programOfStudy;

    //getter methods
    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSemesterOfStudy() {
        return semesterOfStudy;
    }

    public String getProgramOfStudy() {
        return programOfStudy;
    }

    //setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSemesterOfStudy(int semesterOfStudy) {
        this.semesterOfStudy = semesterOfStudy;
    }

    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }
}
