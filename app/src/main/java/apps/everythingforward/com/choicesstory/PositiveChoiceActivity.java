package apps.everythingforward.com.choicesstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PositiveChoiceActivity extends AppCompatActivity {

    @BindView(R.id.imageView)ImageView banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive_choice);
        ButterKnife.bind(this);
        Picasso.with(getApplicationContext()).load(R.drawable.father_son_cricket).fit().centerCrop().into(banner);
    }

    @OnClick(R.id.positiveContinueCricket) void onPositiveChoice()
    {
        startActivity(new Intent(getApplicationContext(),PositiveContineCricketActivity.class));

    }
    @OnClick(R.id.quitCricket)void negativeChoice()
    {
        startActivity(new Intent(getApplicationContext(),QuitCricketActivity.class));

    }

}
