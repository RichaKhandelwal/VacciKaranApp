package richa.osahub.com.vaccikaranapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 7/17/2015.
 */
public class VaccinationListAdapter extends ArrayAdapter<Vaccinations> {
    LayoutInflater inflater;
    List<Vaccinations> vaccinations = new ArrayList<>();

    public VaccinationListAdapter(Activity activity, List<Vaccinations> objects) {
        super(activity,R.layout.vacci_list, objects);
        vaccinations = objects;
        inflater=activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position,View view,ViewGroup parent)
    {
        View rootview=inflater.inflate(R.layout.vacci_list,parent,false);
        TextView name = (TextView)rootview.findViewById(R.id.vacciName);
        TextView duration=(TextView)rootview.findViewById(R.id.duration);
        Button info=(Button)rootview.findViewById(R.id.info);
        final TextView details=(TextView)rootview.findViewById(R.id.details);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(details.getVisibility()==View.GONE)
                    details.setVisibility(View.VISIBLE);
                else
                    details.setVisibility(View.GONE);
            }
        });


        name.setText(vaccinations.get(position).getVacciName());
        duration.setText(vaccinations.get(position).getDuration());
        details.setText(vaccinations.get(position).getDetails());
        return rootview;
    }
}
