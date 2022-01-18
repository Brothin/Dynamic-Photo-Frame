package com.example.dynamicphotoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton prev,next;
    ImageView pic;
    int currentImage=0;
    String[] names={"Captain America (Steve Rogers)","Iron Man (Robert Downey Jr.)","Thor (Chris Hemsworth)","Incredible Hulk (Mark Ruffalo)","Spider Man (Tom Holland)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prev(View view)
    {
        // Hide current image
        String idX="pic"+currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        // Show previous image
        currentImage=(4 + currentImage) % 5;
        String idY="pic"+currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        TextView text=findViewById(R.id.textView);
        text.setText(names[currentImage]);
    }

    public void next(View view)
    {
        // Hide current image
        String idX="pic"+currentImage;
        int x=this.getResources().getIdentifier(idX,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        // Show next image
        currentImage=(6 + currentImage) % 5;
        String idY="pic"+currentImage;
        int y=this.getResources().getIdentifier(idY,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        TextView text=findViewById(R.id.textView);
        text.setText(names[currentImage]);
    }
}