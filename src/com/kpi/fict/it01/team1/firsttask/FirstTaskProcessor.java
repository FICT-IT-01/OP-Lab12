package com.kpi.fict.it01.team1.firsttask;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class FirstTaskProcessor {
    public TreeSet<EnrolleeModel> selectStudentsWhoCanBeCreditedToBudget(TreeSet<EnrolleeModel> applicants,
                                                                         int placesAmount) {
        return applicants.stream().limit(placesAmount).filter(s -> s.getPoints() > 60)
            .collect(Collectors.toCollection(
                    () -> new TreeSet<>((s1, s2) -> (int) (s2.getPoints() - s1.getPoints()))
            ));
    }

    public TreeSet<EnrolleeModel> selectStudentsWhoCanBeCreditedToContract(TreeSet<EnrolleeModel> applicants,
                                                                           int budgetPlacesAmount,
                                                                           int contractPlacesAmount) {
        return applicants.stream().skip(budgetPlacesAmount).limit(contractPlacesAmount).filter(s -> s.getPoints() > 60)
            .collect(Collectors.toCollection(
                    () -> new TreeSet<>((s1, s2) -> (int) (s2.getPoints() - s1.getPoints()))
            ));
    }

    public TreeSet<EnrolleeModel> selectStudentsWhoCanBeCreditedToAnotherFaculties(TreeSet<EnrolleeModel> applicants,
                                                                                   int budgetPlacesAmount,
                                                                                   int contractPlacesAmount) {
        return applicants.stream().skip(budgetPlacesAmount + contractPlacesAmount)
            .limit(contractPlacesAmount).filter(s -> s.getPoints() > 60)
            .collect(Collectors.toCollection(
                    () -> new TreeSet<>((s1, s2) -> (int) (s2.getPoints() - s1.getPoints()))
            ));
    }
}
