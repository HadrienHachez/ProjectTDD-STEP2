package be.ecam.gestionAlcohol.beans;

/**
 * Class that create an Alcohol Object with the Builder design pattern.
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
        this.id_       = alcoholBuilder_.id_;
        this.name_     = alcoholBuilder_.name_;
        this.year_     = alcoholBuilder_.year_;
        this.type_     = alcoholBuilder_.type_;
        this.level_    = alcoholBuilder_.level_;
        this.country_  = alcoholBuilder_.country_;
        this.provider_ = alcoholBuilder_.provider_;
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

    public Product_ getType_() {
        return type_;
    }

    public void setType_(Product_ type_) {
        this.type_ = type_;
    }

    public String getTypeStr_() {
        if (this.type_ == Product_.BEER)
            return "Bière";
        if (this.type_ == Product_.LIQUOR)
            return "Liqueur";
        else
            return "Vin";
    }

    public void setTypeStr_(String type_) {
        if (type_.equalsIgnoreCase("Bière"))
            this.type_ = Product_.BEER;
        else if (type_.equalsIgnoreCase("Liqueur"))
            this.type_ = Product_.LIQUOR;
        else
            this.type_ = Product_.WINE;
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

    // Start of the builder class
    public static final class Builder_ {
        private long id_         = 0;
        private int year_        = 0;
        private String name_     = "Sans nom";
        private String provider_ = "Sans brasserie";
        private String level_    = "Sans alcohol";
        private String country_  = "Sans pays";
        private Product_ type_   = Product_.BEER;

        public Builder_(String name_, String level_) {
            this.name_ = name_;
            this.level_ = level_;
        }

        public Alcohol_ build_() {
            return new Alcohol_(this);
        }
    }

}
