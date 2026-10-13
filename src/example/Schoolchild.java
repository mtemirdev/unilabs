package example;

/** Учащийся школы с указанием класса обучения и названия школы. */
public class Schoolchild extends Learner {
    private int grade;
    private String school;

    /** Создаёт школьника с именем, возрастом, классом и школой.
     * @param name имя школьника
     * @param age возраст школьника
     * @param grade номер класса
     * @param school название школы
     */
    public Schoolchild(String name, int age, int grade, String school) {
        super(name, age);
        this.grade = grade;
        this.school = school;
    }

    /** Возвращает номер класса обучения.
     * @return номер класса
     */
    public int getGrade() {
        return grade;
    }

    /** Устанавливает номер класса обучения.
     * @param grade номер класса
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /** Возвращает название школы.
     * @return название школы
     */
    public String getSchool() {
        return school;
    }

    /** Устанавливает название школы.
     * @param school название школы
     */
    public void setSchool(String school) {
        this.school = school;
    }
}
