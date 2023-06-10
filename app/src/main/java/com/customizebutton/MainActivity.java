package com.customizebutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button roundedRectangleButton;
    private Button ovalButton;
    private Button gradientButton;
    private Button strokeButton;
    private Button layerlistButton;
    private Button iconCircularButton;
    private Button numberCircleButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roundedRectangleButton = findViewById(R.id.rectangularButton);
        roundedRectangleButton.setOnClickListener(this);

        ovalButton = findViewById(R.id.ovalButton);
        ovalButton.setOnClickListener(this);

        gradientButton = findViewById(R.id.gradientButton);
        gradientButton.setOnClickListener(this);

        strokeButton = findViewById(R.id.strokeButton);
        strokeButton.setOnClickListener(this);

        layerlistButton = findViewById(R.id.layerlistButton);
        layerlistButton.setOnClickListener(this);

        iconCircularButton = findViewById(R.id.iconCircularButton);
        iconCircularButton.setOnClickListener(this);

        numberCircleButton = findViewById(R.id.numberCircleButton);
        numberCircleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rectangularButton:
                Toast.makeText(MainActivity.this, getString(R.string.rectangular_Button),Toast.LENGTH_SHORT).show();
                break;
            case R.id.ovalButton:
                Toast.makeText(MainActivity.this,  getString(R.string.oval_button),Toast.LENGTH_SHORT).show();
                break;
            case R.id.gradientButton:
                Toast.makeText(MainActivity.this,  getString(R.string.gradient_button),Toast.LENGTH_SHORT).show();
                break;
            case R.id.strokeButton:
                Toast.makeText(MainActivity.this,  getString(R.string.stroke_button),Toast.LENGTH_SHORT).show();
                break;
            case R.id.layerlistButton:
                Toast.makeText(MainActivity.this,  getString(R.string.layer_list_button),Toast.LENGTH_SHORT).show();
                break;
            case R.id.iconCircularButton:
                Toast.makeText(MainActivity.this,  getString(R.string.icon_button),Toast.LENGTH_SHORT).show();
                break;
            case R.id.numberCircleButton:
                Toast.makeText(MainActivity.this,  getString(R.string.number_button),Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
