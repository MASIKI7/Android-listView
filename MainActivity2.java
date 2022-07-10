package com.zara.socialnetworks;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imageView;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        imageView = (ImageView) findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();
        String socialMedia = bundle.getString("social");
        toolbar.setTitle(socialMedia);

        if(socialMedia.equalsIgnoreCase("Facebook")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.facebok));
        }
        else if(socialMedia.equalsIgnoreCase("Twitter")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.twitter));
        }
        else if(socialMedia.equalsIgnoreCase("Instagram")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.instagram));
        }
        else if(socialMedia.equalsIgnoreCase("Linked In")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.linked));
        }
        else if(socialMedia.equalsIgnoreCase("Whatsapp")){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.whatsapp));
        }
    }
}