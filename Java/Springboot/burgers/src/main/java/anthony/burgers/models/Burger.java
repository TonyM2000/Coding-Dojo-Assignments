package anthony.burgers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String burgername;
    private String restaurantname;
    private Integer rating;
    private String notes;

    public Burger() {}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBurgername() {
        return this.burgername;
    }

    public void setBurgername(String burgername) {
        this.burgername = burgername;
    }

    public String getRestaurantname() {
        return this.restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Burger id(Long id) {
        setId(id);
        return this;
    }

    public Burger burgername(String burgername) {
        setBurgername(burgername);
        return this;
    }

    public Burger restaurantname(String restaurantname) {
        setRestaurantname(restaurantname);
        return this;
    }

    public Burger rating(Integer rating) {
        setRating(rating);
        return this;
    }

    public Burger notes(String notes) {
        setNotes(notes);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", burgername='" + getBurgername() + "'" +
            ", restaurantname='" + getRestaurantname() + "'" +
            ", rating='" + getRating() + "'" +
            ", notes='" + getNotes() + "'" +
            "}";
    }
    }
