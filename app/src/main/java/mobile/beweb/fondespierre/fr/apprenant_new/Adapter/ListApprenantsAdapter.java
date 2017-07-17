package mobile.beweb.fondespierre.fr.apprenant_new.Adapter;

/**
 * Created by marie-urbano on 13/07/17.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import mobile.beweb.fondespierre.fr.apprenant_new.R;

public class ListApprenantsAdapter extends ArrayAdapter {

    Activity biscotte;
    String[] identity;

    public ListApprenantsAdapter(Activity context, String[] tabidentity) {
        super(context, 0, tabidentity);
        biscotte = context;
//        // le constructeur
        identity= tabidentity;

    }

    @Override
    public View getView( int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_apprenants_item, parent, false);
        }


        String[] identitys = identity[position].split(" ");
        // Log.d("sitemescouilliousprenom",identitys[1]);
        //Log.d("sitemescouilliousnom",identitys[2]);
        //Log.d("sitemescouilliousskill",identitys[3]);



        //attribut les textes au layout en fonction de leurs ID
        TextView firstname = (TextView) convertView.findViewById(R.id.laItem_textview_prenom);
        TextView lastName = (TextView) convertView.findViewById(R.id.laItem_textview_nom);
        TextView competences = (TextView) convertView.findViewById(R.id.laItem_textview_skill);
        ImageView detail = (ImageView) convertView.findViewById(R.id.laItem_imagebutton_detail);

        /*trouver un moyen de récuperer le tableau */

        detail.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(biscotte, "Putain ça marche", Toast.LENGTH_SHORT).show(); // on dit merci qui ? :)
            }
        });

//        Toast makeText (Context context,
//        int resId,
//        int duration)
        firstname.setText(identitys[1]);
        lastName.setText(identitys[2]);
        competences.setText(identitys[3]);

        //set on click listener
        return convertView;


    }
//on retourne les apprenants tant que il y en a
//@Override
//    public int getCount(){
//
//        return apprenants.lenght();
//
}
