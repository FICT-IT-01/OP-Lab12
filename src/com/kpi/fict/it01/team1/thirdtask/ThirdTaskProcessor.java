package com.kpi.fict.it01.team1.thirdtask;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class ThirdTaskProcessor {
    public TreeSet<EnrolleeModel> selectAppliersWhoCannotBeCredit(TreeSet<EnrolleeModel> applicants) {
        return applicants.stream().filter(a -> a.getPoints() < 60).collect(Collectors.toCollection(
            () -> new TreeSet<>((s1, s2) -> (int) (s1.getPoints() - s2.getPoints()))
        ));
    }
}
