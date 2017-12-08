
import beans.Alcohol_;
import beans.Product_;

import java.util.*;

public class Display_ {

    public static void display_() {
        Scanner sc_ = new Scanner(System.in);
        int operation_= 0;

        System.out.println("Bienvenue dans La Cave à Vin");
        System.out.println("Vous voulez faire : [Ajout=1][Recherche=2][Modification=3][Suppression=4]");

        try {
            operation_ = sc_.nextInt();
        } catch(InputMismatchException ime) {
            System.out.println("Valeur saisie non numérique ou hors des limites int.");
        }

        switch (operation_) {
            case 1: // ajout
                break;

            case 2: // recherche
                recherche_(sc_);
                break;

            case 3: // modification
                modification_(sc_);
                break;

            case 4: // suppression
                break;

            default:
                return;
        }


        /*************************************************************************************************************/
        /*Zone de code : Partie Recherche                                                                            */
        /*************************************************************************************************************/

        //SEPARER LE CODE EN FONCTION QD FINI
    }

    private static void recherche_(Scanner sc_) {
        Product_ type_ = null;
        int typeInt_ = 0;
        String country_ = null;
        String provider_ = null;
        String level_ = null;
        String name_ = null;
        int year_ = 0;

        System.out.println("Recherche.");
        System.out.println("Si l'élément n'est pas recherché laisser vide.");
        System.out.println("_________________________________________________________");

        System.out.println("Veuillez saisir : ");

        try {
            System.out.println("> Type [BEER=1] [WINE=2] [LIQUOR=3]    : ");
            typeInt_ = sc_.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Valeur saisie non numérique\n"
                    + "ou hors des limites int.");
        }

        System.out.println("> Country  : ");
        country_ = sc_.nextLine();
        System.out.println("> Provider : ");
        provider_ = sc_.nextLine();
        System.out.println("> Level    : ");
        level_ = sc_.nextLine();
        System.out.println("> Name     : ");
        name_ = sc_.nextLine();

        try {
            System.out.println("> Year     : ");
            year_ = sc_.nextInt();
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

        Alcohol_ alcohol_ = new Alcohol_.Builder_(name_, level_).build_();

        if (country_ != null)
            alcohol_.setCountry_(country_);
        if (provider_ != null)
            alcohol_.setProvider_(provider_);
        if (year_ != 0)
            alcohol_.setYear_(year_);

        System.out.println("");
    }

    private static void modification_(Scanner sc_) {
        //TODO
    }
}