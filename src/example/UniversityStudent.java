package example;

/**
 * Представляет студента высшего учебного заведения.
 * Хранит название университета и выбранную специальность.
 *
 * @author unilabs
 * @see Learner
 */
public class UniversityStudent extends Learner {
    private String university;
    private String specialty;

    /**
     * Создаёт студента с указанными персональными данными и местом обучения.
     *
     * @param name имя студента
     * @param age возраст студента
     * @param university название университета
     * @param specialty специальность студента
     */
    public UniversityStudent(String name, int age, String university, String specialty) {
        super(name, age);
        this.university = university;
        this.specialty = specialty;
    }

    /**
     * Возвращает название университета.
     *
     * @return название университета
     */
    public String getUniversity() {
        return university;
    }

    /**
     * Устанавливает название университета.
     *
     * @param university новое название университета
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * Возвращает название специальности.
     *
     * @return название специальности
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Устанавливает специальность студента.
     *
     * @param specialty новая специальность
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
