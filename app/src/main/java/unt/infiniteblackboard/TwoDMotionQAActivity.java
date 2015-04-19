//Tim Garvin

package unt.infiniteblackboard;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class TwoDMotionQAActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dmotion_qa);

        final Button submitButton = (Button) findViewById(R.id.submit_button);
        final Button homeButton = (Button) findViewById(R.id.Home_button);
        final Button previousButton = (Button) findViewById(R.id.Previous_Button);

        final TextView numberCorrectText = (TextView) findViewById(R.id.correct_count_textview);
        ScoreKeeper.updateScore(getApplicationContext(), numberCorrectText);

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

                // Start NewActivity.class
                Intent myIntent = new Intent(TwoDMotionQAActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent);
            }
        });

        // Capture radio button clicks
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                TextView result = (TextView) findViewById(R.id.textView2);

                result.setVisibility(View.VISIBLE);

                RadioButton correctAnswer = (RadioButton) findViewById(R.id.radioButton3);

<<<<<<< HEAD
                String equation = getString(R.string.test_string); //Grabs an HTML tagged equation from strings.xml as a string
                String explanation = ""; //Sets the explanation to explain why the correct answer is correct

                if(correctAnswer.isChecked())
                {
                    result.setText(Html.fromHtml("Correct!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
=======
                Button disableSubmit = (Button) findViewById(R.id.submit_button);

                disableSubmit.setEnabled(false);

                if(correctAnswer.isChecked())
                {
                    result.setText("Correct!");

>>>>>>> 0b4547948fed23e964070a8aef61aa4117d0a649
                    result.setTextColor(Color.GREEN);
                    ScoreKeeper.addPoint(getApplicationContext(), TwoDMotionQAActivity.class.getSimpleName());
                    ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                }
                else
                {
                    result.setText(Html.fromHtml("Incorrect! Try again!<br><br>" + explanation)); //Displays the results of the user's answer according to the HTML tags
                    result.setTextColor(Color.RED);
                    ScoreKeeper.subtractPoint(getApplicationContext(), TwoDMotionQAActivity.class.getSimpleName());
                    ScoreKeeper.updateScore(getApplicationContext(),numberCorrectText);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_dmotion_qa, menu);
        return true;
    }

    @Override
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
    }
}
