package com.example.navigation_event_you_iii;
import android.content.Context;
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

public class EventDetailsFragment extends Fragment {
    private EditText title;
    private EditText description;
    private Button nextEvent;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_detail, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= Navigation.findNavController(view);
        initView(view);
    }

    private void initView(View view) {
        title=view.findViewById(R.id.Title);
        description=view.findViewById(R.id.descreption);
        nextEvent=view.findViewById(R.id.BtnEvent);
        nextEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String event=title.getText().toString();
                String dis=description.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("title",event);
                bundle.putString("description",dis);
                navController.navigate(R.id.action_eventDetailsFragment_to_timeAndDateFragment,bundle);

            }
        });
    }
}