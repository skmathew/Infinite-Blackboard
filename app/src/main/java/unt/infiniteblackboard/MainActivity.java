package unt.infiniteblackboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static TextView txtLink1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startButton = (Button) findViewById(R.id.Start_Button);



        // Capture button clicks
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        DisplacementActivity.class);
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
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        //return super.onOptionsItemSelected(item);

        Toast.makeText(getApplicationContext(), item.getTitle() + " selected", Toast.LENGTH_SHORT).show();

        switch (item.getItemId()) {
            case R.id.displacement_menu:
                Intent myIntent = new Intent(MainActivity.this,
                        DisplacementActivity.class);
                startActivity(myIntent);
                break;
            case R.id.speed_menu:
                Intent myIntent1 = new Intent(MainActivity.this,
                        SpeedActivity.class);
                startActivity(myIntent1);
                break;

            case R.id.velocity_menu:
                Intent myIntent2 = new Intent(MainActivity.this,
                        VelocityActivity.class);
                startActivity(myIntent2);
                break;

            case R.id.acceleration_menu:
                Intent myIntent3 = new Intent(MainActivity.this,
                        AccelerationActivity.class);
                startActivity(myIntent3);
                break;

            case R.id.oneD_Motion_menu:
                Intent myIntent4 = new Intent(MainActivity.this,
                        AccelerationActivity.class);
                startActivity(myIntent4);
                break;

            case R.id.twoD_Motion_menu:
                Intent myIntent5 = new Intent(MainActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent5);
                break;

            case R.id.formulas_menu:
                Intent myIntent6 = new Intent(MainActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent6);
                break;

            case R.id.review_menu:
                Intent myIntent7 = new Intent(MainActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent7);
                break;


        }
        return true;

    }
}