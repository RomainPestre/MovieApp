package com.example.movieapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import com.example.movieapp.R;

public class Details extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSecondIntent();
    }

    private void getSecondIntent(){
        if(getIntent().hasExtra("title")){
            String titleString = getIntent().getStringExtra("title");
            String descriptionString = getIntent().getStringExtra("description");
            String dateString = getIntent().getStringExtra("date");
            /*String ratingString = getIntent().getStringExtra("rating");*/

            initText(titleString, descriptionString, dateString/*, ratingString*/);
        }
    }

    private void initText(String title, String description, String release_date/*, String rating_note*/){
        TextView titleTV = findViewById(R.id.movietitle);
        titleTV.setText(title);

        CollapsingToolbarLayout titleMv = findViewById(R.id.title);
        titleMv.setTitle(title);

        TextView desc = findViewById(R.id.moviedescription);
        desc.setText(description);

        TextView date = findViewById(R.id.date);
        date.setText(release_date);

        /*TextView rating = findViewById(R.id.mvrating);
        rating.setText(rating_note);*/
    }
}
