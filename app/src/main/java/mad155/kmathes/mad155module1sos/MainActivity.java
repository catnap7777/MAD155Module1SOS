package mad155.kmathes.mad155module1sos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton rbAllergies = (RadioButton) findViewById(R.id.rb1);
        final RadioButton rbMeds = (RadioButton) findViewById(R.id.rb2);
        final RadioButton rbConditions = (RadioButton) findViewById(R.id.rb3);
        final RadioButton rbContacts = (RadioButton) findViewById(R.id.rb4);

        Button btn1 = (Button) findViewById(R.id.button1);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rbAllergies.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, ListAllergies.class);
                    startActivity(intent);
                }

                if(rbMeds.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, ListMeds.class);
                    startActivity(intent);
                }

                if(rbConditions.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, ListConditions.class);
                    startActivity(intent);
                }

                if(rbContacts.isChecked()) {
                    Intent intent = new Intent(MainActivity.this, ListContacts.class);
                    startActivity(intent);
                }


            }
        });



    }
}
