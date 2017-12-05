package databasehelper;

import com.mongodb.MongoClient;

/**
 * Created by Salim on 01/12/2017.
 */


public class DBManagment_ {

    private MongoClient mongoClient_;
    private static DBManagment_ ourInstance = new DBManagment_();

    public static DBManagment_ getInstance() {
        return ourInstance;
    }

    private DBManagment_() {
    }
}
