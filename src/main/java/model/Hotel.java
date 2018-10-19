package model;

public class Hotel {

    private String name;
    private String globalRating;
    private String dateOfConstruction;
    private String country;
    private String city;
    private String shortDescription;
    private String description;
    private String notes;

    public Hotel() {
    }

    public Hotel(String name, String globalRating, String dateOfConstruction, String country, String city,
                 String shortDescription, String description, String notes) {
        this.name = name;
        this.globalRating = globalRating;
        this.dateOfConstruction = dateOfConstruction;
        this.country = country;
        this.city = city;
        this.shortDescription = shortDescription;
        this.description = description;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGlobalRating() {
        return globalRating;
    }

    public void setGlobalRating(String globalRating) {
        this.globalRating = globalRating;
    }

    public String getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setDateOfConstruction(String dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public static class HotelBuilder {
        private String name;
        private String globalRating;
        private String dateOfConstruction;
        private String country;
        private String city;
        private String shortDescription;
        private String description;
        private String notes;

        public HotelBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HotelBuilder setGlobalRating(String globalRating) {
            this.globalRating = globalRating;
            return this;
        }

        public HotelBuilder setDateOfConstruction(String dateOfConstruction) {
            this.dateOfConstruction = dateOfConstruction;
            return this;
        }

        public HotelBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public HotelBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public HotelBuilder setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public HotelBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public HotelBuilder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public Hotel createHotel() {
            return new Hotel(name, globalRating, dateOfConstruction, country, city, shortDescription, description, notes);
        }
    }
}
