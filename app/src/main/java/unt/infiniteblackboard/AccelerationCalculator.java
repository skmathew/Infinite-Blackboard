package unt.infiniteblackboard;

/**
 * Created by RAFI on 5/2/2015.
 */

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AccelerationCalculator extends ActionBarActivity {
    EditText amount1;
    EditText amount2;
    EditText amount3;
    EditText amount4;
    TextView tt;
    Button calculate;
    double a=0;
    double b=0;
    double c=0;
    double d=0;
    double e=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.average_velocity_calculator);
        initControls();

        ((TextView)findViewById(R.id.calculate)).setText(Html.fromHtml("Calculate Acceleration (m/s<sup><small>2</small></sup>"));

        final Button button = (Button) findViewById(R.id.Home_button);

        // Capture button clicks home
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AccelerationCalculator.this,
                        MainActivity.class);
                startActivity(myIntent);


            }
        });
    }
    private void initControls()
    {
        final AlertDialog.Builder builder1 = new AlertDialog.Builder(AccelerationCalculator.this);
        builder1.setMessage("Please Enter a valid number");
        builder1.setCancelable(true);
        builder1.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });



        amount1=(EditText)findViewById(R.id.amount1);
        amount2=(EditText)findViewById(R.id.amount2);
        amount3=(EditText)findViewById(R.id.amount3);
        amount4=(EditText)findViewById(R.id.amount4);

        tt=(TextView)findViewById(R.id.tt);
        calculate=(Button)findViewById(R.id.calculate);
        calculate.setOnClickListener(new OnClickListener()
        {public void onClick
                    (View  v) {

                if(amount1.getText().equals(null) || amount2.getText().equals(null))
                {

                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                }


                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
                calculate();}});
    }
    private void calculate()
    {
        a=Double.parseDouble(amount1.getText().toString());
        b=Double.parseDouble(amount2.getText().toString());
        c=Double.parseDouble(amount3.getText().toString());
        d=Double.parseDouble(amount4.getText().toString());
        e=(c-a)/(d-b);
        tt.setText(Double.toString(e));
    }


}