package sg.edu.rp.c346.id19034275.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modetails;
    Button btnClose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        modetails=findViewById(R.id.moduleDetails);
        btnClose=findViewById(R.id.buttonClose);


        Intent intent=getIntent();
        String code=intent.getStringExtra("code");
//        String modName=intent.getStringExtra("Module Name");
//        int year=intent.getIntExtra("AcademicYear",2020);
//        int sem=intent.getIntExtra("Semester",1);
//        int credit=intent.getIntExtra("Module Credit",4);
//        String venue=intent.getStringExtra("venue");

        if(code.equals("C346")){
            modetails.setText("Module Code: c346\nModule Name: Android Programming\nAcademicYear: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
        }
        else if(code.equals("C349")){
            modetails.setText("Module Code: C349 \nModule Name: iPad Programming\nAcademicYear: 2020\nSemester: 2\nModule Credit: 4\nVenue:W56N");

        }



        btnClose=findViewById(R.id.buttonClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
