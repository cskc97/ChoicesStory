package apps.everythingforward.com.choicesstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonFloatSmall;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageView)ImageView banner;
    @BindView(R.id.activityText)TextView displayText;
    @BindView(R.id.playcricketChoice)ButtonFlat playCricketChoice;
    @BindView(R.id.beatSharanChoice)ButtonFlat beatSharanChoice;
    @BindView(R.id.medicinesChoice)ButtonFlat medicinesChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        banner = (ImageView)findViewById(R.id.imageView);


        Picasso.with(getApplicationContext()).load(R.drawable.cricketwallpaper).fit().centerCrop().into(banner);


    }

    @OnClick(R.id.playcricketChoice) void playCricket()
    {
        startActivity(new Intent(getApplicationContext(),PlayCricketAgainstPoliceQuartersActivity.class));
    }

    @OnClick(R.id.beatSharanChoice) void beatSharan()
    {
        startActivity(new Intent(getApplicationContext(),BeatSharanActivity.class));
    }

    @OnClick(R.id.medicinesChoice) void getMedicines()
    {
        startActivity(new Intent(getApplicationContext(),GetMedicinesActivity.class));

    }
}
