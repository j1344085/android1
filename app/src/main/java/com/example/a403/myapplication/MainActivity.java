package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    int count1 = 0;
    //add button btn1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pick Me Pick Me Pick Me Up", Toast.LENGTH_SHORT).show();
                count1++;

                if(count1%3 == 0){
                    Toast.makeText(getApplicationContext(), "3번째마다 클릭한 결과 입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
