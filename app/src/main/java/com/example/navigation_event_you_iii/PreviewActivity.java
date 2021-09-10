package com.example.navigation_event_you_iii;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {
    private TextView title1,description,startDate,endDate,startTome,endTime,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initView();
        getDataFromIntent();

    }

    private void getDataFromIntent() {
        Model modelClass= (Model) getIntent().getSerializableExtra("Model");
        title1.setText("Event : "+modelClass.getTitle());
        description.setText("Description : "+modelClass.getDescription());
        startTome.setText("Start Time :"+modelClass.getStartTime());
        startDate.setText("Start Date: "+modelClass.getStartDate());
        endTime.setText("End Time :" +modelClass.getEndTime());
        endDate.setText("End Date : "+modelClass.getEndDate());
        price.setText("Price : "+modelClass.getPrice());
    }

    private void initView() {
        title1=findViewById(R.id.EventTitlePreview);
        description=findViewById(R.id.eventDescPreview);
        startDate=findViewById(R.id.EventStarDatePreview);
        startTome=findViewById(R.id.EventStartTimePreview);
        endDate=findViewById(R.id.EventEndDatePreview);
        endTime=findViewById(R.id.EventEndTimePreview);
        price=findViewById(R.id.pricePreview);
    }
}