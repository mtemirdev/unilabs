package example;

import java.util.ArrayList;
import java.util.List;

/** Конференция с названием и списком участников, представленных объектами {@link Learner}. */
public class Conference {
    private String name;
    private final List<Learner> participants = new ArrayList<>();

    /** Создаёт конференцию с указанным названием.
     * @param name название конференции
     */
    public Conference(String name) {
        this.name = name;
    }

    /** Возвращает название конференции.
     * @return название конференции
     */
    public String getName() {
        return name;
    }

    /** Устанавливает название конференции.
     * @param name новое название конференции
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Добавляет учащегося в список участников.
     * @param participant участник конференции
     */
    public void addParticipant(Learner participant) {
        participants.add(participant);
    }

    /** Возвращает число участников, являющихся школьниками.
     * @return количество школьников
     */
    public int countSchoolchildren() {
        int count = 0;
        for (Learner participant : participants) {
            if (participant instanceof Schoolchild) {
                count++;
            }
        }
        return count;
    }

    /** Возвращает число участников, являющихся студентами вузов.
     * @return количество студентов вузов
     */
    public int countUniversityStudents() {
        int count = 0;
        for (Learner participant : participants) {
            if (participant instanceof UniversityStudent) {
                count++;
            }
        }
        return count;
    }
}
