package io.codeforall.fanstatics;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "BicycleSingleTable")
@DiscriminatorValue("bicycle")
public class Bicycle extends Vehicle {

    private String colour;
    private Integer pedals;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getPedals() {
        return pedals;
    }

    public void setPedals(Integer pedals) {
        this.pedals = pedals;
    }
}
