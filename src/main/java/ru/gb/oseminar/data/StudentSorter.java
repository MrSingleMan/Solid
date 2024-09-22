package ru.gb.oseminar.data;

import java.util.Collections;
import java.util.List;

public class StudentSorter {
    public List<Student> sortStudents(List<Student> students) {
        Collections.sort(students);
        return students;
    }

    public List<Student> sortByFIO(List<Student> students) {
        students.sort(new UserComparator<>());
        return students;
    }
}
