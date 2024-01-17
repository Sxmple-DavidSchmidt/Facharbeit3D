import rendering.UserInterface;
import world.World;

import world.objects.CoordinateOrientation;
import world.objects.Cube;
import world.objects.Pyramid;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        // world.addObject(new Cube());
        // world.addObject(new CoordinateOrientation());
        world.addObject(new Pyramid());

        UserInterface ui = new UserInterface();
        ui.setWorld(world);
        ui.show();
    }
}