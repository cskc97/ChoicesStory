package apps.everythingforward.com.choicesstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MCCActivity extends AppCompatActivity {

    @BindView(R.id.imageView)ImageView banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcc);
        ButterKnife.bind(this);

        Picasso.with(getApplicationContext()).load(R.drawable.chepaukstadium).fit().centerCrop().into(banner);
    }

    @OnClick(R.id.positiveChoice) void onPositiveChoice()
    {
        startActivity(new Intent(getApplicationContext(),PositiveChoiceActivity.class));

    }
    @OnClick(R.id.negativeChoice)void negativeChoice()
    {
        startActivity(new Intent(getApplicationContext(),NegativeChocieActivity.class));

    }
}
