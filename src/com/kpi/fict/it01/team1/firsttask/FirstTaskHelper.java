package com.kpi.fict.it01.team1.firsttask;

import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class FirstTaskHelper {
    public static TreeSet<EnrolleeModel> generateEnrolleeTreeSet(int amount) {
        var enrollee = new TreeSet<EnrolleeModel>((s1, s2) -> (int) (s2.getPoints() - s1.getPoints()));

        IntStream.range(0, amount).mapToObj(i -> new EnrolleeModel(UUID.randomUUID().toString().substring(0, 7),
                ThreadLocalRandom.current().nextDouble() * 100)).forEach(enrollee::add);

        return enrollee;
    }
}
