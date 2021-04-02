package com.kpi.fict.it01.team1;

import com.kpi.fict.it01.team1.firsttask.FirstTaskHelper;
import com.kpi.fict.it01.team1.firsttask.FirstTaskProcessor;
import com.kpi.fict.it01.team1.secondtask.helpers.SecondTaskHelper;
import com.kpi.fict.it01.team1.secondtask.processors.SecondTaskProcessor;
import com.kpi.fict.it01.team1.thirdtask.ThirdTaskHelper;
import com.kpi.fict.it01.team1.thirdtask.ThirdTaskProcessor;

public class Main {
    private static final FirstTaskProcessor firstTaskProcessor = new FirstTaskProcessor();
    private static final SecondTaskProcessor secondTaskProcessor = new SecondTaskProcessor();
    private static final ThirdTaskProcessor thirdTaskProcessor = new ThirdTaskProcessor();

    public static void main(String[] args) {
        System.out.println("Task 1");
        task1(10);
        System.out.println();

        System.out.println("Task 2");
        task2();
        System.out.println();

        System.out.println("Task 3");
        task3(10);
        System.out.println();
    }

    private static void task1(int appliersAmount) {
        var appliers = FirstTaskHelper.generateEnrolleeTreeSet(appliersAmount);

        var budgetStudents =
            firstTaskProcessor.selectStudentsWhoCanBeCreditedToBudget(appliers, 10);
        var contractStudents =
            firstTaskProcessor.selectStudentsWhoCanBeCreditedToContract(appliers, 10, 5);
        var otherFacultyStudents =
            firstTaskProcessor.selectStudentsWhoCanBeCreditedToAnotherFaculties(appliers, 10, 5);

        System.out.println("Budget");
        budgetStudents.forEach(System.out::println);

        System.out.println("Contract");
        contractStudents.forEach(System.out::println);

        System.out.println("Other faculties");
        otherFacultyStudents.forEach(System.out::println);
    }

    private static void task2() {
        var institute = SecondTaskHelper.createInstitute(3, 3);

        System.out.println("All students");
        secondTaskProcessor.getAllStudents(institute).forEach(System.out::println);

        System.out.println("Students with average mark equals or 95");
        secondTaskProcessor.getAllStudentsWithAverageMarkHigherThan(institute, 95).forEach(System.out::println);
    }

    private static void task3(int appliersAmount) {
        var appliers = ThirdTaskHelper.generateEnrolleeTreeSet(appliersAmount);

        System.out.println("Can be credit");
        thirdTaskProcessor.selectAppliersWhoCannotBeCredit(appliers).forEach(System.out::println);
    }
}
