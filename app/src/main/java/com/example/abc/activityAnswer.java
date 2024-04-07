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
    double dis,a,b,c,x1,x2;
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

        tvx1.setVisibility(View.INVISIBLE);
        tvx2.setVisibility(View.INVISIBLE);

        Intent get = getIntent();
        a = get.getDoubleExtra("a", 1);
        b = get.getDoubleExtra("b", 1);
        c = get.getDoubleExtra("c", 1);
        dis = b*b -4*a*c;
        if (dis < 0)
        {
            Toast.makeText(this, "no answer", Toast.LENGTH_LONG).show();
        }
        else if(dis== 0)
        {
            tvx1.setVisibility(View.VISIBLE);
            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            tvx1.setText(x1+"");
        }
        else if (dis > 0)
        {
            tvx1.setVisibility(View.VISIBLE);
            tvx2.setVisibility(View.VISIBLE);

            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            x2 = (-b - Math.sqrt(dis)) / (2 * a);

            tvx1.setText(x1+"");
            tvx2.setText(x2+"");
        }
    }

    public void clickedReturnBtn(View view) {

        finish();
    }
}