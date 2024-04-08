package com.example.abc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    EditText etA,etB,etC;
    final int REQUEST_CODE = 369;
    boolean  boEt1 = false,boEt2 = false,boEt3 = false;
    TextView tvX1,tvX2;
    String a, b, c,strX1,strX2;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);
        tvX1 = findViewById(R.id.tvX1);
        tvX2 = findViewById(R.id.tvX2);

    }

    public void clickedEtA(View view)
    {
        boEt1 = true;
    }
    public void clickedEtB(View view)
    {
        boEt2 = true;
    }
    public void clickedEtC(View view)
    {
        boEt3 = true;
    }
    public void clickedRnd(View view)
    {
        etA.setText("" + (rnd.nextInt(100 + 100)-100));
        etB.setText("" + (rnd.nextInt(100 + 100)-100));
        etC.setText("" + (rnd.nextInt(100 + 100)-100));
        boEt1 = false;
        boEt2 = false;
        boEt3 = false;
    }

    public void clickedAns(View view)
    {
        if(boEt1 && boEt2 && boEt3)
        {
            a = etA.getText().toString();
            b = etB.getText().toString();
            c = etC.getText().toString();
            if (a.isEmpty() || b.isEmpty() || c.isEmpty() || a.equals("-") || b.equals("-") || c.equals("-") || a.equals(".") || b.equals(".") || c.equals(".") || a.equals("-.") || b.equals("-.") || c.equals("-."))
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            else if (Double.parseDouble(a) == 0)
                Toast.makeText(this, "you cannot enter 0", Toast.LENGTH_SHORT).show();
            else
            {

                Intent ioeohad = new Intent(this, activityAnswer.class);
                ioeohad.putExtra("a", Double.parseDouble(a));
                ioeohad.putExtra("b", Double.parseDouble(b));
                ioeohad.putExtra("c", Double.parseDouble(c));
                super.startActivityForResult(ioeohad, REQUEST_CODE);
            }
        }
    }

    @Override
    protected void onActivityResult(int source, int result, Intent data_back){
        super.onActivityResult(source, result, data_back);
        if(data_back != null)
        {
            tvX1.setText("x1: " + data_back.getDoubleExtra("x1",1));
            tvX2.setText("x2: " + data_back.getDoubleExtra("x2",1));
        }
    }
}