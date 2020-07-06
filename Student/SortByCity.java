package com.company;

import java.util.Comparator;

public class SortByCity implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getCity().compareTo(second.getCity());
    }
}
