package com.kpi.fict.it01.team1.secondtask.helpers;

import com.kpi.fict.it01.team1.secondtask.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class SecondTaskHelper {
    public static InstituteModel createInstitute(int facultiesAmount, int studentsPerFacultyAmount) {
        return new InstituteModel(UUID.randomUUID().toString().substring(0, 10),
                        createFaculties(facultiesAmount, studentsPerFacultyAmount));

    }

    private static TreeSet<FacultyModel> createFaculties(int facultiesAmount, int studentsAmount) {
        var faculties = new ArrayList<FacultyModel>();

        for (int i = 0; i < facultiesAmount; i++) {
            faculties.add(new FacultyModel(UUID.randomUUID().toString().substring(0, 10), createStudents(studentsAmount)));
        }

        return new TreeSet<>(faculties);
    }

    private static TreeSet<StudentModel> createStudents(int amount) {
        Comparator<StudentModel> markComparator = (s1, s2) -> (int) (s2.getAverageMark() - s1.getAverageMark());

        var students = new TreeSet<>(markComparator.thenComparing((o1, o2) -> (int) (o1.hashCode() - o2.hashCode())));

        for (int i = 0; i < amount; i++) {
            students.add(new StudentModel(UUID.randomUUID().toString().substring(0, 10),
                    UUID.randomUUID().toString().substring(0, 10),
                    UUID.randomUUID().toString().substring(0, 10),
                    ThreadLocalRandom.current().nextDouble() * 100));
        }

        return students;
    }
}
