package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


public class ConstantVelocityQAActivity extends ActionBarActivity {

    ImageView imageView, imageViewtop;
    TextView textView;
    private AnimationDrawable mAnim;
    private int count = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constantvelocity_qa);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation1);
        mAnim = (AnimationDrawable) imageView.getBackground();
        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
        imageViewtop.setImageResource(R.drawable.chart);
        textView = (TextView) findViewById(R.id.myImageViewText);
        textView = (TextView) findViewById(R.id.myImageViewText);
        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
        textView = (TextView) findViewById(R.id.textView1);
        textView.setText(Html.fromHtml(getString(R.string.VelQA)));




        final Button submitButton = (Button) findViewById(R.id.submit_button);
        final Button button = (Button) findViewById(R.id.Home_button);
        final Button button1 = (Button) findViewById(R.id.Previous_Button);
        final Button button2 = (Button) findViewById(R.id.Next_Button);
        button2.setEnabled(true);

        final TextView numberCorrectText = (TextView) findViewById(R.id.correct_count_textview);
        ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);


        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ConstantVelocityQAActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        // Capture button clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ConstantVelocityQAActivity.this,
                        ConstantVelocityActivity.class);
                startActivity(myIntent);
            }
        });


        // Capture button clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ConstantVelocityQAActivity.this,
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

                String equation = getString(R.string.test_string); //Grabs an HTML tagged equation from strings.xml as a string
                String explanation = ""; //Sets the explanation to explain why the correct answer is correct

                if(correctAnswer.isChecked())
                {
                    result.setText(Html.fromHtml("Correct!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                    result.setTextColor(Color.GREEN);
                    ScoreKeeper.addPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
                    ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                    button2.setEnabled(true);

                }
                else
                {
                    result.setText(Html.fromHtml("Incorrect! Try again!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                    result.setTextColor(Color.RED);
                    ScoreKeeper.subtractPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
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
