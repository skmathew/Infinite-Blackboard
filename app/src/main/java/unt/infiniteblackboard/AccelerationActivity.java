// Zijia Zhai

package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class AccelerationActivity extends ActionBarActivity {

    TextToSpeech tts;
    ImageView imageView;
    private AnimationDrawable mAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation2);
        mAnim = (AnimationDrawable) imageView.getBackground();



        final Button homeButton = (Button) findViewById(R.id.Home_button);
        final Button previousButton = (Button) findViewById(R.id.Previous_Button);
        final Button nextButton = (Button) findViewById(R.id.Next_Button);

        // Capture button clicks
        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(AccelerationActivity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        // Capture button clicks
        previousButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AccelerationActivity.this,
                        MainActivity.class); //Change MainActivity.class to name of 1D Motion Activity (QA or Review?) class later
                startActivity(myIntent);
            }
        });

        // Capture button clicks
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AccelerationActivity.this,
                        AccelerationQAActivity.class);
                startActivity(myIntent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_acceleration, menu);
        return true;
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

