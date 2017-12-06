package beans;
/**
 * Class that create an Alcohol Object with the Builder design. 
 * Created by Team 4 on 01/12/2017.
 */
public class Alcohol_ {
     private long id_;
     private String name_;
     private String provider_;
     private String level_;
     private String country_;
     private int year_;
     private Product_ type_;


    public Alcohol_ (Builder_ alcoholBuilder_){
        this.name_=alcoholBuilder_.name_;
        this.provider_ = alcoholBuilder_.provider_;
        this.level_ = alcoholBuilder_.level_;
        this.country_ = alcoholBuilder_.country_;
        this.id_ = alcoholBuilder_.id_;
        this.year_ = alcoholBuilder_.year_;
        this.type_ = alcoholBuilder_.type_;
    }

    public long getId_() {
        return id_;
    }

    public void setId_(long id_) {
        this.id_ = id_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getProvider_() {
        return provider_;
    }

    public void setProvider_(String provider_) {
        this.provider_ = provider_;
    }

    public String getLevel_() {
        return level_;
    }

    public void setLevel_(String level_) {
        this.level_ = level_;
    }

    public String getCountry_() {
        return country_;
    }

    public void setCountry_(String country_) {
        this.country_ = country_;
    }

    public int getYear_() { return  year_; }

    public void setYear_(int year) { this.year_ = year_; }

    public Product_ getType_() { return type_; }

    public void setType_(Product_ type_) { this.type_ = type_; }

    public static final class Builder_ {
        private long id_;
        private String name_;
        private String provider_;
        private String level_;
        private String country_;
        private int year_;
        private Product_ type_;

        public Builder_ (){
        }

        public Builder_ id_(long id){
            this.id_ = id;
            return this;
        }

        public Builder_ provider_(String provider) {
            this.provider_ = provider;
            return this;
        }

        public Builder_ country_(String country) {
            this.country_ = country;
            return this;
        }

        public Builder_ year_(int year) {
            this.year_ = year;
            return this;
        }

        public Builder_ type_(Product_ type){
            this.type_  = type;
            return this;
        }
        
        public Alcohol_ build_() {
            return new Alcohol_(this);
        }
    }

}
