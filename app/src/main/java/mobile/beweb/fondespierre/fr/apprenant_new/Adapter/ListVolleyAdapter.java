//package mobile.beweb.fondespierre.fr.apprenant_new.Adapter;
//
//import android.app.Activity;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import mobile.beweb.fondespierre.fr.apprenant_new.R;
//
///**
// * Created by marie-urbano on 13/07/17.
// */
//
//public class ListVolleyAdapter extends ArrayAdapter {
//
//    Activity craquotte;
//    String[] JSONFUTUR;
//
//    public ListVolleyAdapter(Activity context, String[] tabidentity) {
//        super(context, 0, tabidentity);
//        craquotte = context;
////        // le constructeur
//        JSONFUTUR= tabidentity;
//
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        if(convertView == null){
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_volley_item, parent, false);
//        }
//
//        String[] identitys = JSONFUTUR[position].split(" ");
//
//
//        //attribut les textes au layout en fonction de leurs ID
//        TextView firstname = (TextView) convertView.findViewById(R.id.laItemV_textView_prenom);
//        TextView lastName = (TextView) convertView.findViewById(R.id.laItemV_textView_nom);
//        TextView ville = (TextView) convertView.findViewById(R.id.laItemV_textView_ville);
//        TextView competences = (TextView) convertView.findViewById(R.id.laItemV_textView_skill);
//        TextView desc = (TextView) convertView.findViewById(R.id.laItemV_textView_description);
//
//        /*trouver un moyen de récuperer le tableau */
//
//        ville.setOnClickListener (new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Toast.makeText(craquotte, "wii", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        firstname.setText(identitys[1]);
//        lastName.setText(identitys[2]);
//        ville.setText(identitys[3]);
//        competences.setText(identitys[4]);
//        desc.setText(identitys[5]);
//
//        //set on click listener
//        return convertView;
//    }
//
//}
