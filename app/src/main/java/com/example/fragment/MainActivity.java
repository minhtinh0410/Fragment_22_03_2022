package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

private EditText editName;
private Button btnClick;
private String mName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName=findViewById(R.id.editName);
        btnClick=findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataToFragment();
            }
        });

    }

    private void sendDataToFragment() {
        String strName= editName.getText().toString().trim();
        mName=strName;

        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_act, new Fragmentt());
        fragmentTransaction.commit();
    }


    public String getName() {
        return mName;
    }

    public EditText getEditName() {
        return editName;

    }
}