import rendering.Window;
import world.World;
import world.objects.Cube;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.addObject(new Cube());

        Window w = new Window();
        w.setWorld(world);
        w.show();
    }
}