import rendering.UserInterface;
import world.World;
import world.objects.Cube;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.addObject(new Cube());

        UserInterface ui = new UserInterface();
        ui.setWorld(world);
        ui.show();
    }
}