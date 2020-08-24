package br.com.marcia.java11;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.*;

public class PrincipalFile {

    public static void main(String[] args) throws IOException {

        testFile();

    }

    private static void  testFile() throws IOException {

        // Novos métodos: readString() e writeString()

        Path path = writeString(createTempFile("test", ".txt"), "Pizza de brócolis");
        System.out.println(path); // Saída:  /tmp/test12357906260338881459.txt


        String s = readString(path);
        System.out.println(s);  // Saída:  Pizza de brócolis

        // Removendo para não deixar lixo na pasta /tmp
        //Path.of -> java 11
        Path.of(path.toString()).toFile().delete();
    }


}

