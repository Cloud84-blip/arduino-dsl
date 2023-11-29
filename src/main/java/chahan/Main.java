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
        // Exemple d'entrée DSL
        Path path = Paths.get("StateSwitchAlarm-Inputs.txt");
        String dslInput;
        dslInput = Main.simpleLineParser(path);


        // Analyse du DSL
        // ANTLRInputStream input = new ANTLRInputStream(dslInput);
        ArduinoDSLLexer lexer = new ArduinoDSLLexer(CharStreams.fromString(dslInput));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ArduinoDSLParser parser = new ArduinoDSLParser(tokens);
        ArduinoDSLParser.RootContext context = parser.root();
        CodeGenerator generator = new CodeGenerator();
        generator.visit(context);
        String arduinoCode = generator.getCode();


        // ParseTree tree = parser.program();

        // Génération du code
        // CodeGenerator generator = new CodeGenerator();
        // generator.visit(tree);
        // Récupérer le code Arduino généré
        // String arduinoCode = generator.getCode();

        // Afficher ou sauvegarder le code Arduino
        System.out.println(arduinoCode);
        Path path_res = Paths.get("StateSwitchAlarm-Results.txt");
        Main.writeToFile(path_res, arduinoCode);
    }
}

