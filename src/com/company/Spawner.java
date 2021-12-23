package com.company;

import java.util.List;
import java.util.Random;

public class Spawner{
    private final List<? extends Monster> instances;

    public Spawner(List<? extends Monster> instances) {
        this.instances = instances;
    }

    public Monster spawn(){
        int randomIndex = new Random().nextInt(instances.size());
        return instances.get(randomIndex);
    }
}
