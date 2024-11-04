package JSON;
import Entidades.Expansion;
import Entidades.Genero;
import Entidades.Juego;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MetodosJSON{


    public JSONObject pasarJuegoASJON (Juego e){
        JSONObject aux = new JSONObject();
        try{
            aux.put("titulo",e.getTitulo());
            aux.put("creador",e.getCreador());
            aux.put("genero",e.getGenero());
            aux.put("nroVersion",e.getNumeroVersion());

        }catch (JSONException a){
            System.out.println(a.getMessage());

        }
        return aux;
    }

    public JSONObject pasarExpansionAJSON (Expansion a){
        JSONObject aux = new JSONObject();
        try {
            aux.put("titulo",a.getTitulo());
            aux.put("creador", a.getCreador());
            aux.put("genero",a.getGenero());
            aux.put("fechaLanzamiento",a.getFechaLanzamiento());
        }catch (JSONException d){
            System.out.println(d.getMessage());
        }
        return aux;
    }
    public Juego pasarJSONaJuego (JSONObject a){
        Juego aux = new Juego();
        try{
            aux.setCreador(a.getString("creador"));
            aux.setTitulo(a.getString("titulo"));
            aux.setGenero(Genero.valueOf(a.getString("genero")));
            aux.setNumeroVersion(a.getInt("numeroVersion"));

        }catch (JSONException s){
            System.out.println(s.getMessage());
        }
        return aux;
    }

    public Expansion pasarJSONaExpansion (JSONObject f){
        Expansion aux = new Expansion();
        try{
            aux.setTitulo(f.getString("titulo"));
            aux.setCreador(f.getString("creador"));
            aux.setGenero(Genero.valueOf(f.getString("genero")));
            aux.setFechaLanzamiento(f.getString("fechaLanzamiento"));
        }catch (JSONException g){
            System.out.println(g.getMessage());
        }
        return aux;
    }

    public static void agregarJSON (JSONObject w, JSONArray t){
            t.put(w);
    }
    public static JSONArray mostrarArray (JSONArray r){
        return r;
    }


}
