package apps.everythingforward.com.choicesstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GetMedicinesActivity extends AppCompatActivity {

    @BindView(R.id.imageView)ImageView banner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_medicines);

        ButterKnife.bind(this);

        Picasso.with(getApplicationContext()).load(R.drawable.medicines).fit().centerCrop().into(banner);
    }

    @OnClick(R.id.teaStore) void teaStoreChoice()
    {
        startActivity(new Intent(getApplicationContext(),TeaStoreActivity.class));

    }
    @OnClick(R.id.paperMillChoice) void paperMill()
    {
        startActivity(new Intent(getApplicationContext(),PaperMillActivity.class));

    }
    @OnClick(R.id.mccAcademyChoice) void mccAcademy()
    {
        startActivity(new Intent(getApplicationContext(),MCCActivity.class));

    }
}
