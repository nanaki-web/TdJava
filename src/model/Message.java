package model;

import tools.TransCoder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Message {
    private Boolean encoded;
    private List<String>msgClear;
    private List<String>msgEncodded;
    private Path msgClearPath;
    private Path msgEncodedPath;
    private Path keyPath;
    private String key;
    private TransCoder transCoder;

    /* TODO: gérer le cas où le fichier n'existe pas ! */

    /*
     * Constructeur de l'objet message
     * @param encoded booléen pour savoir si le message est encodé ou non
     * @param msgClearPath chemin vers le fichier décodé
     * @param msgEncodedPath chemin vers le fichier codé
     * @param keyPath chemin vers la clé
     * @throws IOException
     */

    public void message (Boolean encoded, Path msgClearPath, Path msgEncodedPath, Path keyPath ) throws IOException
    {
        this.encoded = encoded;
        this.msgClearPath = msgClearPath;
        this.msgEncodedPath = msgEncodedPath;
        this.keyPath = keyPath;
        this.key = Files.readString(keyPath);

        this.transCoder = new TransCoder(key);
    }
    public void readNWriter()
    {
        String home = System.getProperty("user.dir");

        Path path = Paths.get(home, "unfichier.txt");

        //on peut tester si le fichier existe
        if (Files.exists(path))
        {
            System.out.println("le fichier existe déjà !!!");
        } else
        {
            System.out.println("le fichier n'existe pas");
        }









    }

}
