package databasehelper;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by Salim on 01/12/2017.
 */


public class DBManagement_ {

    private MongoClient mongoClient_;
    private MongoClientURI mongoUri_;
    private MongoDatabase mongoDatabase_;
    private static DBManagement_ ourInstance = new DBManagement_();
    private MongoCollection<Document> ourCollection_;

    public static DBManagement_ getInstance() {
        return ourInstance;
    }

    private DBManagement_() {

        mongoUri_ =new MongoClientURI("mongodb://tdd_groupe4:hello2017@ds129386.mlab.com:29386/alcohols");
        mongoClient_ = new MongoClient(mongoUri_);
        mongoDatabase_ = mongoClient_.getDatabase(mongoUri_.getDatabase());
        ourCollection_ = mongoDatabase_.getCollection("alcohols");
        System.out.print("Database created");
    }

    public DBManagement_ initDatabase_ (){
        return ourInstance;
    }

    public void putAlcohols_(Document alcohol_){

        ourCollection_.insertOne(alcohol_);
    }
}
