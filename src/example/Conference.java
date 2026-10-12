package example;

import java.util.ArrayList;
import java.util.List;

public class Conference {
    private String name;
    private final List<Learner> participants = new ArrayList<>();

    public Conference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addParticipant(Learner participant) {
        participants.add(participant);
    }

    public int countSchoolchildren() {
        int count = 0;
        for (Learner participant : participants) {
            if (participant instanceof Schoolchild) {
                count++;
            }
        }
        return count;
    }

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
