package oop.test;

import oop.example.Conference;
import oop.example.Schoolchild;
import oop.example.UniversityStudent;

public class TestConference {
    public static void main(String[] args) {
        Conference conference = new Conference("Научная конференция");
        conference.addParticipant(new Schoolchild("Алина", 15, 9, "Школа № 1"));
        conference.addParticipant(new Schoolchild("Бек", 16, 10, "Школа № 5"));
        conference.addParticipant(new UniversityStudent("Иван", 20, "КГУ", "Информатика"));

        System.out.println("Конференция: " + conference.getName());
        System.out.println("Школьников: " + conference.countSchoolchildren());
        System.out.println("Студентов: " + conference.countUniversityStudents());
    }
}
