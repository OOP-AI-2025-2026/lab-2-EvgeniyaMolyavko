package ua.opnu;

import java.util.ArrayList;

public class Student {
    String name;
    int year;
    ArrayList<String> subjects = new ArrayList<>();


    Student(String name, int year){
        if(name.isEmpty()){
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        if(year < 0 || year > 4){
            this.year = 0;
        } else {
            this.year = year;
        }

    }

    void addCourse(String course){
        subjects.add(course);
    }

    void dropAll(ArrayList<String> subjects){
        this.subjects = subjects;
        subjects.clear();
    }

    int getCourseCount(){
        int courseCount = subjects.size();
        return courseCount;
    }

    String getName(){
        return name;
    }

    int getTuition(){
        return (year*20000);
    }

    int getYear(){
        return year;
    }


}
