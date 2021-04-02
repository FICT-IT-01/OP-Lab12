package com.kpi.fict.it01.team1.secondtask.models;

import java.util.Objects;

public class StudentModel {
    private String firstName;
    private String lastName;
    private String recordBook;
    private double averageMark;

    public StudentModel(String firstName, String lastName, String recordBook, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.recordBook = recordBook;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(String recordBook) {
        this.recordBook = recordBook;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", recordBook='" + recordBook + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentModel)) return false;
        StudentModel that = (StudentModel) o;
        return Double.compare(that.getAverageMark(), getAverageMark()) == 0 && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getRecordBook(), that.getRecordBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getRecordBook(), getAverageMark());
    }
}
