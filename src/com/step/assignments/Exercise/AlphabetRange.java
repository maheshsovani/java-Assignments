package com.step.assignments.Exercise;

import java.util.List;

public class AlphabetRange extends Range<Character> {

    public AlphabetRange(Character start, Character end) {
        super(start, end);
        for (Character i = start; i <= end; i++) {
            super.range.add(i);
        }
    }

    public List getAll() {
        return super.range;
    }

    public boolean containsElement(Character element) {
        return super.range.contains(element);
    }
}
