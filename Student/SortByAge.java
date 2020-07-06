package com.company;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getAge().compareTo(second.getAge());
    }
}
