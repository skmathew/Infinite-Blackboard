package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
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
    private int answer[] = new int[] {0,0,0,0,0,0};
    private int total = 2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackboard_qa);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation1);
        mAnim = (AnimationDrawable) imageView.getBackground();
        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
        imageViewtop.setImageResource(R.drawable.chart1);
        textView = (TextView) findViewById(R.id.myImageViewText);
        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
        Typeface font = Typeface.createFromAsset(getAssets(), "Lucida_Handwrit.ttf");
        textView.setTypeface(font);

        textView = (TextView) findViewById(R.id.textView1);
        textView.setText(Html.fromHtml(getString(R.string.VelQA)));

        textView = (TextView) findViewById(R.id.Score);
        textView.setText(answer[0]+answer[1]+answer[2] + " out of " + total);





        final Button submitButton = (Button) findViewById(R.id.submit_button);
        final Button button = (Button) findViewById(R.id.Home_button);
        final Button button1 = (Button) findViewById(R.id.Previous_Button);
        final Button button2 = (Button) findViewById(R.id.Next_Button);
        button2.setEnabled(true);

        //final TextView numberCorrectText = (TextView) findViewById(R.id.correct_count_textview);
        //ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);


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

                switch (count){
                    case 1:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }

                        TextView result = (TextView) findViewById(R.id.textView2);
                        result.setVisibility(View.INVISIBLE);

                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        //imageViewtop.setImageResource(0);
                        imageViewtop.setImageResource(R.drawable.chart1);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.VelQA)));
                        RadioButton answer = (RadioButton) findViewById(R.id.radioButton);
                        answer.setText(R.string.VelQAa1);
                        answer = (RadioButton) findViewById(R.id.radioButton2);
                        answer.setText(R.string.VelQAa2);
                        answer = (RadioButton) findViewById(R.id.radioButton3);
                        answer.setText(R.string.VelQAa3);
                        answer = (RadioButton) findViewById(R.id.radioButton4);
                        answer.setText(R.string.VelQAa4);
                        break;



                    default:
                        // Start
                        Intent myIntent = new Intent(ConstantVelocityQAActivity.this,
                                MainActivity.class);
                        startActivity(myIntent);
                }
            }
        });


        // Capture button clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                switch (count){
                    case 0:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }

                        TextView result = (TextView) findViewById(R.id.textView2);
                        result.setVisibility(View.INVISIBLE);

                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        //imageViewtop.setImageResource(0);
                        imageViewtop.setImageResource(R.drawable.chart5);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.VelQA1)));
                        RadioButton answer = (RadioButton) findViewById(R.id.radioButton);
                        answer.setText(R.string.VelQA1a1);
                        answer = (RadioButton) findViewById(R.id.radioButton2);
                        answer.setText(R.string.VelQA1a2);
                        answer = (RadioButton) findViewById(R.id.radioButton3);
                        answer.setText(R.string.VelQA1a3);
                        answer = (RadioButton) findViewById(R.id.radioButton4);
                        answer.setText(R.string.VelQA1a4);
                        break;

                    default:
                        // Start
                        Intent myIntent = new Intent(ConstantVelocityQAActivity.this,
                                MainActivity.class);
                        startActivity(myIntent);
                }
            }
        });


        // Capture radio button clicks
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                switch (count){
                    case 0:
                        TextView result = (TextView) findViewById(R.id.textView2);
                        result.setVisibility(View.VISIBLE);
                        RadioButton correctAnswer = (RadioButton) findViewById(R.id.radioButton);

                        String equation = getString(R.string.test_string); //Grabs an HTML tagged equation from strings.xml as a string
                        String explanation = ""; //Sets the explanation to explain why the correct answer is correct

                        if(correctAnswer.isChecked())
                        {
                            result.setText(Html.fromHtml("Correct!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                            result.setTextColor(Color.WHITE);
                            //ScoreKeeper.addPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                            button2.setEnabled(true);
                            if (answer[0]==0)
                            {
                                answer[0] = 1;
                            }
                            textView = (TextView) findViewById(R.id.Score);
                            textView.setText(answer[0]+answer[1]+answer[2] + answer[3]+answer[4]+answer[5] + " out of " + total);
                        }
                        else
                        {
                            result.setText(Html.fromHtml("Incorrect! Try again!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                            result.setTextColor(Color.WHITE);
                            //ScoreKeeper.subtractPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                            if (answer[0]==1)
                            {
                                answer[0] = 0;
                            }
                            textView = (TextView) findViewById(R.id.Score);
                            textView.setText(answer[0]+answer[1]+answer[2] + answer[3]+answer[4]+answer[5] + " out of " + total);
                        }
                        break;

                    case 1:
                        result = (TextView) findViewById(R.id.textView2);
                        result.setVisibility(View.VISIBLE);
                        correctAnswer = (RadioButton) findViewById(R.id.radioButton2);

                	    equation = getString(R.string.test_string); //Grabs an HTML tagged equation from strings.xml as a string
                	    explanation = ""; //Sets the explanation to explain why the correct answer is correct

                        if(correctAnswer.isChecked())
                        {
                            result.setText(Html.fromHtml("Correct!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                            result.setTextColor(Color.WHITE);
                            //ScoreKeeper.addPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                            button2.setEnabled(true);
                            if (answer[1]==0)
                            {
                                answer[1] = 1;
                            }
                            textView = (TextView) findViewById(R.id.Score);
                            textView.setText(answer[0]+answer[1]+answer[2] + answer[3]+answer[4]+answer[5] + " out of " + total);
                        }
                        else
                        {
                            result.setText(Html.fromHtml("Incorrect! Try again!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                            result.setTextColor(Color.WHITE);
                            //ScoreKeeper.subtractPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                            if (answer[1]==1)
                            {
                                answer[1] = 0;
                            }
                            textView = (TextView) findViewById(R.id.Score);
                            textView.setText(answer[0]+answer[1]+answer[2] + answer[3]+answer[4]+answer[5] + " out of " + total);
                        }
                        break;

                    default:
                        // Start
                        break;
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
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }



}
