package com.riza.delivery.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.riza.delivery.R;
import com.riza.delivery.data.PopularEntity;

public class ShowDetailActivity extends AppCompatActivity {
    TextView tvName,tvfee;
    ImageView imgpopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_show_detail );

        tvName = findViewById(R.id.textView4);
        imgpopular = findViewById(R.id.foodPic);
        tvfee = findViewById(R.id.numberItemTxt );

        PopularEntity popular = getIntent().getParcelableExtra("POPLAR");
        tvName.setText(popular.getName());
        tvfee.setText(popular.getFee());
        Glide.with(ShowDetailActivity.this)
                .load(popular.getImage())
                .into(imgpopular);

    }
}