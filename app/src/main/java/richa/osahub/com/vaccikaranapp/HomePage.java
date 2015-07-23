package richa.osahub.com.vaccikaranapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class HomePage extends Fragment {

   ImageButton schedule, wall;
    ImageButton forum, locator;
    public HomePage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_page, container, false);
        schedule = (ImageButton)rootView.findViewById(R.id.schedule);
        forum = (ImageButton)rootView.findViewById(R.id.forum);
        locator = (ImageButton)rootView.findViewById(R.id.locator);
        wall = (ImageButton) rootView.findViewById(R.id.wall);

        locator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity().getApplicationContext(),VacciLocatorActivity.class);
                startActivity(in);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getActivity().getApplicationContext(),MainActivity.class);
                startActivity(inte);
            }
        });

        wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intend = new Intent(getActivity().getApplicationContext(),VacciWall.class);
                startActivity(intend);
            }
        });

        forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intr = new Intent(getActivity().getApplicationContext(), VacciForumActivity.class);
                startActivity(intr);
            }
        });
        return rootView;
    }


}
