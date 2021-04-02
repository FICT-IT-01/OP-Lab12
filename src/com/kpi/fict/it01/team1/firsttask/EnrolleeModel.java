package com.kpi.fict.it01.team1.firsttask;

public class EnrolleeModel {
    private String lastName;
    private double points;

    public EnrolleeModel(String lastName, double points) {
        this.lastName = lastName;
        this.points = points;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "EnrolleeModel{" +
                "lastName='" + lastName + '\'' +
                ", points=" + points +
                '}';
    }
}
