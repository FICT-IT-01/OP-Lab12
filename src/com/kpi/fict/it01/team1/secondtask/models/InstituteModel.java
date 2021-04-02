package com.kpi.fict.it01.team1.secondtask.models;

import java.util.TreeSet;

public class InstituteModel {
    private String name;
    private TreeSet<FacultyModel> faculties;

    public InstituteModel(String name, TreeSet<FacultyModel> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public TreeSet<FacultyModel> getFaculties() {
        return faculties;
    }
}
