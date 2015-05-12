//Tim Garvin

package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


public class TwoDMotionQAActivity extends ActionBarActivity {

    ImageView imageView, imageViewtop;
    TextView textView;
    private AnimationDrawable mAnim;
    private int count = 0;
    private int answer[] = new int[] {0,0,0,0,0,0};
    private int total = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dmotion_qa);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation1);
        mAnim = (AnimationDrawable) imageView.getBackground();
        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
        imageViewtop.setImageResource(R.drawable.chart);
        textView = (TextView) findViewById(R.id.myImageViewText);
        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
        textView = (TextView) findViewById(R.id.textView1);
        textView.setText(Html.fromHtml(getString(R.string.twod_motionQuestion)));

        //textView = (TextView) findViewById(R.id.Score);
        //textView.setText(answer[0]+answer[1]+answer[2] + " out of " + total);

        final Button submitButton = (Button) findViewById(R.id.submit_button);
        final Button homeButton = (Button) findViewById(R.id.Home_button);
        final Button previousButton = (Button) findViewById(R.id.Previous_Button);
        final Button nextButton = (Button) findViewById(R.id.Next_Button);
        nextButton.setEnabled(true);

        final TextView numberCorrectText = (TextView) findViewById(R.id.correct_count_textview);
        //ScoreKeeper.updateScore(getApplicationContext(), numberCorrectText);

        // Capture button clicks
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(TwoDMotionQAActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        // Capture button clicks
        previousButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                /*// Start NewActivity.class
                Intent myIntent = new Intent(TwoDMotionQAActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent);*/

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
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.twod_motionQuestion)));
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
                        Intent myIntent = new Intent(TwoDMotionQAActivity.this,
                                MainActivity.class);
                        startActivity(myIntent);
                }
            }
        });

        // Capture button clicks
        nextButton.setOnClickListener(new View.OnClickListener() {
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
                        Intent myIntent = new Intent(TwoDMotionQAActivity.this,
                                MainActivity.class);
                        startActivity(myIntent);
                }
            }
        });

        // Capture radio button clicks
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                switch (count) {
                    case 0:
                        TextView result = (TextView) findViewById(R.id.textView2);

                        result.setVisibility(View.VISIBLE);

                        RadioButton correctAnswer = (RadioButton) findViewById(R.id.radioButton3);

                        String equation = getString(R.string.test_string); //Grabs an HTML tagged equation from strings.xml as a string
                        String explanation = ""; //Sets the explanation to explain why the correct answer is correct

                        if (correctAnswer.isChecked()) {
                            result.setText(Html.fromHtml("Correct!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                            result.setTextColor(Color.GREEN);
                            //ScoreKeeper.addPoint(getApplicationContext(), TwoDMotionQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(), numberCorrectText);
                        } else {
                            result.setText(Html.fromHtml("Incorrect! Try again!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                            result.setTextColor(Color.RED);
                            //ScoreKeeper.subtractPoint(getApplicationContext(), TwoDMotionQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(), numberCorrectText);
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
                            result.setTextColor(Color.GREEN);
                            //ScoreKeeper.addPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                            nextButton.setEnabled(true);
                            if (answer[1]==0)
                            {
                                answer[1] = 1;
                            }
                            //textView = (TextView) findViewById(R.id.Score);
                            //textView.setText(answer[0]+answer[1]+answer[2] + answer[3]+answer[4]+answer[5] + " out of " + total);
                        }
                        else
                        {
                            result.setText(Html.fromHtml("Incorrect! Try again!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                            result.setTextColor(Color.RED);
                            //ScoreKeeper.subtractPoint(getApplicationContext(), ConstantVelocityQAActivity.class.getSimpleName());
                            //ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                            if (answer[1]==1)
                            {
                                answer[1] = 0;
                            }
                            //textView = (TextView) findViewById(R.id.Score);
                            //textView.setText(answer[0]+answer[1]+answer[2] + answer[3]+answer[4]+answer[5] + " out of " + total);
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
        /*// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_dmotion_qa, menu);
        return true;*/

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
