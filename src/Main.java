import rendering.UserInterface;
import world.World;

import world.objects.*;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.addObject(new Pyramid());
        // world.addObject(new Cube());
        // world.addObject(new CoordinateOrientation());
        // world.addObject(new TriangleTest());

        UserInterface ui = new UserInterface();
        ui.setWorld(world);
        ui.show();
    }
}