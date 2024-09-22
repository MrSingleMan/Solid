package ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.Comparator;


//Принцип единственной ответственности (SRP):
//Класс Teacher одновременно отвечает за хранение данных студента
// и за логику сравнения объектов учителей. Сравнение будет делаться через UserComparator
public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

//    public static class TeacherComparator implements Comparator {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return 0;
//        }
//    }
}
