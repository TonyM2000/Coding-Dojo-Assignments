package anthony.burgers.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String burgername;
    private String restaurantname;
    private Integer rating;
    private String notes;

    public Burger() {
    }

    public Burger(Long id, String name, String burgername, String restaurantname, Integer rating, String notes) {
        this.id = id;
        this.name = name;
        this.burgername = burgername;
        this.restaurantname = restaurantname;
        this.rating = rating;
        this.notes = notes;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Burger name(String name) {
        setName(name);
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
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Burger)) {
            return false;
        }
        Burger burger = (Burger) o;
        return Objects.equals(id, burger.id) && Objects.equals(name, burger.name) && Objects.equals(burgername, burger.burgername) && Objects.equals(restaurantname, burger.restaurantname) && Objects.equals(rating, burger.rating) && Objects.equals(notes, burger.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, burgername, restaurantname, rating, notes);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", burgername='" + getBurgername() + "'" +
            ", restaurantname='" + getRestaurantname() + "'" +
            ", rating='" + getRating() + "'" +
            ", notes='" + getNotes() + "'" +
            "}";
    }

}
