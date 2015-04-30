package unt.infiniteblackboard;

/**
 * Created by RAFI on 4/27/2015.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class VelocityVideo extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.velocity_video);

        VideoView vidView = (VideoView) findViewById(R.id.myVideo);
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);

        String vidAddress =
"http://r2---sn-bxpbiucg51pa-btoe.googlevideo.com/videoplayback?itag=22&pcm2cms=yes&signature=2EF217AA1C001AA3E6D35A4E8F34C8AB2AD60406.DC2434FE832487393EB7D24925A11E1981994A5E&expire=1430445010&mm=31&ip=177.52.66.113&key=yt5&ms=au&mv=m&mt=1430423214&sparams=dur%2Cid%2Cinitcwndbps%2Cip%2Cipbits%2Citag%2Cmime%2Cmm%2Cms%2Cmv%2Cpcm2cms%2Cpl%2Cratebypass%2Csource%2Cupn%2Cexpire&pl=24&id=o-AJTV_mEPWXCBlOwdIoKCHfFJ7Hm7ZkMgw6eOF_XYXlbu&mime=video%2Fmp4&sver=3&ratebypass=yes&upn=MKx3g_a1U0g&ipbits=0&fexp=900720%2C907263%2C916656%2C934954%2C937420%2C938028%2C9405994%2C9406813%2C9407000%2C9407664%2C9407882%2C9408137%2C9408142%2C9408706%2C9409252%2C9412761%2C948124%2C948825%2C952612%2C952637%2C955202%2C957201&initcwndbps=332500&source=youtube&dur=705.236&title=Calculating+Average+Velocity+or+Speed";
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
