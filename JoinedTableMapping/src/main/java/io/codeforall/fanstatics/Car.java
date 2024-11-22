package io.codeforall.fanstatics;

import javax.persistence.*;

@Entity(name = "CarJoinedTable")
@Table(name = "car_joined_table")
public class Car extends Vehicle {
    private Integer gears;

    public Integer getGears() {
        return gears;
    }

    public void setGears(Integer gears) {
        this.gears = gears;
    }

}
