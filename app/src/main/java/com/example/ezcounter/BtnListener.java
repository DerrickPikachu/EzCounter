package com.example.ezcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


//cannot work!!!!!!!!!!!!!!!!!!!!!!!!!
public class BtnListener extends AppCompatActivity implements View.OnClickListener {

    private int counter;
    private TextView txv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        counter = 0;
        //cannot find this View in this activity
        txv = findViewById(R.id.number);
    }

    @Override
    public void onClick(View view) {
         counter++;
         txv.setText(Integer.toString(counter));
    }
}
