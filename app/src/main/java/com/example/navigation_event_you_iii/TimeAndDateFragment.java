package com.example.navigation_event_you_iii;
import android.os.Bundle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TimeAndDateFragment extends Fragment {
    private String title,description;
    private EditText startDate,endDate,startTime,endTime;
    private Button BtnNextTime;
    private NavController navController;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null){
            title=getArguments().getString("title");
            description=getArguments().getString("description");


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_and_date, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= Navigation.findNavController(view);
        initView(view);
    }

    private void initView(View view) {
        startDate=view.findViewById(R.id.startDate);
        endDate=view.findViewById(R.id.endDate);
        startTime=view.findViewById(R.id.StartTime);
        endTime=view.findViewById(R.id.endTime);
        BtnNextTime=view.findViewById(R.id.BtnTime);
        BtnNextTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sd=startDate.getText().toString();
                String ed=endDate.getText().toString();
                String st=startTime.getText().toString();
                String et=endTime.getText().toString();
                title=getArguments().getString("title");
                description=getArguments().getString("description");
                Bundle bundle=new Bundle();
                bundle.putString("title",title);
                bundle.putString("description",description);
                bundle.putString("startDate",sd);
                bundle.putString("endDate",ed);
                bundle.putString("startTime",st);
                bundle.putString("endTime",et);
                navController.navigate(R.id.action_timeAndDateFragment_to_priceDetailsFragment,bundle);

            }
        });
    }
}