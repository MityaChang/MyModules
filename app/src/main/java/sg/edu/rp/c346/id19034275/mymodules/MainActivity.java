package sg.edu.rp.c346.id19034275.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346,c349;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346=findViewById(R.id.textViewC346);
        c349=findViewById(R.id.textViewC349);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent android=new Intent(MainActivity.this,ModuleDetailActivity.class);
                android.putExtra("code","C346");
//                intent.putExtra("Module Name","Android Programming");
//                intent.putExtra("AcademicYear",2020);
//                intent.putExtra("Semester",1);
//                intent.putExtra("Module Credit",4);
//                intent.putExtra("venue","W66M");

                startActivity(android);
            }
        });

        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPad=new Intent(MainActivity.this,ModuleDetailActivity.class);
                iPad.putExtra("code","C349");
//                intent.putExtra("Module Name","iPad Programming");
//                intent.putExtra("AcademicYear",2020);
//                intent.putExtra("Semester",1);
//                intent.putExtra("Module Credit",4);
//                intent.putExtra("venue","W65A");

                startActivity(iPad);
            }
        });





    }
}
