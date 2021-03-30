package com.assignments.seven;

public class Student {
    private String name;
    private String email;

    private Integer marksInMath;
    private Integer marksInPhysics;
    private Integer marksInChemistry;

    public Integer getMarksInMath() {
        return marksInMath;
    }

    public void setMarksInMath(Integer marksInMath) {
        this.marksInMath = marksInMath;
    }

    public Integer getMarksInPhysics() {
        return marksInPhysics;
    }

    public void setMarksInPhysics(Integer marksInPhysics) {
        this.marksInPhysics = marksInPhysics;
    }

    public Integer getMarksInChemistry() {
        return marksInChemistry;
    }

    public void setMarksInChemistry(Integer marksInChemistry) {
        this.marksInChemistry = marksInChemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", marksInMath=" + marksInMath +
                ", marksInPhysics=" + marksInPhysics +
                ", marksInChemistry=" + marksInChemistry +
                '}';
    }
}
