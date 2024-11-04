import Entidades.Expansion;
import Entidades.Genero;
import Entidades.Juego;
import JSON.JsonUtiles;
import JSON.MetodosJSON;
import Repositorio.ContenedorGenerico;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Juego juego1 = new Juego("gta", "luana", Genero.RPG, 12);
        Juego juego2 = new Juego("cs", "fede", Genero.MMO, 23);

        Expansion exp1 = new Expansion("gta", "fede", Genero.MOVA, "2004");
        Expansion exp2 = new Expansion("cs", "luana", Genero.RPG, "2005");

       /* ContenedorGenerico<Juego> listaJuego = new ContenedorGenerico<>();
        listaJuego.agregar(juego1);
        listaJuego.agregar(juego2);
        System.out.println(listaJuego.mostrarObjetos());
        System.out.println(listaJuego.eliminarPorId(1));
        System.out.println(listaJuego.mostrarObjetos());

        ContenedorGenerico<Expansion> listaExp = new ContenedorGenerico<>();
        listaExp.agregar(exp1);
        listaExp.agregar(exp2);
        System.out.println(listaExp.mostrarObjetos());
        System.out.println(listaExp.eliminarPorId(3));
        System.out.println(listaExp.mostrarObjetos());*/

        MetodosJSON jsonObJ1 = new MetodosJSON();
        MetodosJSON jsonObJ2 = new MetodosJSON();

        JSONObject aux = jsonObJ1.pasarJuegoASJON(juego1);
        System.out.println(aux);
        JSONObject aux2 = jsonObJ2.pasarJuegoASJON(juego2);
        System.out.println(aux2);

        JSONArray arregloJuegos = new JSONArray();
        MetodosJSON.agregarJSON(aux,arregloJuegos);
        MetodosJSON.agregarJSON(aux2,arregloJuegos);
        System.out.println(MetodosJSON.mostrarArray(arregloJuegos));

        MetodosJSON jsonOBJe = new MetodosJSON();
        MetodosJSON jsonOBJe2 = new MetodosJSON();

        JSONObject auxx = jsonOBJe.pasarExpansionAJSON(exp1);
        System.out.println(auxx);
        JSONObject auxxx = jsonOBJe2.pasarExpansionAJSON(exp2);
        System.out.println(auxxx);

        JSONArray arregloExpansion = new JSONArray();
        MetodosJSON.agregarJSON(auxx,arregloExpansion);
        MetodosJSON.agregarJSON(auxxx,arregloExpansion);
        System.out.println(MetodosJSON.mostrarArray(arregloExpansion));

        JsonUtiles.grabar(arregloExpansion);
        JsonUtiles.leer("jsonArray");
        System.out.println(JsonUtiles.leer("jsonArray"));

    }
}