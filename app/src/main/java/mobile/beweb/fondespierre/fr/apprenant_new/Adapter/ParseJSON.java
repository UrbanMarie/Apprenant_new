package mobile.beweb.fondespierre.fr.apprenant_new.Adapter;

/**
 * Created by marie-urbano on 13/07/17.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


    public class ParseJSON {
        public static String[] id;
        public static String[] nom;
        public static String[] prenom;
        public static String[] ville;
        public static String[] skill;
        public static String[] description;

        public static final String JSON_ARRAY = "result";
        public static final String KEY_ID = "id";
        public static final String KEY_NOM = "nom";
        public static final String KEY_PRENOM = "prenom";
        public static final String KEY_VILLE = "ville";
        public static final String KEY_SKILL = "skill";
        public static final String KEY_DESCRIPTION = "description";

        private JSONArray users = null;

        private String json;

        public ParseJSON(String json){
            this.json = json;
        }

        public void parseJSON(){
            JSONObject jsonObject=null;
            try {
                jsonObject = new JSONObject(json);
                users = jsonObject.getJSONArray(JSON_ARRAY);

                id = new String[users.length()];
                nom = new String[users.length()];
                prenom = new String[users.length()];
                ville = new String[users.length()];
                skill = new String[users.length()];
                description = new String[users.length()];

                for(int i=0;i<users.length();i++){
                    JSONObject jo = users.getJSONObject(i);
                    id[i] = jo.getString(KEY_ID);
                    nom[i] = jo.getString(KEY_NOM);
                    prenom[i] = jo.getString(KEY_PRENOM);
                    ville[i] = jo.getString(KEY_VILLE);
                    skill[i] = jo.getString(KEY_SKILL);
                    description[i] = jo.getString(KEY_DESCRIPTION);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
}
