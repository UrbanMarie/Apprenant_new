package mobile.beweb.fondespierre.fr.apprenant_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import mobile.beweb.fondespierre.fr.apprenant_new.Adapter.CustomListVolley;
import mobile.beweb.fondespierre.fr.apprenant_new.Adapter.ParseJSON;


public class VolleyActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String JSON_URL = "http://10.216.0.138/apiBlackBooks/";

    private Button laV_button_volley;

    private ListView laV_listView_volley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);

        laV_button_volley = (Button) findViewById(R.id.laV_button_volley);
        laV_button_volley.setOnClickListener(this);
        laV_listView_volley = (ListView) findViewById(R.id.laV_listView_volley);
    }

    private void sendRequest(){
        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(VolleyActivity.this,error.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String json){
        ParseJSON pj = new ParseJSON(json);
        pj.parseJSON();
        CustomListVolley cl = new CustomListVolley(this, ParseJSON.id,ParseJSON.nom,ParseJSON.prenom,ParseJSON.ville,ParseJSON.skill,ParseJSON.description);
        laV_listView_volley.setAdapter(cl);
    }

    @Override
    public void onClick(View v) {
        sendRequest();
    }

}
