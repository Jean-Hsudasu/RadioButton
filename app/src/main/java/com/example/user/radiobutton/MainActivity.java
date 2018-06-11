package com.example.user.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton radioButton = findViewById(R.id.radioButton);
        radioButton.setText("程式設計師");
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        radioButton2.setText("程式設計師");
        RadioButton radioButton3 = findViewById(R.id.radioButton3);
        radioButton3.setText("程式設計師");
        RadioButton radioButton4 = findViewById(R.id.radioButton4);
        radioButton4.setText("程式設計師");
        RadioButton radioButton5 = findViewById(R.id.radioButton5);
        radioButton5.setText("程式設計師");
    }

    public void onSelect(View view){
        switch(view.getId()){
            case R.id.radioButton:
                Toast.makeText(MainActivity.this, "安安, 程式設計師!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(MainActivity.this, "安安, UI設計師!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                Toast.makeText(MainActivity.this, "安安, UI設計師!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton4:
                Toast.makeText(MainActivity.this, "安安, UI設計師!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton5:
                Toast.makeText(MainActivity.this, "安安, UI設計師!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
