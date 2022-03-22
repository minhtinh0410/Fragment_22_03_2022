package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Fragmentt extends Fragment {

    private EditText editName;
    private Button btnUp;
    private View view;
    private MainActivity mainActivity;

    public Fragmentt() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.frag01, container, false);
        mainActivity= (MainActivity) getActivity();
        initUI();
        return view;
    }

    private void initUI() {
        editName= view.findViewById(R.id.editName);
        btnUp= view.findViewById(R.id.btnUp);
        editName.setText(mainActivity.getName());
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataToActivity();
            }
        });
    }

    private void sendDataToActivity() {
        String strNameUpdate= editName.getText().toString().trim();
        mainActivity.getEditName().setText(strNameUpdate);
    }
}
