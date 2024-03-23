package org.example.jsonSample;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClsJson {

    /*
     public Object convierteJsonAOjeto(){
    ObjectMapper mapper = new ObjectMapper();
    Object objArchivo = new Object();
    try {
        objArchivo = mapper.readValue(new File("C:\\TEMP\\P3.json"),mdBot.class );
    }catch (Exception ex){

        System.out.println("error;"+ ex.getMessage());

    }
    return objArchivo;

    }
    */

    public String mdUsuario = "C:\\TMP\\file.j1son";

    //YA se leer un archivo json y lo ponerlo en un objeto de type arraylist
    public ArrayList<mdBot> convierteJsonAObjeto() {
    ObjectMapper mapper = new ObjectMapper();
    ArrayList<mdBot> listaObjetos = new ArrayList<>();

    try {
        //JSON de archivo a objeto                                                   //TypeReference<ArrayList<mdBot>>(){});
       listaObjetos = mapper.readValue(new File(mdUsuario), new TypeReference<ArrayList<mdBot>>(){});
   //    listaObjetos = mapper.readValue(new File("C:\\TMP\\file.json"), new TypeReference<ArrayList<mdBot>>(){});
    } catch (Exception ex) {
        Logger.getLogger(ClsJson.class.getName()).log(Level.SEVERE, null, ex);
        //System.out.println("error;"+ ex.getMessage());
    }
    return listaObjetos;
}

    //YA SE GRABAR JSON EN ARCHIVOS
    //graba en un archivo json un objeto de tipo arraylist
    public String convierteObjetoJson(ArrayList<mdBot> listaObjetos) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    //Pasa el objeto a un archivo y lo guarda
    mapper.writeValue(new File(mdUsuario), listaObjetos);
    //pasa el json a un string
    String jsonInString = mapper.writeValueAsString(listaObjetos);
    return jsonInString;
}





    public static void main(String[] args) {
//
//        //recupera el archivo y lo pone en un objeto
//        ClsJson obj = new ClsJson();
//        ArrayList<mdBot> listaChats = obj.convierteJsonAObjeto();
//        for (mdBot dato : listaChats) {
//            System.out.println("Nombre: " + dato.getNombre());
//            System.out.println("Mensaje: " + dato.getMensaje());
//            System.out.println("ID: " + dato.getId());
//        }










        ClsJson obj = new ClsJson();
        ArrayList<mdBot> listaCarreras = new ArrayList<>();
        mdBot carrera1 = new mdBot();
        carrera1.setNombre("Ingenieria en Sistemas");
        carrera1.setId(1L);
        carrera1.setMensaje("Hola");
        listaCarreras.add(carrera1);
        // Agrega más objetos mdBot a listaCarreras si es necesario
        carrera1 = new mdBot();
        carrera1.setNombre("prueba 2");
        carrera1.setId(5L);
        carrera1.setMensaje("otra cosa");
        listaCarreras.add(carrera1);
        try {
            System.out.println(obj.convierteObjetoJson(listaCarreras));
        } catch (IOException ex) {
            System.out.println("error;"+ ex.getMessage());
        }
//
//        ClsJson objJson = new ClsJson();
//        mdBot botData = new mdBot();
//        botData = (mdBot) objJson.convierteJsonAObjeto();
//       // System.out.println(objJson.convierteJsonAObjeto());
//        System.out.println("Nombre: " + botData.getNombre());

        // recupera el archivo y lo pone en un objeto
//        ClsJson obj = new ClsJson();
//        ArrayList<mdBot> listaChats = obj.convierteJsonAObjeto();
//        for (mdBot dato : listaChats) {
//            System.out.println("Nombre: " + dato.getNombre());
//            System.out.println("Mensaje: " + dato.getMensaje());
//            System.out.println("ID: " + dato.getId());
//        }
//
//
//        ClsJson objJson = new ClsJson();
//        mdBot botData = new mdBot();
//
//        botData.setNombre("SERGUIO");
//        botData.setMensaje("hola");
//        botData.setId(12345678L);
//
//
//        try {
//            System.out.println(objJson.convierteJsonAObjeto());
//        } catch (Exception ex) {
//            System.out.println("hubo un problema ");
//
//        }

    }

}//fin de la clase
