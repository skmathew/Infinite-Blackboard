package unt.infiniteblackboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;



public class MainActivity extends ActionBarActivity {

    private static TextView txtLink1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.txtLink1);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(MainActivity.this,
                       DisplacementActivity.class);
                startActivity(myIntent);
            }
        });

        final Button buttonSpeed = (Button) findViewById(R.id.txtLink2);

        // Capture button clicks
        buttonSpeed.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(MainActivity.this,
                        SpeedActivity.class);
                startActivity(myIntent);
            }
        });

        final Button buttonVelocity = (Button) findViewById(R.id.txtLink3);

        // Capture button clicks
        buttonVelocity.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(MainActivity.this,
                        VelocityActivity.class);
                startActivity(myIntent);
            }
        });

        final Button buttonAcceleration = (Button) findViewById(R.id.txtLink4);

        // Capture button clicks
        buttonAcceleration.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(MainActivity.this,
                        AccelerationActivity.class);
                startActivity(myIntent);
            }
        });

        final Button button2D = (Button) findViewById(R.id.txtLink7);

        // Capture button clicks
        button2D.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class


                Intent myIntent = new Intent(MainActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent);
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

