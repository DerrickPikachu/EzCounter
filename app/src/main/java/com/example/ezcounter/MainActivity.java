package com.example.ezcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

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
        plusOneBtn.setOnLongClickListener(this);

        txv = findViewById(R.id.number);
        txv.setOnClickListener(this);
        txv.setOnLongClickListener(this);
    }

    private void plusOne() {
        counter++;
        txv.setText(Integer.toString(counter));
    }

    private void plusTwo() {
        counter += 2;
        txv.setText(Integer.toString(counter));
    }

    private void toZero() {
        counter = 0;
        txv.setText(Integer.toString(counter));
    }

    private void minusOne() {
        counter--;
        txv.setText(Integer.toString(counter));
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.number:
                minusOne();
                break;
            case R.id.plusOne:
                plusOne();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        switch(view.getId()) {
            case R.id.plusOne:
                plusTwo();
                break;
            case R.id.number:
                toZero();
        }
        return true;
    }
}
