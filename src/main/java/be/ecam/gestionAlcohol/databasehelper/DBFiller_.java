package be.ecam.gestionAlcohol.databasehelper;

import be.ecam.gestionAlcohol.Context_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.bson.Document;

public class DBFiller_ {
    public static void main(String[] args) {

        Context_ ctx_ = Context_.getInstance_();
        Document doc_ = null;

        try (BufferedReader br = new BufferedReader(new FileReader("samples.json"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String aggregate_ = sb.toString().replaceAll("(\\[|\\])", "");
            String[] objects_ = aggregate_.split("},");

            for (String object_ : objects_) {
                doc_ = Document.parse(object_ + "}");
                ctx_.db_.putAlcoholsBson_(doc_);
            }
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
}
