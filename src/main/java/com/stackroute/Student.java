//4. Create a Student class that represents the following information of a student: id, name, and age
//        all the member variables should be private .
//        a. Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `Maintest` create Student class object(minimum 5)
//        d. Add these student object into a List of type Student .
//        e. Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.


package com.stackroute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Student {
    private int id;
    private String name;
    private int age;

    //constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// student class Comparator interface

class StudentSorter implements Comparator<Student> {

//    Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.


    public int compare(Student student1, Student student2) {

        if (student1.getAge() == student2.getAge()) {  //if age is same then check if names are same or not.
            if (student1.getName().equals(student2.getName())) //if names are same then return sort by id
                return student2.getId() - student1.getId();
            else{
                return student2.getName().compareTo(student1.getName());}  //otherwise return sort by names
        } else {             //if age is different then simply sort by age
            return student2.getAge() - student1.getAge();
        }
    }

}


// class maintest {
//
//    public static void main(String[] args){
//        List<Student> students = new ArrayList<>();
//
//        //creating 5  objects of student class
//        Student obj1 = new Student(1, "Neelanshi", 23);
//        Student obj2 = new Student(2, "Sidra", 25);
//        Student obj3 = new Student(3, "Neelanshi", 23);
//        Student obj4 = new Student(4, "Ankit", 22);
//        Student obj5 = new Student(5, "Ankit", 29);
//        Student obj6 = new Student(6, "Sarthak", 22);
//
////adding each object in the student array list
//
//        students.add(obj1);
//        students.add(obj2);
//        students.add(obj3);
//        students.add(obj4);
//        students.add(obj5);
//        students.add(obj6);
//
//        //Using the collections.sort method passing the student array list object and invoking method which has comparator implementation
//        Collections.sort(students,new StudentSorter());
//        System.out.println(students.toString());
//
//    }
//
//}