package chahan;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static File[] listFiles(String folderPath) {
        // Remplacez ce chemin par le chemin du dossier que vous voulez explorer
        File folder = new File(folderPath);

        // Liste tous les fichiers et dossiers dans le dossier spécifié
        File[] listOfFiles = folder.listFiles();

        // Vérifie si le dossier est vide ou n'existe pas
        if (listOfFiles == null) {
            System.out.println("Le dossier n'existe pas ou est vide.");
            return null;
        }

        return listOfFiles;
    }

    public static String simpleLineParser(Path path) {
        StringBuilder lines = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Gérer l'exception
        }
        return lines.toString();
    }

    public static Void writeToFile(Path path, String str){
        try {
            Files.write(path, str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws Exception {

        File[] listOfFiles = listFiles("./Scenarios");
        for (File file : listOfFiles) {
            if (file.isFile()) {
                Path path = Paths.get("./Scenarios/"+file.getName());
                String dslInput = Main.simpleLineParser(path);
                Path path_res = Paths.get("./Results/"+file.getName() + "_RES");

                // Analyse du DSL
                // ANTLRInputStream input = new ANTLRInputStream(dslInput);
                ArduinoDSLLexer lexer = new ArduinoDSLLexer(CharStreams.fromString(dslInput));
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                ArduinoDSLParser parser = new ArduinoDSLParser(tokens);
                ArduinoDSLParser.RootContext context = parser.root();
                CodeGenerator generator = new CodeGenerator();
                generator.visit(context);
                String arduinoCode = generator.getCode();

                System.out.println(arduinoCode);
                
                Main.writeToFile(path_res, arduinoCode);
            } else if (file.isDirectory()) {
                System.out.println("Directory " + file.getName());
            }
        }
    }
}

