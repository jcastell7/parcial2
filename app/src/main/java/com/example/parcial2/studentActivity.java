package com.example.parcial2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class studentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Intent intent = getIntent();
        String from = intent.getStringExtra("from");
        int position = intent.getIntExtra("position", 0);
        if(from =="list"){
            findViewById(R.id.btnAddUser).setVisibility(View.GONE);
            findViewById(R.id.txtId).setEnabled(false);
            findViewById(R.id.txtName).setEnabled(false);
            findViewById(R.id.txtLastName).setEnabled(false);
            findViewById(R.id.txtGrade1).setEnabled(false);
            findViewById(R.id.txtGrade2).setEnabled(false);
            findViewById(R.id.txtGrade3).setEnabled(false);
            findViewById(R.id.txtGradeTotal).setEnabled(false);
            Estudiante student = MainActivity.studentList.get(position);
            TextView id = (TextView)findViewById(R.id.txtId);
            id.setText(student.getId());
            TextView name = (TextView)findViewById(R.id.txtName);
            name.setText(student.getName());
            TextView lastName = (TextView)findViewById(R.id.txtLastName);
            lastName.setText(student.getLastName());
            TextView grade1 = (TextView)findViewById(R.id.txtGrade1);
            grade1.setText(student.getGrade1()+"");
            TextView grade2 = (TextView)findViewById(R.id.txtGrade2);
            grade1.setText(student.getGrade2()+"");
            TextView grade3 = (TextView)findViewById(R.id.txtGrade3);
            grade1.setText(student.getGrade3()+"");
            TextView finalGrade = (TextView)findViewById(R.id.txtGradeTotal);
            grade1.setText(student.getFinalGrade()+"");
        }
    }

    public void addNewUser(View view){
        TextView id = (TextView)findViewById(R.id.txtId);
        TextView name = (TextView)findViewById(R.id.txtName);
        TextView lastName = (TextView)findViewById(R.id.txtLastName);
        TextView grade1 = (TextView)findViewById(R.id.txtGrade1);
        TextView grade2 = (TextView)findViewById(R.id.txtGrade2);
        TextView grade3 = (TextView)findViewById(R.id.txtGrade3);
        TextView finalGrade = (TextView)findViewById(R.id.txtGradeTotal);
        Estudiante student = new Estudiante(id.getText()+"", Double.parseDouble(grade1.getText()+""), Double.parseDouble(grade2.getText()+""), Double.parseDouble(grade3.getText()+""), name.getText()+"", lastName.getText()+"");
        student.setFinalGrade();
        MainActivity.studentList.add(student);
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
}
