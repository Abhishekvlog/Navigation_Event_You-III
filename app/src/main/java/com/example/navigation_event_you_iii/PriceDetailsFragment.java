package com.example.navigation_event_you_iii;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class PriceDetailsFragment extends Fragment {
    private EditText currency,price;
    private Button BtnPrice;
    private String title,description,statTime,EndTime,startDate,EndDate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null){
            title=getArguments().getString("title");
            description=getArguments().getString("description");
            startDate=getArguments().getString("startDate");
            EndDate=getArguments().getString("endTime");
            statTime=getArguments().getString("startTime");
            EndTime=getArguments().getString("endTime");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_price_detail, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        currency=view.findViewById(R.id.Currency);
        price=view.findViewById(R.id.price);
        BtnPrice=view.findViewById(R.id.BtnPrice);
        BtnPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Price=price.getText().toString();
                Model modelClass=new Model(title,description,startDate,statTime,EndDate,EndTime,Price);
                Intent intent=new Intent(getActivity(),PreviewActivity.class);
                intent.putExtra("Model", modelClass);
                startActivity(intent);
            }
        });
    }
}