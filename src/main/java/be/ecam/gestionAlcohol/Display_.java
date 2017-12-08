package be.ecam.gestionAlcohol;

import be.ecam.gestionAlcohol.beans.Alcohol_;
import be.ecam.gestionAlcohol.beans.Product_;

import java.util.*;

public class Display_ {

    /**
     * CLI interface of the project.
     */
    public static void display_() {
        Scanner sc_ = new Scanner(System.in);
        menu_(sc_);
    }

    /**
     * This function display the menu and direct the user to the selected routine.
     * @param sc_ Scanner for stdin
     */
    private static void menu_(Scanner sc_){
        int operation_ = 0;
        System.out.println("Bienvenue dans Votre Cave à Vin \n" +
                "MENU : [Afficher=1[Ajout=2][Recherche=3][Modification=4][Suppression=5]");
        operation_ = input_check(sc_,1,5,null);
        switch (operation_) {
            case 1: // affichage
                break;
            case 2: // ajout
                break;
            case 3: // recherche
                recherche_(sc_);
                break;
            case 4: // modification
                modification_(sc_);
                break;
            case 5: // suppression
                suppression_(sc_);
                break;
            default:
                menu_(sc_);
        }
    }

    /**
     * @param sc_ Scanner for stdin
     */
    private static void affiche_(Scanner sc_) {
        System.out.println("MENU AFFICHE");
        for (int i=0;i<5;i++){
            System.out.println("TG\n");
        }
    }

    /**
     * @param sc_ Scanner for stdin
     */
    private static void recherche_(Scanner sc_) {
        System.out.println("MENU RECHERCHE\n"+
                "Si l'élément n'est pas recherché laisser vide.\n"+
                "Veuillez saisir : ");
        Alcohol_ alcohol_ = createAlcoholFromStdin(sc_);

        System.out.println(alcohol_);
    }

    /**
     * @param sc_ Scanner for stdin
     */
    private static void modification_(Scanner sc_) {
        //TODO implémenter
    }

    /**
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

    /**
     * Helper to retrieve an integer from stdin between a lower and upper bound.
     * @param sc Scanner for stdin
     * @param lower lowest possible value
     * @param upper hight possible value
     * @param errorStr the string to disply in case of wrong input, maybe null to display the default notice
     * @return the input read from stdin
     */
    public static int input_check(Scanner sc, int lower, int upper, String errorStr) {
        int iinput = -1;
        String notice = errorStr != null ? errorStr : "Entrée invalide, daignez réessayer:";

        while (true) {
            try {
                iinput = Integer.parseInt(sc.nextLine());
                while (iinput < lower || iinput > upper) {
                    System.err.print(notice);
                    iinput = Integer.parseInt(sc.nextLine());
                }
                break;
            } catch(NumberFormatException e) {
                System.err.println(notice);
            }
        }

        return iinput;
    }
}