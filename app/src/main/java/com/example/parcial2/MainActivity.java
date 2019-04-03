package com.example.parcial2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String opt[];
    private Intent intent;
    private Button addStudentButton;
    public static ArrayList<Estudiante> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.studentList);
        opt = Estudiantes.listSudentsNames();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opt);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    intent = new Intent(MainActivity.this, studentActivity.class);
                    intent.putExtra("from", "list");
                    intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

    public void addNewUser(View view){
        intent = new Intent(MainActivity.this, studentActivity.class);
    }



}
