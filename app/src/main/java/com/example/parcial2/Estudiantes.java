package com.example.parcial2;

import java.util.ArrayList;

public class Estudiantes {

    public void addNewStudent(Estudiante estudiante){
        MainActivity.studentList.add(estudiante);
    }

    public static String[] listSudentsNames(){

        String students[]= new String[MainActivity.studentList.size()];
        for (int i =0 ; i< MainActivity.studentList.size(); i++){
            students[i]= MainActivity.studentList.get(i).toString();
        }
        return students;
    }


}
