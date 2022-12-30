package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Train extends Transport{
    String id;
    int carriageCount;
    boolean isExpress;

    /*public Train(String name, int capacity, int speed, float costOfKm, String id, int carriageCount, boolean isExpress) {
        super(name, capacity, speed, costOfKm);
        this.id = id;
        this.carriageCount = carriageCount;
        this.isExpress = isExpress;
    }*/

    @Override
    public float getPrice(City city) {
        return 0;
    }
}
