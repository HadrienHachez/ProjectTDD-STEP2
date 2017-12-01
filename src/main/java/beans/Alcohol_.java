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

    public Alcohol_() {
    }

    public Alcohol_(long id_, String name_, String provider_, String level_, String country_) {
        this.id_ = id_;
        this.name_ = name_;
        this.provider_ = provider_;
        this.level_ = level_;
        this.country_ = country_;
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


}
