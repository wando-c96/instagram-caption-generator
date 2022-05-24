package me.wandoc96.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Exercise {

    private String name;
    private List<Set> sets;
}
