package be.ecam.gestionAlcohol;

import be.ecam.gestionAlcohol.beans.Alcohol_;
import be.ecam.gestionAlcohol.beans.Product_;

import java.util.*;

public class Display_ {

    /**
     * CLI interface of the project.
     */
    public static void display_() {
        Context_ ctx_ = Context_.getInstance_();
        menu_(ctx_);
    }


    /**
     * This function display the menu and direct the user to the selected routine.
     * @param ctx_ the application context
     */
    private static void menu_(Context_ ctx_){
        System.out.println("Bienvenue dans Votre Cave à Vin \n"+
                "1) Afficher     \n" +
                "2) Ajout        \n" +
                "3) Recherche    \n" +
                "4) Modification \n" +
                "5) Suppression  \n" +
                "6) Exit");
        int operation_ = input_check(ctx_.sc_,1,6,null);

        switch (operation_) {
            case 1: // affichage
                affiche_(ctx_);
                break;
            case 2: // ajout
                ajouter_(ctx_);
                break;
            case 3: // recherche
                recherche_(ctx_);
                break;
            case 4: // modification
                modification_(ctx_);
                break;
            case 5: // suppression
                suppression_(ctx_);
                break;
            case 6: default: // exit
                return;
        }
    }


    /**
     *
     * @param ctx_ the application context
     */
    private static void ajouter_(Context_ ctx_) {
        System.out.println("=== Ajouter une bouteille ===");
        Alcohol_ alcohol_ = createAlcoholFromStdin(ctx_);
        ctx_.db_.putAlcohols_(alcohol_);
    }


    /**
     * @param ctx_ the application context
     */
    private static void affiche_(Context_ ctx_) {
        System.out.println("MENU AFFICHE");
        ctx_.db_.getAllAlcohol_();
    }


    /**
     * @param ctx_ the application context
     */
    private static void recherche_(Context_ ctx_) {
        System.out.println("MENU RECHERCHE\n");
        Alcohol_[] array = ctx_.db_.getAllAlcohol_();
        int i = 1;
        while (i==1){
            ArrayList<Integer> param=new ArrayList<Integer>();
            param.add(1);param.add(2);param.add(3);
            param.add(4);param.add(5);param.add(6);
            System.out.println(" Critères restants possibles :");
            if (param.contains(1))
                System.out.println(" [1] : Nom");
            if (param.contains(2))
                System.out.println(" [2] : Année");
            if (param.contains(3))
                System.out.println(" [3] : Fournisseur");
            if (param.contains(4))
                System.out.println(" [4] : Taux d'alcool");
            if (param.contains(5))
                System.out.println(" [5] : Pays");
            if (param.contains(6))
                System.out.println(" [6] : Types");
            System.out.println("Sur quelle critère voulez vous cherchez ?");
            String hello = ctx_.sc_.nextLine();
            if (hello == "1")
            Arrays.stream(array).filter(p -> Integer.parseInt(p.getLevel_()) > 6);
        }

        System.out.println(alcohol_);
    }


    /**
     * @param ctx_ the application context
     */
    private static void modification_(Context_ ctx_) {
        //TODO implémenter
    }


    /**
     * @param ctx_ the application context
     */
    private static void suppression_(Context_ ctx_) {
        //TODO implémenter
    }


    /**
     *
     * @param ctx_ the application context
     * @return the alcohol instance created
     */
    private static Alcohol_ createAlcoholFromStdin(Context_ ctx_) {
        Product_ type_   = null;
        int typeInt_     = 0;
        String country_  = "";
        String provider_ = "";
        String level_    = "";
        String name_     = "";
        int year_        = 0;

        System.out.println("> Type [BEER=1] [WINE=2] [LIQUOR=3]    : ");
        typeInt_ = input_check(ctx_.sc_,0,3,null);

        System.out.println("> Country  : ");
        country_ = ctx_.sc_.nextLine();
        System.out.println("> Provider : ");
        provider_ = ctx_.sc_.nextLine();
        System.out.println("> Level    : ");
        level_ = ctx_.sc_.nextLine();
        System.out.println("> Name     : ");
        name_ = ctx_.sc_.nextLine();

        System.out.println("> Year     : ");
        year_ = input_check(ctx_.sc_,0,3000,null);

        if (typeInt_ != -1) {
            if (typeInt_ == 1) {
                type_ = type_.BEER;
            } else if (typeInt_ == 2) {
                type_ = type_.WINE;
            } else if (typeInt_ == 3) {
                type_ = type_.LIQUOR;
            } else {
                System.err.println("Erreur de choix de chiffre !");
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
        if (typeInt_ != 0)
            alcohol_.setType_(type_);

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