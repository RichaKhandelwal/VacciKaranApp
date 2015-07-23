package richa.osahub.com.vaccikaranapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class VacciWall extends AppCompatActivity {


    ListView posts;

    List<Sfeed> listOfFeeds = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacci_wall);
        posts = (ListView) findViewById(R.id.posts);

        for (int i = 0; i < 10; i++) {
            Sfeed sfeed = new Sfeed("abc", new Date(), "xyz");
            listOfFeeds.add(sfeed);
        }

        SarrayAdapter sarrayAdapter = new SarrayAdapter(VacciWall.this, listOfFeeds);
        posts.setAdapter(sarrayAdapter);

    }


}
