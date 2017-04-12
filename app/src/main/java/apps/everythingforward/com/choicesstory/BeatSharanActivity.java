package apps.everythingforward.com.choicesstory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BeatSharanActivity extends AppCompatActivity {

    ImageView banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beat_sharan);
        banner = (ImageView)findViewById(R.id.imageView);

        Picasso.with(getApplicationContext()).load(R.drawable.fractureimage).fit().centerInside().into(banner);
    }
}
