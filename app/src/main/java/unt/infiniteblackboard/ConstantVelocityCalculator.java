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
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ConstantVelocityCalculator extends ActionBarActivity {
    EditText amount1;
    EditText amount2;
    TextView tt;
    Button calculate;
    double x=0;
    double y=0;
    double z=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constant_velocity_calculator);
        initControls();

        final Button button = (Button) findViewById(R.id.Home_button);

        // Capture button clicks home
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ConstantVelocityCalculator.this,
                        MainActivity.class);
                startActivity(myIntent);


            }
        });
    }
    private void initControls()
    {
        final AlertDialog.Builder builder1 = new AlertDialog.Builder(ConstantVelocityCalculator.this);
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
        x=Double.parseDouble(amount1.getText().toString());
        y=Double.parseDouble(amount2.getText().toString());
        z=x/y;
        tt.setText(Double.toString(z));
    }


}