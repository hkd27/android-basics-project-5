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
        ReportCardPojo Student1=new ReportCardPojo("A","A","B","A","Donald","KAC-1283",2001);
        ReportCardPojo Student2=new ReportCardPojo("A","B","B","C","Duck","KAC-1251",2001);
        ReportCardPojo Student3=new ReportCardPojo("B","A","B","A","Tom","KBC-1211",2001);
        ReportCardPojo Student4=new ReportCardPojo("C","B","B","C","Jerry","KAC-1101",2001);

        Log.i("Student 1 Report Card",Student1.GetReportCard());
        Toast.makeText(MainActivity.this, "Student 1 Report Card"+Student1.GetReportCard(), Toast.LENGTH_SHORT).show();
        TextView result=(TextView)findViewById(R.id.Result);
        assert result != null;
        result.setText("Student 1 Report Card"+Student1.GetReportCard());
        Log.i("Student 2 only Name",Student2.getStudentName());
    }











}
