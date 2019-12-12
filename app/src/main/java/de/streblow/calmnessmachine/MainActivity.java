package de.streblow.calmnessmachine;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.action_about:
                AboutDialog about = new AboutDialog(this);
                about.setTitle(R.string.about_title);
                about.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClickImageButton(View v) {
        final View finalView = v;
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                MediaPlayer mediaPlayer = new MediaPlayer();
                int resourceId = -1;
                switch (finalView.getId())
                {
                    case R.id.curse1:
                        resourceId = R.raw.teardrop;
                        break;
                    case R.id.curse2:
                        resourceId = R.raw.hasi;
                        break;
                    case R.id.curse3:
                        resourceId = R.raw.pizza;
                        break;
                    case R.id.curse4:
                        resourceId = R.raw.victory;
                        break;
                    case R.id.curse5:
                        resourceId = R.raw.clock;
                        break;
                    case R.id.curse6:
                        resourceId = R.raw.skull;
                        break;
                    case R.id.curse7:
                        resourceId = R.raw.thumbdown;
                        break;
                    case R.id.curse8:
                        resourceId = R.raw.bird;
                        break;
                    case R.id.curse9:
                        resourceId = R.raw.exclamation;
                        break;
                    case R.id.curse10:
                        resourceId = R.raw.dog;
                        break;
                    case R.id.curse11:
                        resourceId = R.raw.lick;
                        break;
                    case R.id.curse12:
                        resourceId = R.raw.fist;
                        break;
                    case R.id.curse13:
                        resourceId = R.raw.smilie;
                        break;
                    case R.id.curse14:
                        resourceId = R.raw.threeexclamation;
                        break;
                    case R.id.curse15:
                        resourceId = R.raw.calm;
                        break;
                    case R.id.curse16:
                        resourceId = R.raw.fart;
                        break;
                    default:
                        resourceId = -1;
                }
                if (resourceId != -1)
                {
                    mediaPlayer = MediaPlayer.create(context, resourceId);
                    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    mediaPlayer.setLooping(false);
                    mediaPlayer.start();
                    while (mediaPlayer.isPlaying() == true)
                    {
                    }
                }
            }
        }).start();
    }
}
