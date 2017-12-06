
import beans.Product_;

import java.util.*;

public class Display_ {

    public static void display_() {
        Product_ type_ = null;
        int typeInt_ = 0;
        String country_ = null;
        String provider_ = null;
        String level_ = null;
        String name_ = null;
        int year_ = 0;
        Scanner sc = new Scanner(System.in);
        int operation_= 0;

        System.out.println("Bienvenue dans La Cave à Vin");
        System.out.println("Vous voulez faire : [Ajout=1][Recherche=2][Modification=3][Suppression=4]");

        try{
            operation_ = sc.nextInt();
        }
        catch(InputMismatchException ime)
        {
            System.out.println("Valeur saisie non numérique\n"
                    + "ou hors des limites int.");
        }

        /*************************************************************************************************************/
        /*Zone de code : Partie Recherche                                                                            */
        /*************************************************************************************************************/

        //SEPARER LE CODE EN FONCTION QD FINI

        HashMap<String, String> hm_ = new HashMap();
        Iterator it_ = hm_.entrySet().iterator();

        if(operation_ == 2) {
            System.out.println("Recherche.");
            System.out.println("Si l'élément n'est pas recherché laisser vide.");
            System.out.println("_________________________________________________________");

            System.out.println("Veuillez saisir : ");

            try {
                System.out.println("> Type [BEER=1] [WINE=2] [LIQUOR=3]    : ");
                typeInt_ = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Valeur saisie non numérique\n"
                        + "ou hors des limites int.");
            }

            System.out.println("> Country  : ");
            country_ = sc.nextLine();
            System.out.println("> Provider : ");
            provider_ = sc.nextLine();
            System.out.println("> Level    : ");
            level_ = sc.nextLine();
            System.out.println("> Name     : ");
            name_ = sc.nextLine();

            try {
                System.out.println("> Year     : ");
                year_ = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Valeur saisie non numérique\n"
                        + "ou hors des limites int.");
            }

            if (typeInt_ != 0) {
                if (typeInt_ == 1) {
                    type_ = type_.BEER;
                } else if (typeInt_ == 2) {
                    type_ = type_.WINE;
                } else if (typeInt_ == 3) {
                    type_ = type_.LIQUOR;
                } else {
                    System.err.println("! Erreur de choix de chiffre !");
                }
                //A transfo d'abord en string
            }
            if (country_ != null) {
                hm_.put("country_", country_);
            }
            if (provider_ != null) {
                hm_.put("provider_", provider_);
            }
            if (level_ != null) {
                hm_.put("level_", level_);
            }
            if (name_ != null) {
                hm_.put("name_", name_);
            }
            if (year_ != 0) {
                hm_.put("year_", Integer.toString(year_));
            }

            while (it_.hasNext()) {
                Map.Entry data = (Map.Entry)it_.next();
                //CREER L OBJET ALCOHOL VIA BUILDER
            }

        }
    }
}