package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


public class DisplacementQAActivity extends ActionBarActivity {

    TextToSpeech tts;
    ImageView imageView;
    private AnimationDrawable mAnim;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displacement_qa);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation1);
        mAnim = (AnimationDrawable) imageView.getBackground();


        final Button submitButton = (Button) findViewById(R.id.submit_button);
        final Button button = (Button) findViewById(R.id.Home_button);
        final Button button1 = (Button) findViewById(R.id.Previous_Button);
        final Button button2 = (Button) findViewById(R.id.Next_Button);

        final TextView numberCorrectText = (TextView) findViewById(R.id.correct_count_textview);
        ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);


        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DisplacementQAActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DisplacementQAActivity.this,
                        DisplacementActivity.class);
                startActivity(myIntent);
            }
        });


        // Capture button clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DisplacementQAActivity.this,
                        AccelerationActivity.class);
                startActivity(myIntent);
            }
        });


        // Capture radio button clicks
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView result = (TextView) findViewById(R.id.textView2);

                result.setVisibility(View.VISIBLE);

                RadioButton correctAnswer = (RadioButton) findViewById(R.id.radioButton);

                if(correctAnswer.isChecked())
                {
                    result.setText("Correct!");
                    result.setTextColor(Color.GREEN);

                    Button disableSubmit = (Button) findViewById(R.id.submit_button);

                    disableSubmit.setEnabled(false);

                    ScoreKeeper.addPoint(getApplicationContext(), DisplacementQAActivity.class.getSimpleName());
                    ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);

                }
                else
                {
                    result.setText("Incorrect! Try again!");
                    result.setTextColor(Color.RED);
                    ScoreKeeper.subtractPoint(getApplicationContext(), DisplacementQAActivity.class.getSimpleName());
                    ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);

                }
            }
        });

    }


    @Override
    protected  void onPause() {
        super.onPause();
        if (mAnim.isRunning()){
            mAnim.stop();
        }

        if(tts !=null)
        {
            tts.stop();
            tts.shutdown();
        }
        super.onPause();

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocused)
    {
        super.onWindowFocusChanged(hasFocused);
        if(hasFocused){
            mAnim.start();
        }



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



}
