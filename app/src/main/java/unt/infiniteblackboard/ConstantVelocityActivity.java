package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class ConstantVelocityActivity extends ActionBarActivity {

    ImageView imageView, imageViewtop;
    TextView textView;
    private AnimationDrawable mAnim;
    private int count = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constantvelocity);

        TextView Textv1 = (TextView) findViewById(R.id.textView1);
        final String texts1 = Textv1.getText().toString();

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation1);
        mAnim = (AnimationDrawable) imageView.getBackground();

        textView = (TextView) findViewById(R.id.myImageViewText);
        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));

        TextView tv = (TextView) findViewById(R.id.textView1);
        tv.setMovementMethod(new ScrollingMovementMethod());

        final Button button = (Button) findViewById(R.id.Home_button);
        final Button button1 = (Button) findViewById(R.id.Previous_Button);
        final Button button2 = (Button) findViewById(R.id.Next_Button);

        /*
        textView = (TextView) findViewById(R.id.textView1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),
                "fonts/Erika Type.ttf");
        textView.setTypeface(custom_font);
        */


        // Capture button clicks home
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                        // Start NewActivity.class
                        Intent myIntent = new Intent(ConstantVelocityActivity.this,
                                MainActivity.class);
                        startActivity(myIntent);


            }
        });

        // Capture button clicks back click
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                switch (count){
                    case 1:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq
                        )));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel)));
                        break;

                    case 2:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(getString(R.string.Vel_1));
                        break;

                    case 3:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_2)));
                        break;


                    case 4:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_3)));
                        break;


                    case 5:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_4)));
                        break;

                    case 6:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_5)));
                        break;


                    case 7:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_6)));
                        break;


                    case 8:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_7)));
                        break;

                    case 9:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_8)));
                        break;


                    case 10:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_9)));
                        break;

                    case 11:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_10)));
                        break;

                    case 12:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_11)));
                        break;

                    case 13:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart1);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_12)));
                        break;


                    case 14:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart2);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_13)));
                        break;

                    case 15:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart2);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_14)));
                        break;

                    case 16:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart2);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_15)));
                        break;

                    case 17:
                        count--;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart3);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_16)));
                        break;


                    default:
                        // Start NewActivity.class
                        Intent myIntent = new Intent(ConstantVelocityActivity.this,
                                MainActivity.class);
                        startActivity(myIntent);
                }
            }
        });





        // Capture button clicks next button
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                switch (count){
                    case 0:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_1)));
                        break;

                    case 1:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(getString(R.string.Vel_2));
                        break;

                    case 2:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_3)));
                        break;


                    case 3:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_4)));
                        break;


                    case 4:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_5)));
                        break;

                    case 5:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_6)));
                        break;


                    case 6:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        imageViewtop.setImageResource(0);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_7)));
                        break;


                    case 7:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_8)));
                        break;

                    case 8:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_9)));
                        break;

                    case 9:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_10)));
                        break;

                    case 10:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_11)));
                        break;

                    case 11:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart1);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_12)));
                        break;

                    case 12:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart2);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_13)));
                        break;

                    case 13:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart2);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_14)));
                        break;

                    case 14:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart2);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_15)));
                        break;


                    case 15:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart3);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_16)));
                        break;

                    case 16:
                        count++;
                        if (mAnim.isRunning()){
                            mAnim.stop();
                        }
                        imageView = (ImageView) findViewById(R.id.imageView);
                        imageView.setBackgroundResource(R.drawable.view_animation1);
                        imageViewtop = (ImageView) findViewById(R.id.imageViewtop);
                        imageViewtop.setImageResource(R.drawable.chart4);
                        mAnim = (AnimationDrawable) imageView.getBackground();
                        mAnim.start();
                        textView = (TextView) findViewById(R.id.myImageViewText);
                        textView.setText(Html.fromHtml(getString(R.string.Vel5_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Vel_17)));
                        break;



                    default:
                        // Start NewActivity.class
                        Intent myIntent = new Intent(ConstantVelocityActivity.this,
                                MainActivity.class);
                        startActivity(myIntent);
                }

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

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocused)
    {
        super.onWindowFocusChanged(hasFocused);
        if(hasFocused) {
            mAnim.start();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_constantvelocity, menu);
        return super.onCreateOptionsMenu(menu);
    }






}
