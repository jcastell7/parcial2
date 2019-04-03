package com.example.parcial2;

public class Estudiante {
    private String id;
    private double grade1;
    private double grade2;
    private double grade3;
    private double finalGrade;
    private String name;
    private String lastName;

    public Estudiante(String id, double grade1, double grade2, double grade3, String name, String lastName) {
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.name = name;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade() {
       this.finalGrade = this.calculateFinalGrade();
    }

    public double calculateFinalGrade(){
        return (this.getGrade1()*0.333333333 + this.getGrade2()*0.333333333 + this.getGrade3()*0.333333333);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return name + " " +lastName;
    }


}
