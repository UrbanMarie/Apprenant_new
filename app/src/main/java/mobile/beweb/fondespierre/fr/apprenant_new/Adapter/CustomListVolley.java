package mobile.beweb.fondespierre.fr.apprenant_new.Adapter;

/**
 * Created by marie-urbano on 13/07/17.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import mobile.beweb.fondespierre.fr.apprenant_new.R;


public class CustomListVolley extends ArrayAdapter<String> {

    private String[] id;
    private String[] nom;
    private String[] prenom;
    private String[] ville;
    private String[] skill;
    private String[] description;
    private Activity context;

    public CustomListVolley(Activity context, String[] id, String[] nom, String[] prenom, String[] ville, String[] skill, String[] description) {
        super(context, R.layout.list_volley_item, id);
        this.context = context;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.skill = skill;
        this.description = description;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_volley_item, null, true);
        TextView textViewId = (TextView) listViewItem.findViewById(R.id.laItemV_textView_id);
        TextView textViewNom = (TextView) listViewItem.findViewById(R.id.laItemV_textView_nom);
        TextView textViewPrenom = (TextView) listViewItem.findViewById(R.id.laItemV_textView_prenom);
        TextView textViewVille = (TextView) listViewItem.findViewById(R.id.laItemV_textView_ville);
        TextView textViewSkill = (TextView) listViewItem.findViewById(R.id.laItemV_textView_skill);
        TextView textViewDescription = (TextView) listViewItem.findViewById(R.id.laItemV_textView_description);

        textViewId.setText(id[position]);
        textViewNom.setText(nom[position]);
        textViewPrenom.setText(prenom[position]);
        textViewVille.setText(ville[position]);
        textViewSkill.setText(skill[position]);
        textViewDescription.setText(description[position]);

        return listViewItem;
    }
}
