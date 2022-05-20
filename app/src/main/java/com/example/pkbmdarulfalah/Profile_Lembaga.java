package com.example.pkbmdarulfalah;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.PrimitiveIterator;

public class Profile_Lembaga extends Activity {

    private TextView email;
    private TextView yt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_lembaga);

        email = findViewById(R.id.email_pkbm);
        yt = findViewById(R.id.youtube_pkbm);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("mailto: pkbmdarulfalah.jepara@gmail.com");
            }
    });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/channel/UCZUoYqAsI0SAub1ss5mSv-Q");
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
