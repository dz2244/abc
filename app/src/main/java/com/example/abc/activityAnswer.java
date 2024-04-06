package com.example.abc;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activityAnswer extends AppCompatActivity {
    double answer,a,b,c,x1,x2;
    TextView tvx1,tvx2;
    Button returnBtn;
    ImageView imAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        tvx1 = findViewById(R.id.tvx1);
        tvx2 = findViewById(R.id.tvx2);
        returnBtn = findViewById(R.id.returnBtn);
        imAns = findViewById(R.id.ivAns);

        Intent get = getIntent();
        a = get.getDoubleExtra("a", 1);
        b = get.getDoubleExtra("b", 1);
        c = get.getDoubleExtra("c", 1);
        if(b*b -4*a*c < 0)
            tvx1.setText("no answer");
            tvx2.setText("no answer");

        else


    }

    public void clickedReturnBtn(View view) {
    }
}