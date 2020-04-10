package com.example.trymeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View window;
    private Button trymebutton;
    private int[] colors={R.color.colorPrimaryDark,Color.GREEN,Color.BLUE,Color.YELLOW,Color.RED,R.color.colorforrandom};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        window=findViewById(R.id.WindowsID);
        trymebutton=(Button)findViewById(R.id.trymebutton);
        trymebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random=new Random();
                int randNum=random.nextInt(colors.length);

                window.setBackgroundColor(colors[randNum]);
                Log.d("RandomColor",String.valueOf(randNum));
                Toast.makeText(getApplicationContext(),colors[randNum]+" "+"color",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
