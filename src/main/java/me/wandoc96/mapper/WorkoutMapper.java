package me.wandoc96.mapper;

import me.wandoc96.domain.Exercise;
import me.wandoc96.domain.Set;

import java.util.ArrayList;
import java.util.List;

public class WorkoutMapper {

    private static Exercise mapExercise(List<String> exerciseStrings) {
        Exercise exercise = new Exercise();
        List<Set> sets = new ArrayList<>();

        for (String exerciseString : exerciseStrings) {
            if (exerciseString.endsWith(")")) {
                exercise.setName(exerciseString);
            } else if (!exerciseString.endsWith("]")) {
                sets.add(mapSet(exerciseString));
            }
        }

        exercise.setSets(sets);

        return exercise;
    }

    private static Set mapSet(String setString) {
        double weight = Double.parseDouble(setString.substring(setString.indexOf(':') + 2, setString.indexOf('k')));
        int reps = Integer.parseInt(setString.substring(setString.indexOf('×') + 2));

        return new Set(weight, reps);
    }
}
