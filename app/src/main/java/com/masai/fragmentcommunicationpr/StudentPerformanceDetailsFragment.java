package com.masai.fragmentcommunicationpr;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;


public class StudentPerformanceDetailsFragment extends Fragment {
    private EditText mGrade;
    private EditText mPercentage;
    private String name;
    private Button mBtnPreview;
    private int age;

    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name =getArguments().getString("name");
        age =getArguments().getInt("age");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_performance_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mGrade = view.findViewById(R.id.etStudentGrade);
        mPercentage=view.findViewById(R.id.etStudentPercentage);
        mBtnPreview = view.findViewById(R.id.btnPreview);

        mBtnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grade = mGrade.getText().toString();
                String Percentage = mPercentage.getText().toString();
                Model model = new Model(name,age,grade,Percentage);
                Intent intent = new Intent(getContext(),PreviewActivity.class);
                intent.putExtra("model",  model);
                startActivity(intent);


            }
        });
    }
}