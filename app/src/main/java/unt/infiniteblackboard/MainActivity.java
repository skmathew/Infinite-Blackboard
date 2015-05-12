package unt.infiniteblackboard;

import android.content.Context;
import android.graphics.Color;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
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
    int[] images = {R.drawable.blackbaord,R.drawable.youtube,R.drawable.calculator,R.drawable.test};
    private AnimationDrawable mAnim;
    ImageView imageView;
    TextView textView;

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

        textView = (TextView) findViewById(R.id.myImageViewText);
        Typeface font = Typeface.createFromAsset(getAssets(), "Lucida_Handwrit.ttf");
        textView.setTypeface(font);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.view_animation2);
        mAnim = (AnimationDrawable) imageView.getBackground();

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
                        intent.putExtra("topic", "Constant Velocity");
                        startActivity(intent);
                        break;

                    case 2:
                        intent = new Intent(MainActivity.this, ConstantVelocityCalculator.class);
                        startActivity(intent);
                        break;

                    case 3:
                        intent = new Intent(MainActivity.this, ConstantVelocityQAActivity.class);
                        startActivity(intent);
                        break;

                }

            }
        });



        //ScoreKeeper.clearScore(this);
    }


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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();
        Toast.makeText(getApplicationContext(), item.getTitle() + " selected", Toast.LENGTH_SHORT).show();
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

        myText.setTextColor(Color.WHITE);
        myText.setTypeface(null, Typeface.BOLD);

        myImage.setImageResource(images[position%4]);
        myText.setText(titleArray[position]);
        return row;
    }
}
