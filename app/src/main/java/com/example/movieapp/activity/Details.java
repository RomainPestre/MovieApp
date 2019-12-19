package com.example.movieapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.movieapp.R;

public class Details extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        /*
        getSecondIntent();
    }

    private void getSecondIntent(){
        if(getIntent().hasExtra("title")){
            String titleString = getIntent().getStringExtra("title");
            String descriptionString = getIntent().getStringExtra("description");
            String dateString = getIntent().getStringExtra("date");
            //String ratingString = getIntent().getStringExtra("rating");
            String urlPic = getIntent().getStringExtra("poster");

            initText(titleString, descriptionString, dateString/*, ratingString*//*, urlPic);
        }
    }

    private void initText(String title, String description, String release_date/*, String rating_note*//*, String posterpath){
        TextView titleTV = findViewById(R.id.movietitle);
        titleTV.setText(title);

        CollapsingToolbarLayout titleMv = findViewById(R.id.title);
        titleMv.setTitle(title);

        TextView desc = findViewById(R.id.moviedescription);
        desc.setText(description);

        TextView date = findViewById(R.id.date);
        date.setText(release_date);

        /*TextView rating = findViewById(R.id.mvrating);
        rating.setText(rating_note);*//*

        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
        ImageView poster = findViewById(R.id.aa_thumbnail);
        Glide.with(this).load(urlPic).apply(requestOptions).into(poster);
    }*/
        // hide the default actionbar
        getSupportActionBar().hide();

        //Recieve data
        String titleString = getIntent().getStringExtra("title");
        String descriptionString = getIntent().getStringExtra("description");
        String dateString = getIntent().getStringExtra("date");
        String urlPic = "https://image.tmdb.org/t/p/w500" + getIntent().getStringExtra("poster");

        //init views
        TextView titleTV = findViewById(R.id.movietitle);
        CollapsingToolbarLayout titleMv = findViewById(R.id.title);
        TextView desc = findViewById(R.id.moviedescription);
        TextView date = findViewById(R.id.date);
        ImageView poster = findViewById(R.id.aa_thumbnail);

        //setting values to each view
        titleTV.setText(titleString);
        titleMv.setTitle(titleString);
        desc.setText(descriptionString);
        date.setText(dateString);

        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
        Glide.with(this).load(urlPic).apply(requestOptions).into(poster);

    }
}
