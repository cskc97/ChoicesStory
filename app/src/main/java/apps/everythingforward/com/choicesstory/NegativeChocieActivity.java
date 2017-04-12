package apps.everythingforward.com.choicesstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NegativeChocieActivity extends AppCompatActivity {

    @BindView(R.id.imageView)ImageView banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negative_chocie);
        ButterKnife.bind(this);
        Picasso.with(getApplicationContext()).load(R.drawable.ashes_fight).fit().centerCrop().into(banner);
    }

    @OnClick(R.id.negativeContinueCricket) void onPositiveChoice()
    {
        startActivity(new Intent(getApplicationContext(),NegativeContineCricketActivity.class));

    }
    @OnClick(R.id.becomeCoach)void negativeChoice()
    {
        startActivity(new Intent(getApplicationContext(),BecomeCoachActivity.class));

    }
}
