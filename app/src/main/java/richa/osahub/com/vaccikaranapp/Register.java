package richa.osahub.com.vaccikaranapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Register extends AppCompatActivity {

    EditText first, last, email, pass, repass, dob, phone;
    TextView gender;
    TextView missing;
    RadioButton female, male;
    Button register1;
    Boolean validateFlag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        SharedPreferences prefs = getSharedPreferences("sarmin", MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefs.edit();

        first = (EditText) findViewById(R.id.first);
        last = (EditText) findViewById(R.id.last);
        email = (EditText) findViewById(R.id.email);
        dob = (EditText) findViewById(R.id.dob);
        pass = (EditText) findViewById(R.id.pass);
        repass = (EditText) findViewById(R.id.repass);
        phone = (EditText) findViewById(R.id.phone);
        gender = (TextView) findViewById(R.id.gender);
        female = (RadioButton) findViewById(R.id.female);
        male = (RadioButton) findViewById(R.id.male);

        missing = (TextView) findViewById(R.id.missing);
        register1 = (Button) findViewById(R.id.register1);


        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean flag = validate();

                if (flag) {
                    editor.putString("first_name", first.getText().toString());
                    editor.putString("last_name", last.getText().toString());
                    editor.putString("email", email.getText().toString());
                    editor.putString("dob", dob.getText().toString());
                    editor.putString("password", pass.getText().toString());
                    editor.putString("phone", phone.getText().toString());
                    editor.apply();
                    Intent inte = new Intent(getApplicationContext(), VacciKaran.class);
                    startActivity(inte);
                } else
                {
                    Toast.makeText( getApplicationContext(),"Field Missing",Toast.LENGTH_LONG);
                }
            }
        });

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setHintTextColor(Color.GRAY);
            }
        });
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setHintTextColor(Color.GRAY);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email.setHintTextColor(Color.GRAY);
            }
        });
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dob.setHintTextColor(Color.GRAY);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone.setHintTextColor(Color.GRAY);
            }
        });
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.setHintTextColor(Color.GRAY);
                pass.setTextColor(Color.BLACK);
            }
        });
        repass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repass.setHintTextColor(Color.GRAY);
                pass.setTextColor(Color.BLACK);
            }
        });
    }

    public Boolean validate() {
        if (first.getText().toString().equals("")) {
            validateFlag = false;
            missing.setText("**Fields Required!!!");
            first.setHintTextColor(Color.RED);

        }

        if (last.getText().toString().equals("")) {
            validateFlag = false;
            missing.setText("**Fields Required!!!");
            last.setHintTextColor(Color.RED);

        }


        if (email.getText().toString().equals("")) {
            validateFlag = false;
            missing.setText("**Fields Required!!");
            email.setHintTextColor(Color.RED);

        }

        if (dob.getText().toString().equals("")) {
            validateFlag = false;
            missing.setText("**Fields Required!!");
            dob.setHintTextColor(Color.RED);

        }

        if (phone.getText().toString().equals("")) {
            validateFlag = false;
            missing.setText("**Fields Required!!");
            phone.setHintTextColor(Color.RED);

        }

        if (pass.getText().toString().equals("")) {
            validateFlag = false;
            missing.setText("**Fields Required!!");
            pass.setHintTextColor(Color.RED);

        }


        if (repass.getText().toString().equals("")) {
            validateFlag = false;
            missing.setText("**Fields Required!!");
            repass.setHintTextColor(Color.RED);

        }

        /*if (female.getText().toString().equals("")) {
            missing.setText("**Fields Required!!");
            female.setTextColor(Color.RED);
            female.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    female.setTextColor(Color.GRAY);
                }
            });
        } else if (male.getText().toString().equals("")) {
            missing.setText("**Fields Required!!");
            male.setTextColor(Color.RED);
            male.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    male.setTextColor(Color.GRAY);
                }
            });
        }*/

        if (!pass.getText().toString().equals(repass.getText().toString())) {
            validateFlag = false;
            missing.setText("Passwords do not match");
            pass.setTextColor(Color.RED);
            repass.setTextColor(Color.RED);
        }
        return validateFlag;
    }


}

