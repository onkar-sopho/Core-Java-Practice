package com.company;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getFirstName().compareTo(second.getFirstName());
    }
}
