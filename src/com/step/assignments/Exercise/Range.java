package com.step.assignments.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Range<T> {
    protected T start;
    protected T end;
    protected List<T> range = new ArrayList<>();

    public Range(T start, T end) {
        this.start = start;
        this.end = end;
    }
}
