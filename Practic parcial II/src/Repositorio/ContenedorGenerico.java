package Repositorio;

import Entidades.Genero;
import Entidades.Soft;
import Exceptions.NoSeEncontroException;
import Exceptions.NoSePudoAgregarException;

import java.util.ArrayList;

public class ContenedorGenerico <T extends Soft> {
    ArrayList<T> listadoJuegosYExpansines;

    public ContenedorGenerico() {
        this.listadoJuegosYExpansines = new ArrayList<>();
    }

    public ArrayList<T> getListadoJuegosYExpansines() {
        return listadoJuegosYExpansines;
    }

    public void setListadoJuegosYExpansines(ArrayList<T> listadoJuegosYExpansines) {
        this.listadoJuegosYExpansines = listadoJuegosYExpansines;
    }

    @Override
    public String toString() {
        return "Repositorio.ContenedorGenerico{" +
                "listadoJuegosYExpansines=" + listadoJuegosYExpansines +
                '}';
    }

    public void agregar (T a){

        try{
            for (T t : listadoJuegosYExpansines) {
                if (t.getId() == a.getId()){
                    throw new NoSePudoAgregarException("NO SE PUDO AGREGAR EL ELEMENTO, POR QUE YA SE ENCUENTRA ESE ID");
                }
            }
                listadoJuegosYExpansines.add(a);
        }catch(NoSePudoAgregarException x){
            System.out.println(x.getMessage());
        }
    }

    public boolean eliminarPorId (int a){
        boolean borrado = false;
        try{
            for (int i = 0; i < listadoJuegosYExpansines.size(); i++) {
                if(listadoJuegosYExpansines.get(i).getId() == a){
                    listadoJuegosYExpansines.remove(i);
                    borrado = true;
                } else{
                    throw new NoSeEncontroException("NO SE ENCONTRO UN OBJETO CON ESE ID");
                }
            }
        }catch (NoSeEncontroException x){
            System.out.println(x.getMessage());
        }
        return borrado;
    }

    public ArrayList<T> mostrarObjetos (){
        return listadoJuegosYExpansines;
    }

    public String filtrarPorGenero (Genero g){
        ArrayList<T> aux = new ArrayList<>();
        for (int i = 0; i < listadoJuegosYExpansines.size(); i++) {
            if (listadoJuegosYExpansines.get(i).getGenero().equals(g)){
                aux.add(listadoJuegosYExpansines.get(i));
            }
        }
        return aux.toString();
    }








}
