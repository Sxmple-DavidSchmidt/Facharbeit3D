package world.objects;

import math.Vec3D;
public class Cube implements Object3D {

    @Override
    public Vec3D[] getVertices() {
        Vec3D c1 = new Vec3D(-1, -1);
        Vec3D c2 = new Vec3D(1, -1);
        Vec3D c3 = new Vec3D(-1, 1);
        Vec3D c4 = new Vec3D(1, 1);
        Vec3D c5 = new Vec3D(-1 + 0.5, -1 - 0.35);
        Vec3D c6 = new Vec3D(1 + 0.5, -1 - 0.35);
        Vec3D c7 = new Vec3D(-1 + 0.5, 1 - 0.35);
        Vec3D c8 = new Vec3D(1 + 0.5, 1 - 0.35);

        return new Vec3D[] {c1, c2, c3, c4, c5, c6, c7, c8};
    }

    @Override
    public int[] getVertexLayout() {
        return new int[] {
                0, 1, 2,
                1, 2, 3,
                4, 5, 6,
                5, 6, 7,
                0, 1, 4,
                1, 4, 5,
                1, 3, 5,
                3, 5, 7,
                2, 3, 6,
                3, 6, 7,
                0, 2, 6,
                0, 4, 6
        };
    }
}
