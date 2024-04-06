package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    EditText etA,etB,etC;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);
    }

    public void clickedEtA(View view) {
    }
    public void clickedEtB(View view) {
    }
    public void clickedEtC(View view) {
    }
    public void clickedRnd(View view) {
        etA.setText("" + (rnd.nextInt(1000 + 1000)-1000));
        etB.setText("" + (rnd.nextInt(1000 + 1000)-1000));
        etC.setText("" + (rnd.nextInt(1000 + 1000)-1000));

    }

    public void clickedAns(View view) {


    }
}