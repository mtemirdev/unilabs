package example;

public class UniversityStudent extends Learner {
    private String university;
    private String specialty;

    public UniversityStudent(String name, int age, String university, String specialty) {
        super(name, age);
        this.university = university;
        this.specialty = specialty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
