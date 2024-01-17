package world;

import java.util.ArrayList;
import java.util.HashSet;

public class World {
    private final ArrayList<Object3D> worldObjects;

    public World() {
        worldObjects = new ArrayList<>();
    }

    public void addObject(Object3D object) {
        worldObjects.add(object);
    }

    public ArrayList<Object3D> getWorldObjects() {
        return worldObjects;
    }
}
