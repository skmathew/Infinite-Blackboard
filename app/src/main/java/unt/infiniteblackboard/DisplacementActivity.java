package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class DisplacementActivity extends ActionBarActivity {

    private TextToSpeech tts;
    ImageView imageView;
    Integer[] image = { R.drawable.comp01, R.drawable.comp15,R.drawable.comp30 };
    private AnimationDrawable mAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displacement);



        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation);

        mAnim = (AnimationDrawable) imageView.getBackground();
        //mAnim.start();

        //for(int i=0;i<5000;i++){
        //imageView.startAnimation(AnimationUtils.loadAnimation(DisplacementActivity.this, android.R.anim.slide_out_right));
        //imageView.setImageResource(image[i]);
        //}


       // String question = getResources().getString(R.string.question);
        //speakWords(question);

        final Button button = (Button) findViewById(R.id.Home_button);
        final Button button1 = (Button) findViewById(R.id.Previous_Button);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(DisplacementActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DisplacementActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

    }

    private void speakWords(String question) {
        //speak(question, TextToSpeech.QUEUE_ADD);
        //speak straight away
       
    }

    @Override
    protected  void onPause() {
        super.onPause();
        if (mAnim.isRunning()){
            mAnim.stop();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocused)
    {
        super.onWindowFocusChanged(hasFocused);
        if(hasFocused){
            mAnim.start();
        }
    }





}
