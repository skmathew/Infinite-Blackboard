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
                "http://r9---sn-aiglln7s.googlevideo.com/videoplayback?mt=1430298563&mv=m&ms=au&ip=2a02%3A2498%3Ae000%3A85%3A87%3A%3A2&ipbits=0&expire=1430320223&mm=31&id=o-ACQixO0b3ccPkL9yB_kyi57Mv5aT_S5PA_4pCR6FPMSg&mime=video%2Fmp4&pl=32&key=yt5&itag=18&signature=4C348F091F77BBA81E22EB55AFD11EDCC67A80C7.2297667BD46428F7EF055D4F1659B8000FB90A76&upn=mD_DcQyR36I&ratebypass=yes&source=youtube&nh=IgpwcjAzLmxocjE0KgkxMjcuMC4wLjE&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Cmime%2Cmm%2Cms%2Cmv%2Cnh%2Cpl%2Cratebypass%2Csource%2Cupn%2Cexpire&sver=3&fexp=900720%2C901802%2C907263%2C916943%2C934954%2C938028%2C9405997%2C9407123%2C9407663%2C9408050%2C9408619%2C9408708%2C9408710%2C9412517%2C9413150%2C947233%2C948124%2C952612%2C952637%2C952640%2C957201&initcwndbps=2357500&dur=705.236&title=Calculating+Average+Velocity+or+Speed";
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
