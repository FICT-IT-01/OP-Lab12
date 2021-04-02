package com.kpi.fict.it01.team1.secondtask.models;

import java.util.Objects;
import java.util.TreeSet;

public class FacultyModel implements Comparable<FacultyModel> {
    private String name;
    private TreeSet<StudentModel> students;

    public FacultyModel(String name, TreeSet<StudentModel> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public TreeSet<StudentModel> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FacultyModel)) return false;
        FacultyModel that = (FacultyModel) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getStudents(), that.getStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudents());
    }

    @Override
    public int compareTo(FacultyModel o) {
        return hashCode() - o.hashCode();
    }
}
