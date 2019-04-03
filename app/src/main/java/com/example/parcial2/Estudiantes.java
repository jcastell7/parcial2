package com.example.parcial2;

import java.util.ArrayList;

public class Estudiantes {
    public static ArrayList<Estudiante> studentList;

    public Estudiantes(ArrayList studentList) {
        this.studentList = studentList;
    }

    public void addNewStudent(Estudiante estudiante){
        studentList.add(estudiante);
    }

    public static String[] listSudentsNames(){
        String students[]= new String[studentList.size()];
        for (int i =0 ; i< studentList.size(); i++){
            students[i]= studentList.get(i).toString();
        }
        return students;
    }


}
