package io.codeforall.fanstatics;

import javax.persistence.*;

@Entity(name = "VehicleSingleTable")
@Table(name = "vehicle_single_table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "vehicle_type",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class Vehicle {

    @Id
    private Integer age;
    private Integer maxSpeed;
}