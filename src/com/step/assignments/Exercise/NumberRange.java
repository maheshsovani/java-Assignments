package com.step.assignments.Exercise;

import java.util.List;

public class NumberRange extends Range<Integer> {

    public NumberRange(Integer start, Integer end) {
        super(start, end);
        for (Integer i = start; i <= end; i++) {
            super.range.add(i);
        }
    }

    public List getAll() {
        return super.range;
    }

    public boolean containsElement(Integer element) {
        return super.range.contains(element);
    }
}
