package crearficheroxml;

import java.io.FileWriter;
import java.util.Scanner;

public class CrearFicheroXML {

    public static void main(String[] args) {
    }

    Scanner leerTeclado = new Scanner(System.in, "ISO-8859-1");

    private String entradaDeDatos(String pregunta) {

        String dato = "";
        //Pregunta custom para reusar el metodo
        System.out.println(pregunta);
        //tomamos datos de Scanner
        dato = leerTeclado.nextLine();

        return dato; //Devolvemos el dato aportado por el user
    }

    public void FileWriterWrite(String nombreArchivo, String extension, String titulo, String autor, String categoria) {
        try {
            //FileWriter crea el archivo
            FileWriter fileWriter = new FileWriter(nombreArchivo + extension);
            System.out.println(extension);
            //XML
            if (extension.equals(".xml")) {
                //Pasamos el mensaje para editar
                fileWriter.append("<Libros>\n\t<Libro>\n\t\t<Titulo>" + titulo + "</Titulo>\n\t\t<Autor>" + autor + "</Autor>\n\t\t<Categoria>" + categoria + "</Categoria>\n\t</Libro>\n</Libros>");

                //TXT
            } else {
                fileWriter.write("Titulo: " + titulo + "\n"
                        + "Autor: " + autor + "\n"
                        + "Categoria: " + categoria + "\n");
            }
            //Cuando acaba de editar cierra y guarda los cambios
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("El archivo");
        }
    }
}
