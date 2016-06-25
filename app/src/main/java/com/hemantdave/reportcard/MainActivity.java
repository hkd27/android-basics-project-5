package com.hemantdave.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Here i have instantiaed the reportCard class*/
        reportCardPojo Student1=new reportCardPojo("A","A","B","A","Donald","KAC-1283",2001);
        reportCardPojo Student2=new reportCardPojo("A","B","B","C","Duck","KAC-1251",2001);
        reportCardPojo Student3=new reportCardPojo("B","A","B","A","Tom","KBC-1211",2001);
        reportCardPojo Student4=new reportCardPojo("C","B","B","C","Jerry","KAC-1101",2001);

        Log.i("Student 1 Report Card",Student1.toString());
        Toast.makeText(MainActivity.this, "Student 1 Report Card"+Student1.toString(), Toast.LENGTH_SHORT).show();
        TextView result=(TextView)findViewById(R.id.Result);
        assert result != null;
        result.setText("Student 1 Report Card"+Student1.toString());
        Log.i("Student 2 only Name",Student2.getStudentName());
    }











}
