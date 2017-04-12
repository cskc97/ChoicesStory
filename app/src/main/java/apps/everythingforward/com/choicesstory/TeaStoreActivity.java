package apps.everythingforward.com.choicesstory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeaStoreActivity extends AppCompatActivity {

    @BindView(R.id.imageView)ImageView banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea_store);
        ButterKnife.bind(this);

        Picasso.with(getApplicationContext()).load(R.drawable.teastore).fit().centerCrop().into(banner);

    }
}
