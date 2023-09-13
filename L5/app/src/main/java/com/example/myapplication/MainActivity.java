package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup radioGroupCheese;
    private RadioButton radioButtonCheese;

    private RadioGroup radioGroupShape;
    private RadioButton radioButtonShape;

    ActivityMainBinding binding;

    private String result;

    private List<String> topping = new ArrayList<>();
    private String shape = "";
    private String cheese = "";

    private int checkBoxCount = 0;

    private Button relativeButton;

    private Button tableButton;

    private Button constraintButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        relativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intent);
            }
        });

        tableButton = (Button) findViewById(R.id.button_table);
        tableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });

        constraintButton = (Button) findViewById(R.id.button_constraint);
        constraintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

    }


}