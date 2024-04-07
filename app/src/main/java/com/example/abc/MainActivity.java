package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    EditText etA,etB,etC;
    String a, b, c;
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
        etA.setText("" + (rnd.nextInt(100 + 100)-100));
        etB.setText("" + (rnd.nextInt(100 + 100)-100));
        etC.setText("" + (rnd.nextInt(100 + 100)-100));

    }

    public void clickedAns(View view) {
        a = etA.getText().toString();
        b = etB.getText().toString();
        c = etC.getText().toString();
        if(a.isEmpty()||b.isEmpty()||c.isEmpty()||a.equals("-")||b.equals("-")||c.equals("-")||a.equals(".")||b.equals(".")||c.equals(".")||a.equals("-.")||b.equals("-.")||c.equals("-."))
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else if(Double.parseDouble(a) == 0)
            Toast.makeText(this, "you cannot enter 0", Toast.LENGTH_SHORT).show();
        else
        {

            Intent ioeohad = new Intent(this, activityAnswer.class);
            ioeohad.putExtra("a",Double.parseDouble(a));
            ioeohad.putExtra("b",  Double.parseDouble(b));
            ioeohad.putExtra("c", Double.parseDouble(c));
            startActivity(ioeohad);
        }
    }
}