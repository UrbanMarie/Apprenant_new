package mobile.beweb.fondespierre.fr.apprenant_new;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import mobile.beweb.fondespierre.fr.apprenant_new.Adapter.ListApprenantsAdapter;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;

        Resources tableau = getResources();
        String[] identity = tableau.getStringArray(R.array.identity);
        final ListView listApprenants = (ListView)findViewById(R.id.la_listView_apprenants);
        ListApprenantsAdapter adapter = new ListApprenantsAdapter(this, identity);
        listApprenants.setAdapter(adapter);

        final Button la_button_volley = (Button) findViewById(R.id.la_button_volley);
        la_button_volley.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VolleyActivity.class);
                startActivity(intent);
            }
        });
        }

    }

