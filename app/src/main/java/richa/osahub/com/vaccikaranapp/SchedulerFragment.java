package richa.osahub.com.vaccikaranapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class SchedulerFragment extends Fragment {
    ArrayAdapter<Vaccinations> vaccinationArrayAdapter;
    ListView listView;

    public SchedulerFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_scheduler, container, false);
        listView = (ListView) rootView.findViewById(R.id.listView);
        Vaccinations vaccination = new Vaccinations("abc", "def","jkh jkh jhdgsdfghs sdfjsij dafh");
        Vaccinations vaccination1= new Vaccinations("abcd","hgdg","hgsdhug adhgdf dgdgjsa bdfhg");
        Vaccinations vaccination2= new Vaccinations("abcd","hgdg","hgsdhug adhgdf dgdgjsa bdfhg");
        List<Vaccinations> vaccinations = new ArrayList<>();
        vaccinations.add(vaccination);
        vaccinations.add(vaccination1);
        vaccinations.add(vaccination2);

        vaccinationArrayAdapter = new VaccinationListAdapter(getActivity(), vaccinations);
        listView.setAdapter(vaccinationArrayAdapter);
        return rootView;
    }


}
