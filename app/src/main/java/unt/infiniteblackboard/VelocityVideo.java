package unt.infiniteblackboard;

/**
 * Created by RAFI on 4/27/2015.
 */

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class VelocityVideo extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.velocity_video);

        VideoView vidView = (VideoView) findViewById(R.id.myVideo);
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);

        String vidAddress =
                "http://r9---sn-aiglln7s.googlevideo.com/videoplayback?key=yt5&nh=IgpwcjAzLmxocjE0KgkxMjcuMC4wLjE&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Cmime%2Cmm%2Cms%2Cmv%2Cnh%2Cpl%2Cratebypass%2Csource%2Cupn%2Cexpire&mt=1430181630&sver=3&ratebypass=yes&ipbits=0&fexp=900228%2C900720%2C907263%2C909728%2C916726%2C934954%2C938028%2C9406983%2C9407115%2C9408347%2C945132%2C947233%2C948124%2C948703%2C951703%2C952612%2C952637%2C957201&mime=video%2Fmp4&signature=F4EAB400D0A7F0EAAB3A726AB2776EC07A9E15D9.27E50EA5645F054759EFF6BF43AB6013227693D9&ms=au&source=youtube&mv=m&id=o-AKQWvc0p-a0guWwijuFPWWGjj_gCc8L9TySFszO8Qw_T&initcwndbps=1677500&pl=32&dur=705.236&itag=18&ip=2a02%3A2498%3Ae002%3A88%3A58%3A%3A2&mm=31&expire=1430203320&upn=3MdHkNGqH4U&title=Calculating+Average+Velocity+or+Speed";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        vidView.start();


        final Button button = (Button) findViewById(R.id.homebutton);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(VelocityVideo.this,
                        ConstantVelocityActivity.class);
                startActivity(myIntent);


            }
        });

    }
}
