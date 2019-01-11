package com.example.hassan.togglebuttonsabith;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
 ToggleButton tgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tgbtn=findViewById(R.id.toggleButton);

        tgbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "ON",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
