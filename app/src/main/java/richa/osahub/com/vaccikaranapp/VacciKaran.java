package richa.osahub.com.vaccikaranapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class VacciKaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);


        final EditText email;
        final EditText pass;
        final Button signin;
        final Button register;

        final SharedPreferences prefs=getSharedPreferences("sarmin",MODE_PRIVATE);
        final SharedPreferences.Editor edit=prefs.edit();

        email=(EditText)findViewById(R.id.e_mail);
        pass=(EditText)findViewById(R.id.pas);

        signin=(Button)findViewById(R.id.signin);
        register= (Button)findViewById(R.id.register);

        if(prefs.contains("email"))
        {
            if(prefs.contains("password"))
            {
                email.setText(prefs.getString("email", "hello"));
               // pass.setText(prefs.getString("password","hello"));
            }
        }


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), HomeActivity.class);
                //  edit.putString("user", email.getText().toString());
                //edit.putString("pass", pass.getText().toString());

                if (prefs.contains("user") && prefs.getString("user", "").equals(email.getText().toString())) {
                    if (prefs.contains("pass") && prefs.getString("pass", "").equals(pass.getText().toString())) {
                        edit.apply();
                        startActivity(in);
                    }
                }
            }

        });

            register.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
    });
}
}