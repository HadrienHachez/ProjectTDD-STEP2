package beans;

/**
 * Created by Salim on 01/12/2017.
 */
public class Alcohol_ {
     private long id_;
     private String name_;
     private String provider_;
     private String level_;
     private String country_;


    public Alcohol_ (Builder alcoholBuilder_){
        this.name_=alcoholBuilder_.name_;
        this.provider_ = alcoholBuilder_.provider_;
        this.level_ = alcoholBuilder_.level_;
        this.country_ = alcoholBuilder_.country_;
        this.id_ = alcoholBuilder_.id_;
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

    public static final class Builder {
        private long id_;
        private String name_;
        private String provider_;
        private String level_;
        private String country_;


        public Builder (String name, String level){
            this.name_ = name;
            this.level_ = level;
        }

        public Builder id (long id){
            this.id_ = id;
            return this;
        }

        public Builder provider (String provider) {
            this.provider_ = provider;
            return this;
        }

        public Builder country (String country) {
            this.country_ = country;
            return this;
        }

        public Alcohol_ build() {
            return new Alcohol_(this);
        }
    }

}
