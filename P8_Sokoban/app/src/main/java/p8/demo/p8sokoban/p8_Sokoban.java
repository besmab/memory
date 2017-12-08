package p8.demo.p8sokoban;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

// declaration de notre activity héritée de Activity
public class p8_Sokoban extends Activity {

    private SokobanView mSokobanView;

   //
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {


        // initialise notre activity avec le constructeur parent    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.snake);
         mediaPlayer.start();


        Button play = (Button)findViewById(R.id.play);



        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               // setContentView(R.layout.menu);
                setContentView(R.layout.main);

                mSokobanView = (SokobanView)findViewById(R.id.SokobanView);
                // rend visible la vue
                mSokobanView.setVisibility(View.VISIBLE);



            }
        });


        final Button quit = (Button)findViewById(R.id.quit);

        quit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               finish();
            }
        });

        Button about = (Button)findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.about);

                Button home = (Button)findViewById(R.id.home);
                home.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        setContentView(R.layout.menu);
                    }
                });
            }
        });





         final ImageButton sound = (ImageButton) findViewById(R.id.sound);


        sound.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                 sound.setImageResource(R.mipmap.sound);

                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    sound.setImageResource(R.mipmap.notsound);
                }
                else{
                    mediaPlayer.start();
                    sound.setImageResource(R.mipmap.sound);
                }


            }
        });





    }


}