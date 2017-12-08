package be.ecam.gestionAlcohol.beans;

/**
 * Class that create an Alcohol Object with the Builder design pattern.
 * Created by Team 4 on 01/12/2017.
 */
public class Alcohol_ {
     private long id_;
     private String name_;
     private String provider_;
     private String level_;
     private String country_;
     private int year_;

    public Alcohol_ (Builder_ alcoholBuilder_){
        this.name_=alcoholBuilder_.name_;
        this.provider_ = alcoholBuilder_.provider_;
        this.level_ = alcoholBuilder_.level_;
        this.country_ = alcoholBuilder_.country_;
        this.id_ = alcoholBuilder_.id_;
        this.year_ = alcoholBuilder_.year_;
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

    public int getYear_() {
        return year_;
    }

    public void setYear_(int year_) {
        this.year_ = year_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[")
            .append(id_).append("][")
            .append(name_).append("][")
            .append(provider_).append("][")
            .append(level_).append("][")
            .append(country_).append("][")
            .append(year_).append("]");
        return sb.toString();
    }

    /** Start of the builder class**/
    public static final class Builder_ {
        private long id_;
        private String name_;
        private String provider_;
        private String level_;
        private String country_;
        private int year_;

        public Builder_ (String name, String level){
            this.name_ = name;
            this.level_ = level;
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
        
        public Alcohol_ build_() {
            return new Alcohol_(this);
        }
    }

}