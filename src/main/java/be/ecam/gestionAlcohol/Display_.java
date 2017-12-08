package be.ecam.gestionAlcohol;

import be.ecam.gestionAlcohol.beans.Alcohol_;
import be.ecam.gestionAlcohol.beans.Product_;

import java.util.*;

public class Display_ {

    /**
     * CLI interface of the project. This function display the
     * menu and direct the user to the selected routine.
     */
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
                suppression_(sc_);
                break;

            default:
                return;
        }
    }


    /**
     *
     * @param sc_ Scanner for stdin
     */
    private static void recherche_(Scanner sc_) {
        System.out.println("Recherche:\n"
            + "Si l'élément n'est pas recherché laisser vide.\n"
            + "Veuillez saisir :");

        Alcohol_ alcohol_ = createAlcoholFromStdin(sc_);

        System.out.println(alcohol_);
    }


    /**
     *
     * @param sc_ Scanner for stdin
     */
    private static void modification_(Scanner sc_) {
        //TODO implémenter
    }


    /**
     *
     * @param sc_ Scanner for stdin
     */
    private static void suppression_(Scanner sc_) {
        //TODO implémenter
    }


    /**
     *
     * @param sc_ Scanner for stdin
     * @return the alcohol instance created
     */
    private static Alcohol_ createAlcoholFromStdin(Scanner sc_) {
        Product_ type_   = null;
        int typeInt_     = 0;
        String country_  = "";
        String provider_ = "";
        String level_    = "";
        String name_     = "";
        int year_        = 0;

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
        }

        // create the object
        Alcohol_ alcohol_ = new Alcohol_.Builder_(name_, level_).build_();

        if (country_ != null)
            alcohol_.setCountry_(country_);
        if (provider_ != null)
            alcohol_.setProvider_(provider_);
        if (year_ != 0)
            alcohol_.setYear_(year_);

        return alcohol_;
    }
}