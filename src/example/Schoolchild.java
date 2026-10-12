package example;

public class Schoolchild extends Learner {
    private int grade;
    private String school;

    public Schoolchild(String name, int age, int grade, String school) {
        super(name, age);
        this.grade = grade;
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
