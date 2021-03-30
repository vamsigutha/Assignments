package com.assignments.seven;

import java.util.ArrayList;
import java.util.List;

public class Section {
    List<Student> studentFailedInMathList = new ArrayList<>();
    public List<String> studentNames = new ArrayList<>();


    public List<Student> getStudentFailedInMathList() {
        return studentFailedInMathList;
    }

    public void setStudentFailedInMathList(List<Student> studentFailedInMathList) {
        this.studentFailedInMathList = studentFailedInMathList;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }
}
