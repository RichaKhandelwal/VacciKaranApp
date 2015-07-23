package richa.osahub.com.vaccikaranapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class VacciKaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacci_karan);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Thread next = new Thread(){
            public void run(){
                try{
                    sleep(3000);

                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(getApplicationContext(),VacciKaran.class);
                    startActivity(i);
                }
            }
        };
        next.start();

    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}


