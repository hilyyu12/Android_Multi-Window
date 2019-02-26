package smktelkom.hilyyu26.multiwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Thread threadSplash;
    TextView txtTitle;
    private long ms = 0;
    private long splashTime = 3000;
    private boolean splashActive = true;
    private boolean SplashPause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread th  = new Thread (){
            public void run(){
                try{
                    while(splashActive && ms < splashTime){
                        if(!SplashPause) {
                            ms = ms + 100;
                        }sleep(100);
                    }
                }catch (Exception e){
                    //TODO : handle exception
                }
                finally{
                    Intent i  = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i);
                }
            }
        }; th.start();
    }

}
