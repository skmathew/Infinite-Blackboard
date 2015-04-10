package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class DisplacementActivity extends ActionBarActivity {



    TextToSpeech tts;
    ImageView imageView;
    TextView textView;
    private AnimationDrawable mAnim;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displacement);

        TextView Textv1 = (TextView) findViewById(R.id.displacement1);
        final String texts1 = Textv1.getText().toString();


        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation1);
        mAnim = (AnimationDrawable) imageView.getBackground();



        textView = (TextView) findViewById(R.id.myImageViewText);
        textView.setText(Html.fromHtml(getString(R.string.disp_bb)));



        TextView tv = (TextView) findViewById(R.id.displacement1);
        tv.setMovementMethod(new ScrollingMovementMethod());

        /*

        //text to speech code
        tts = new TextToSpeech(DisplacementActivity.this, new TextToSpeech.OnInitListener() {
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    tts.setLanguage(Locale.US);

                    tts.speak(texts1,TextToSpeech.QUEUE_ADD,null);
                    tts.speak(texts2,TextToSpeech.QUEUE_ADD,null);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Feature not Supported in Your Device!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        //text to speech code end


*/


        final Button button = (Button) findViewById(R.id.Home_button);
        final Button button1 = (Button) findViewById(R.id.Previous_Button);
        final Button button2 = (Button) findViewById(R.id.Next_Button);


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

        // Capture button clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(DisplacementActivity.this,
                        DisplacementQAActivity.class);
                startActivity(myIntent);
            }
        });

    }



//
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
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_displacement, menu);
        return super.onCreateOptionsMenu(menu);
    }






}
