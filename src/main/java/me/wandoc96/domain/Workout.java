package me.wandoc96.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Workout {

    private String name;
    private Date date;
    private String notes;
    private List<Exercise> exercises;
}
