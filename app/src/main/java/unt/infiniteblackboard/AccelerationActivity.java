// Zijia Zhai

package unt.infiniteblackboard;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

//

public class AccelerationActivity extends ActionBarActivity {


    ImageView imageView, imageViewtop;
    TextView textView;
    private AnimationDrawable mAnim;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration);

        TextView Textv1 = (TextView) findViewById(R.id.textView1);
        final String texts1 = Textv1.getText().toString();

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation_graph);
        mAnim = (AnimationDrawable) imageView.getBackground();

        textView = (TextView) findViewById(R.id.myImageViewText);
        textView.setText(Html.fromHtml(getString(R.string.Acc)));

        TextView tv = (TextView) findViewById(R.id.textView1);
        tv.setMovementMethod(new ScrollingMovementMethod());



        final Button button = (Button) findViewById(R.id.Home_button);
        final Button button1 = (Button) findViewById(R.id.Previous_Button);
        final Button button2 = (Button) findViewById(R.id.Next_Button);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AccelerationActivity.this,
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq
                        )));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_0)));

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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(getString(R.string.Acc_1));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_2)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_3)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_4)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_5)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_6)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_7)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_8)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_9)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_10)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_11)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_12)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_13)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_14)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_15)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_16)));
                        break;


                    default:
                        // Start NewActivity.class
                        Intent myIntent = new Intent(AccelerationActivity.this,
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_1)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(getString(R.string.Acc_2));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_3)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_4)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_5)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_6)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_7)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_8)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_9)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_10)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_11)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_12)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_13)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_14)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_15)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_16)));
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
                        textView.setText(Html.fromHtml(getString(R.string.Acc_eq1)));
                        textView = (TextView) findViewById(R.id.textView1);
                        textView.setText(Html.fromHtml(getString(R.string.Acc_17)));
                        break;



                    default:
                        // Start NewActivity.class
                        Intent myIntent = new Intent(AccelerationActivity.this,
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
