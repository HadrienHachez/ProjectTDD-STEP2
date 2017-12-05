import javax.management.openmbean.ArrayType;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Display_ {

    public static void display_() {
        System.out.println("Bienvenue dans La Cave à Vin");
        System.out.println("Recherche.");
        System.out.println("Si l'élément n'est pas recherché laisser vide.");
        System.out.println("_________________________________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir : ");
        System.out.println("> Type     : ");
        String type = sc.nextLine();
        System.out.println("> Country  : ");
        String country = sc.nextLine();
        System.out.println("> Provider : ");
        String provider = sc.nextLine();
        System.out.println("> Level    : ");
        String level = sc.nextLine();
        System.out.println("> Name     : ");
        String name = sc.nextLine();
        System.out.println("> Year     : ");
        String year = sc.nextLine();


        //System.out.println("Vous avez saisi : " + str);
        //System.out.println("La recherche donne : ");
        //ArrayList wordsList = cutSearch(str);

    }


public static ArrayList cutSearch(String search) {
    ArrayList words = new ArrayList();
    int i=0;

    if (search == null) {
        System.out.println("null");
        //return null;
    } else {
        StringTokenizer st = new StringTokenizer(search);
        while (st.hasMoreTokens()) {
            String stt = st.nextToken();
            words.add(stt);
            System.out.println(stt);
        }
        //System.out.println("VOILAAAA : ");
        //for(int j=0; j<words.size(); j++){
        //    System.out.println(words.get(j).toString());
        //}
    }
    return words;
}

    //return words;
}