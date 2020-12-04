package derycke.ilja.fullstackopdracht.model;

import javax.persistence.*;

@Entity
public class Opleiding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String naam;
    private String omschrijving;
    private double prijs;

    public Opleiding(String naam, String omschrijving, double prijs) {
        this.naam = naam;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public Opleiding() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
}
