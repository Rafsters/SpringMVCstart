package mvcSpring;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private LinkedHashMap<String,String> countryObjects;
    private String favouriteLanguage;
    private String[] operatingSystems;

    public Student() {

        // populate country options: used ISO country code
        countryObjects = new LinkedHashMap<>();
        countryObjects.put("BR", "Brazil");
        countryObjects.put("FR", "France");
        countryObjects.put("DE", "Germany");
        countryObjects.put("IN", "India");
        countryObjects.put("US", "United States of America");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedHashMap<String, String> getCountryObjects() {
        return countryObjects;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
