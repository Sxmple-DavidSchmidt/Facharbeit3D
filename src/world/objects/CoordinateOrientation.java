package world.objects;

import util.Vec3D;
import world.Object3D;

public class CoordinateOrientation implements Object3D {
    @Override
    public Vec3D[] getVertices() {
        return new Vec3D[] {
                new Vec3D(0, 0, 0),
                new Vec3D(0.5, 0, 0),
                new Vec3D(0, 0.5, 0),
                new Vec3D(0, 0, 0.5)
        };
    }

    @Override
    public int[] getVertexLayout() {
        return new int[] {
                0, 0, 1,
                0, 0, 2,
                0, 0, 3
        };
    }
}
