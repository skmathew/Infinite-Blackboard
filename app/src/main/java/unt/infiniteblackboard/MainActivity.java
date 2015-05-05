package unt.infiniteblackboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static TextView txtLink1;
    public static final int TOTAL_QUESTION = 6;
    public static final String PREF_QUESTIONS_CORRECT = "pref_questions_correct";
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    int[] images = {R.drawable.blackbaord,R.drawable.youtube,R.drawable.test};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the ListView resource.

        /*
        mainListView = (ListView) findViewById( R.id.mainListView );
        String[] sections = getResources().getStringArray(R.array.sections);
        ArrayList<String> sectionList = new ArrayList<String>();
        sectionList.addAll( Arrays.asList(sections) );
        // Create ArrayAdapter
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, sectionList);
        mainListView.setAdapter( listAdapter );

*/
        String[] sections = getResources().getStringArray(R.array.sections);

        mainListView = (ListView) findViewById( R.id.mainListView );
        VAdapter adapter = new VAdapter(this,sections,images);
        //ArrayAdapter<String> adapter1  = new ArrayAdapter<String>(this, R.layout.single_row, R.id.textView, sections);
        mainListView.setAdapter(adapter);


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id)
            {

                switch(position)
                {
                    case 0:
                    Intent intent = new Intent(MainActivity.this, ConstantVelocityActivity.class);
                    startActivity(intent);
                    break;

                    case 1:
                        intent = new Intent(MainActivity.this, VideoActivity.class);
                        intent.putExtra("id", "d-_eqgj5-K8");
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(MainActivity.this, ConstantVelocityQAActivity.class);
                        startActivity(intent);
                        break;

/*                    case 3:
                        intent = new Intent(MainActivity.this, AverageVelocityActivity.class);
                        startActivity(intent);
                        break;

                    case 4:
                        intent = new Intent(MainActivity.this, VideoActivity.class);
                        intent.putExtra("id", "oRKxmXwLvUU");
                        startActivity(intent);
                        break;

                    case 5:
                        intent = new Intent(MainActivity.this, AverageVelocityQAActivity.class);
                        startActivity(intent);
                        break;
*/
                    case 6:
                        intent = new Intent(MainActivity.this, SpeedActivity.class);
                        startActivity(intent);
                        break;

                    case 7:
                        intent = new Intent(MainActivity.this, VideoActivity.class);
                        intent.putExtra("id", "zAx61CO5mDw");
                        startActivity(intent);
                        break;

                    case 8:
                        intent = new Intent(MainActivity.this, SpeedQAActivity.class);
                        startActivity(intent);
                        break;

                    case 9:
                        intent = new Intent(MainActivity.this, AccelerationActivity.class);
                        startActivity(intent);
                        break;

                    case 10:
                        intent = new Intent(MainActivity.this, VideoActivity.class);
                        intent.putExtra("id", "FOkQszg1-j8");
                        startActivity(intent);
                        break;

                    case 11:
                        intent = new Intent(MainActivity.this, AccelerationQAActivity.class);
                        startActivity(intent);
                        break;

                    case 12:
                        intent = new Intent(MainActivity.this, OneDMotionActivity.class);
                        startActivity(intent);
                        break;

                    case 13:
                        intent = new Intent(MainActivity.this, VideoActivity.class);
                        intent.putExtra("id", "8wZugqi_uCg");
                        startActivity(intent);
                        break;

                    case 14:
                        intent = new Intent(MainActivity.this, OneDMotionQAActivity.class);
                        startActivity(intent);
                        break;

                }

            }
        });



        ScoreKeeper.clearScore(this);
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
                        ConstantVelocityActivity.class);
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
                        OneDMotionActivity.class);
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


class VAdapter extends ArrayAdapter<String>
{
    Context context;
    int[] images;
    String[] titleArray;
    VAdapter(Context c, String[] titles, int imgs[])
    {
        super(c,R.layout.single_row,R.id.textView,titles);
        this.context=c;
        this.images=imgs;
        this.titleArray = titles;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row,parent,false);
        ImageView myImage = (ImageView) row.findViewById(R.id.imageView);
        TextView myText = (TextView) row.findViewById(R.id.textView);

        myImage.setImageResource(images[position%3]);
        myText.setText(titleArray[position]);
        return row;
    }
}
