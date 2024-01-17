package world.objects;

import util.Vec3D;
import world.Object3D;

public class Pyramid implements Object3D {
    @Override
    public Vec3D[] getVertices() {
        return new Vec3D[] {
                new Vec3D(-0.5, -0.5, -0.5), // LV
                new Vec3D(-0.5, 0.5, -0.5), // LH
                new Vec3D(0.5, -0.5, -0.5), // RV
                new Vec3D(0.5, 0.5, -0.5), // RH
                new Vec3D(0, 0, 0.5) // M
        };
    }

    @Override
    public int[] getVertexLayout() {
        return new int[] {
                0, 1, 2,
                0, 1, 4,
                0, 2, 4,
                1, 2, 3,
                1, 3, 4,
                2, 3, 4,
        };
    }
}
