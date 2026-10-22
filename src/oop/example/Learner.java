package oop.example;

/** Базовое описание учащегося: имя и возраст. */
public class Learner {
    private String name;
    private int age;

    /** Создаёт учащегося с заданными именем и возрастом.
     * @param name имя учащегося
     * @param age возраст учащегося
     */
    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Возвращает имя учащегося.
     * @return имя учащегося
     */
    public String getName() {
        return name;
    }

    /** Устанавливает имя учащегося.
     * @param name новое имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Возвращает возраст учащегося.
     * @return возраст учащегося
     */
    public int getAge() {
        return age;
    }

    /** Устанавливает возраст учащегося.
     * @param age новый возраст
     */
    public void setAge(int age) {
        this.age = age;
    }
}
