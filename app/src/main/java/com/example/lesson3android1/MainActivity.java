package com.example.lesson3android1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnOne, btnTwo, btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
        initClickers();
    }

    private void initialization() {
        imageView = findViewById(R.id.im_photo);
        btnOne = findViewById(R.id.btn_btn_one);
        btnTwo = findViewById(R.id.btn_btn_two);
        btnThree = findViewById(R.id.btn_btn_three);
    }

    public void changeImage(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                imageView.setImageResource(R.drawable.kia);
                break;
            case R.id.btn_two:
                imageView.setImageResource(R.drawable.rangerover);
                break;
            case R.id.btn_three:
                imageView.setImageResource(R.drawable.lexus);
        }
    }

    private void initClickers() {
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.kia).getConstantState()){
                    Toast.makeText(MainActivity.this, "Молодец", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Далбаеб", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.rangerover).getConstantState()){
                    Toast.makeText(MainActivity.this, "Да ты прав)", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Хорошенько подумай(", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (imageView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.lexus).getConstantState()){
                    Toast.makeText(MainActivity.this, "Молодец", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Далбаеб", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}