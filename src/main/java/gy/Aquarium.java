package gy;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> aquarium = new ArrayList<>();

    public void addFish(Fish f) {
        aquarium.add(f);
    }

    public void feed() {

        for (Fish f: aquarium) {
            f.feed();
        }

    }

    public void removeFish() {

        for (int i = 0; i<aquarium.size(); i++) {
            if (aquarium.get(i).getWeight()>=11) {
                aquarium.remove(0);
            }
        }

    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();

        for (Fish f: aquarium) {
            result.add(f.status());
        }

        return result;
    }

}
