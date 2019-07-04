package com.stackroute;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTest {


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void givenStudentDetailsShouldReturnSortedList() {

        List<Student> students = new ArrayList<>();

        Student obj1 = new Student(1, "Neelanshi", 23);
        Student obj2 = new Student(2, "Sidra", 23);
        Student obj3 = new Student(3, "Kirti", 37);
        Student obj4 = new Student(4, "Ankit", 22);
        Student obj5 = new Student(5, "Ruhan", 29);
        Student obj6 = new Student(6, "Sarthak", 22);


        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        //Before Sorting
        Collections.sort(students,new StudentSorter());

        // After Sorting

        String expected="[Student{id=3, name='Kirti', age=37}, Student{id=5, name='Ruhan', age=29}, Student{id=2, name='Sidra', age=23}, " +
                "Student{id=1, name='Neelanshi', age=23}, Student{id=6, name='Sarthak', age=22}, Student{id=4, name='Ankit', age=22}]";
        assertEquals(expected, students.toString());


    }

    @Test
    public void givenStudentDetailsShouldReturnSortedlist() {

        List<Student> students = new ArrayList<>();

        Student obj1 = new Student(1, "Neelanshi", 23);
        Student obj2 = new Student(2, "Sidra", 23);
        Student obj3 = new Student(3, "Kirti", 37);
        Student obj4 = new Student(4, "Ankit", 22);
        Student obj5 = new Student(5, "Ankit", 29);
        Student obj6 = new Student(6, "Sarthak", 22);


        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        //Before Sorting
        Collections.sort(students,new StudentSorter());

        // After Sorting

        String expected="[Student{id=3, name='Kirti', age=37}, Student{id=5, name='Ankit', age=29}, Student{id=2, name='Sidra', age=23}, " +
                "Student{id=1, name='Neelanshi', age=23}, Student{id=6, name='Sarthak', age=22}, Student{id=4, name='Ankit', age=22}]";
        assertEquals(expected, students.toString());


    }

    @Test
    public void givenStudntDetailsShouldReturnSortedlist() {

        //creating the array list object for student class
        List<Student> students = new ArrayList<>();

        //creating 5  objects of student class
        Student obj1 = new Student(1, "Neelanshi", 23);
        Student obj2 = new Student(2, "Sidra", 25);
        Student obj3 = new Student(3, "Neelanshi", 23);
        Student obj4 = new Student(4, "Ankit", 22);
        Student obj5 = new Student(5, "Ankit", 29);
        Student obj6 = new Student(6, "Sarthak", 22);

//adding each object in the student array list

        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);

        //Using the collections.sort method passing the student array list object and invoking method which has comparator implementation
        Collections.sort(students,new StudentSorter());

        // After Sorting

        String expected="[Student{id=5, name='Ankit', age=29}, Student{id=2, name='Sidra', age=25}, Student{id=3, name='Neelanshi', age=23}, Student{id=1, name='Neelanshi', age=23}, Student{id=6, name='Sarthak', age=22}, Student{id=4, name='Ankit', age=22}]";
        assertEquals(expected, students.toString());


    }
}