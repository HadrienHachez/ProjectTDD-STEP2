package be.ecam.gestionAlcohol;

import be.ecam.gestionAlcohol.databasehelper.DBManagement_;

import java.util.Scanner;

public class Context_ {

    public DBManagement_ db_;
    public Scanner sc_;

    private static final Context_ INSTANCE_ = new Context_();

    private Context_() {
        this.sc_ = new Scanner(System.in);
        this.db_ = DBManagement_.getInstance();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Context_ getInstance_() {
        return INSTANCE_;
    }

}
