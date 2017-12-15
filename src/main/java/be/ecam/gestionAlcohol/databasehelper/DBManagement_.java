package be.ecam.gestionAlcohol.databasehelper;

import be.ecam.gestionAlcohol.beans.Alcohol_;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

/**
 * implementation du design pattern Singeleton pour l'instance de base de donnée.
 */

public class DBManagement_ {

    private MongoClient mongoClient_;
    private MongoClientURI mongoUri_;
    private MongoDatabase mongoDatabase_;
    private static DBManagement_ ourInstance_ = new DBManagement_();
    private MongoCollection<Document> ourCollection_;

    public static DBManagement_ getInstance() {
        return ourInstance_;
    }


    private DBManagement_()  {
        mongoUri_ = new MongoClientURI("mongodb://tdd_groupe4:hello2017@ds129386.mlab.com:29386/alcohols");
        mongoClient_ = new MongoClient(mongoUri_);
        mongoDatabase_ = mongoClient_.getDatabase(mongoUri_.getDatabase());
        ourCollection_ = mongoDatabase_.getCollection("alcohols");
    }


    public DBManagement_ initDatabase_ (){
        return ourInstance_;
    }


    /**
     * Function that allow to add an object to the remote database
     * @param alcohol_ take an alcohol as a parameter to search it in the database
     */
    public void putAlcohols_(Alcohol_ alcohol_) {
        Document doc = new Document()
                .append("name",     alcohol_.getName_())
                .append("provider", alcohol_.getProvider_())
                .append("level",    alcohol_.getLevel_())
                .append("country",  alcohol_.getCountry_())
                .append("year",     alcohol_.getYear_())
                .append("type",     alcohol_.getTypeStr_());
        ourCollection_.insertOne(doc);
    }


    public Alcohol_[] getAllAlcohol_() {
        Iterable<Document> iterable = ourCollection_.find();
        Alcohol_[] array = Alcohol_.buildFromDB(iterable);

        return array;
    }


    /**
     * Function that allow to find an object to the remote database
     * @param alcohol_ take an alcohol as a parameter to search it in the database
     */
    public Alcohol_ findOneAlcohol_(Alcohol_ alcohol_) {
        ourCollection_.find();


        return alcohol_;
    }

    /**
     * Helper to fill the database easily when parsing a file.
     * Used in the DBFiller_ class
     * @param doc_ the bson document
     */
    public void putAlcoholsBson_(Document doc_) {
        ourCollection_.insertOne(doc_);
    }


}
