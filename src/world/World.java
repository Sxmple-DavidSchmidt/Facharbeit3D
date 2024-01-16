package world;

import world.objects.Object3D;

import java.util.ArrayList;

public class World {
    private ArrayList<Object3D> worldObjects;

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
