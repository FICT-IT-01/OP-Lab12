package com.kpi.fict.it01.team1.secondtask.processors;

import com.kpi.fict.it01.team1.secondtask.models.InstituteModel;
import com.kpi.fict.it01.team1.secondtask.models.StudentModel;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SecondTaskProcessor {
    public ArrayList<StudentModel> getAllStudents(InstituteModel instituteModel) {
        var students = new ArrayList<StudentModel>();
        instituteModel.getFaculties().forEach(f -> students.addAll(f.getStudents()));
        return students;
    }

    public TreeSet<StudentModel> getAllStudentsWithAverageMarkHigherThan(InstituteModel instituteModel, double threshold) {
        var students = getAllStudents(instituteModel);
        return students.stream().filter(s -> s.getAverageMark() >= threshold)
            .collect(Collectors.toCollection(
                () -> new TreeSet<>((s1, s2) -> (int) (s2.getAverageMark() - s1.getAverageMark()))
            ));
    }
}
