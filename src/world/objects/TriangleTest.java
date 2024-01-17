package world.objects;

import util.Vec3D;
import world.Object3D;

public class TriangleTest implements Object3D {

    @Override
    public Vec3D[] getVertices() {
        return new Vec3D[] {
                new Vec3D(-0.5, 0.0, -0.5),
                new Vec3D(0.5, 0.0, -0.5),
                new Vec3D(0.0, 0.0, 0.5),

                new Vec3D(-0.5, 0.0, -0.75),
                new Vec3D(0.5, 0.0, -0.75),
                new Vec3D(0.0, 0.0, 0.25),

                new Vec3D(-0.25, 0.0, -0.65),
                new Vec3D(0.75, 0.0, -0.65),
                new Vec3D(0.25, 0.0, 0.45),
        };
    }

    @Override
    public int[] getVertexLayout() {
        return new int[] {
                0, 1, 2,
                3, 4, 5,
                6, 7, 8
        };
    }
}
