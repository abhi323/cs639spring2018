package com.example.abhishek.assignment1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView birdTxt;
    TextView catTxt;
    TextView dogTxt;
    ImageView birdImg;
    ImageView catImg;
    ImageView dogImg;
    Button purpleBtn;
    Button btnDrkblue;
    Button maroonBtn;
    Button redBtn;
    Button brownBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variable declarations are done here
        birdTxt = findViewById(R.id.birdTxt);
        birdTxt.setVisibility(View.INVISIBLE);
        catTxt = findViewById(R.id.catTxt);
        catTxt.setVisibility(View.INVISIBLE);
        dogTxt = findViewById(R.id.dogTxt);
        dogTxt.setVisibility(View.INVISIBLE);

        birdImg = findViewById(R.id.firstImg);
        catImg = findViewById(R.id.secondImg);
        dogImg = findViewById(R.id.thirdImg);

        purpleBtn = findViewById(R.id.purpleBtn);
        btnDrkblue = findViewById(R.id.darkBluebtn);
        maroonBtn = findViewById(R.id.maroonBtn);
        redBtn = findViewById(R.id.redBtn);
        brownBtn = findViewById(R.id.brownBtn);
        birdImg.setOnClickListener(this);
        catImg.setOnClickListener(this);
        dogImg.setOnClickListener(this);

        purpleBtn.setOnClickListener(this);
        btnDrkblue.setOnClickListener(this);
        maroonBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        brownBtn.setOnClickListener(this);

    }


        @Override
        public void onClick(View view) {

        // this case will set the text of the selected image. Others will become invisible
        switch(view.getId()){
            case R.id.firstImg:
                if(birdTxt.getVisibility() == View.INVISIBLE){

                    birdTxt.setVisibility(View.VISIBLE);
                    catTxt.setVisibility(View.INVISIBLE);
                    dogTxt.setVisibility(View.INVISIBLE);
                    break;

                }else{

                    birdTxt.setVisibility(View.INVISIBLE);
                    break;
                }

            case R.id.secondImg:
                if(catTxt.getVisibility() == View.INVISIBLE){

                    catTxt.setVisibility(View.VISIBLE);
                    birdTxt.setVisibility(View.INVISIBLE);
                    dogTxt.setVisibility(View.INVISIBLE);
                    break;

                }else{

                    catTxt.setVisibility(View.INVISIBLE);
                    break;
                }

            case R.id.thirdImg:
                if(dogTxt.getVisibility() == View.INVISIBLE){

                    dogTxt.setVisibility(View.VISIBLE);
                    birdTxt.setVisibility(View.INVISIBLE);
                    catTxt.setVisibility(View.INVISIBLE);
                    break;
                }else{

                    dogTxt.setVisibility(View.INVISIBLE);
                    break;
                }


                // This case sets the color for the image that is selected. Sets the color to purple.
            case R.id.purpleBtn:
                if(birdTxt.getVisibility() != View.INVISIBLE)
                    birdImg.setColorFilter(Color.rgb(153,51,255), PorterDuff.Mode.SRC_IN);
                else if(dogTxt.getVisibility() != View.INVISIBLE)
                    dogImg.setColorFilter(Color.rgb(153,51,255), PorterDuff.Mode.SRC_IN);
                else if(catTxt.getVisibility() != View.INVISIBLE)
                    catImg.setColorFilter(Color.rgb(153,51,255), PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Image should be selected first. Change color after that!",
                            Toast.LENGTH_LONG).show();
                break;

            // This case sets the color for the image that is selected. Sets the color to dark blue.
            case R.id.darkBluebtn:
                if(birdTxt.getVisibility() != View.INVISIBLE)
                    birdImg.setColorFilter(Color.rgb(0,0,102), PorterDuff.Mode.SRC_IN);
                else if(dogTxt.getVisibility() != View.INVISIBLE)
                    dogImg.setColorFilter(Color.rgb(0,0,102), PorterDuff.Mode.SRC_IN);
                else if(catTxt.getVisibility() != View.INVISIBLE)
                    catImg.setColorFilter(Color.rgb(0,0,102), PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Image should be selected first. Change color after that!",
                            Toast.LENGTH_LONG).show();
                break;

            // This case sets the color for the image that is selected. Sets the color to maroon.
            case R.id.maroonBtn:
                if(birdTxt.getVisibility() != View.INVISIBLE)
                    birdImg.setColorFilter(Color.rgb(204,0,102), PorterDuff.Mode.SRC_IN);
                else if(dogTxt.getVisibility() != View.INVISIBLE)
                    dogImg.setColorFilter(Color.rgb(204,0,102), PorterDuff.Mode.SRC_IN);
                else if(catTxt.getVisibility() != View.INVISIBLE)
                    catImg.setColorFilter(Color.rgb(204,0,102), PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Image should be selected first. Change color after that!",
                            Toast.LENGTH_LONG).show();
                break;

            // This case sets the color for the image that is selected. Sets the color to red.
            case R.id.redBtn:
                if(birdTxt.getVisibility() != View.INVISIBLE)
                    birdImg.setColorFilter(Color.rgb(255,0,0), PorterDuff.Mode.SRC_IN);
                else if(dogTxt.getVisibility() != View.INVISIBLE)
                    dogImg.setColorFilter(Color.rgb(255,0,0), PorterDuff.Mode.SRC_IN);
                else if(catTxt.getVisibility() != View.INVISIBLE)
                    catImg.setColorFilter(Color.rgb(255,0,0), PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Image should be selected first. Change color after that!",
                            Toast.LENGTH_LONG).show();
                break;

            // This case sets the color for the image that is selected. Sets the color to brown.
            case R.id.brownBtn:
                if(birdTxt.getVisibility() != View.INVISIBLE)
                    birdImg.setColorFilter(Color.rgb(153,76,0), PorterDuff.Mode.SRC_IN);
                else if(dogTxt.getVisibility() != View.INVISIBLE)
                    dogImg.setColorFilter(Color.rgb(153,76,0), PorterDuff.Mode.SRC_IN);
                else if(catTxt.getVisibility() != View.INVISIBLE)
                    catImg.setColorFilter(Color.rgb(153,76,0), PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Image should be selected first. Change color after that!",
                            Toast.LENGTH_LONG).show();
                break;

            default:
                break;

        }
    }

}
