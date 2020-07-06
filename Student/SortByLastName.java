package com.company;

import java.util.Comparator;

public class SortByLastName implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        String firstName = first.getLastName();
        String secondName = second.getLastName();
        if(firstName.equals(""))
            firstName = first.getFirstName();
        if(secondName.equals(""))
            secondName = second.getFirstName();
        return firstName.compareTo(secondName);
    }
}

//
//    Enter Name: onkar rai
//        Enter Age: 22
//        Enter City: Delhi
//        Do you want to add more (y/n)?
//        y
//        Enter Name: Zax
//        Enter Age: 46
//        Enter City: sdsf
//        Do you want to add more (y/n)?
//        y
//        Enter Name: Xydfgd ant
//        Enter Age: 98
//        Enter City: japan
//        Do you want to add more (y/n)?
//        y
//        Enter Name: anurag zask
//        Enter Age: 21
//        Enter City: ghg