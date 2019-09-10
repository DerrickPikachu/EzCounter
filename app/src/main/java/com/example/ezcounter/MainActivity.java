package com.example.ezcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int counter;
    private Button plusOneBtn;
    private TextView txv;
//    private BtnListener plusOneListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
//        plusOneListener = new BtnListener();

        plusOneBtn = findViewById(R.id.plusOne);
//        plusOneBtn.setOnClickListener(plusOneListener);
        plusOneBtn.setOnClickListener(this);

        txv = findViewById(R.id.number);
        txv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        counter++;
        txv.setText(Integer.toString(counter));
    }
}
