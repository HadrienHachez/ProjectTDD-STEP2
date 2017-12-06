package databasehelper;

import beans.Alcohol_;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by Team4 on 01/12/2017.
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

        System.out.print("Database created");
    }

    public DBManagement_ initDatabase_ (){
        return ourInstance_;
    }


    /**Function that allow to add an object to the remote database**/
    public void putAlcohols_(Alcohol_ alcohol_){
        Document doc = new Document("name", "MongoDB")
                .append("provider", alcohol_.getName_())
                .append("level",alcohol_.getLevel_() )
                .append("country", alcohol_.getCountry_())
                .append("year", alcohol_.getYear_());
        ourCollection_.insertOne(doc);
    }

    /**Function that allow to add an object to the remote database
     * @param1 : Take an alcohol as a parameter to search it in the database**/
    public Alcohol_ findOneAlcohol_ (Alcohol_ alcohol_) {



        return alcohol_;
    }


}
