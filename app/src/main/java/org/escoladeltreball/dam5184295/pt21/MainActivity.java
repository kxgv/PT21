package org.escoladeltreball.dam5184295.pt21;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.media.AudioManager;


public class MainActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener{

    MediaPlayer mediaPlayer;
    ImageButton button1, button2, button3, button4;
    private int SoundID;
    boolean loaded;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        ImageButton button1 = findViewById(R.id.button1);
        ImageButton button2 = findViewById(R.id.button2);
        ImageButton button3 = findViewById(R.id.button3);
        ImageButton button4 = findViewById(R.id.button4);

        MediaPlayer mediaPlayer = new MediaPlayer();
        SoundPool soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        SoundID = soundPool.load(this, R.raw.sound1, 1);

        //TODO -- agregar setOnClickListener al button1, agregar OnLoadCompleteListener
        //button1.setOnClickListener();

        // TODO -- descargar los sonidos de --> http://rpg.hamsterrepublic.com/ohrrpgce/Free_Sound_Effects

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if (loaded == true){
            AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
            SoundPool soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
            Log.d("Test", "Playing songs");
        }
        return false;
    }
}
