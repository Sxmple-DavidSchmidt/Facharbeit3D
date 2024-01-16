package world.objects;

import util.Vec3D;

public class Cube implements Object3D {
    private final Vec3D[] frontRow;

    public Cube() {
        frontRow = new Vec3D[] {
                new Vec3D(-1, -1),
                new Vec3D(-1, 1),
                new Vec3D(1, -1),
                new Vec3D(1, 1)
        };
    }

    @Override
    public Vec3D[] getVertices() {
        Vec3D offset = new Vec3D(0.707, -0.5);

        return new Vec3D[] {
                frontRow[0],
                frontRow[1],
                frontRow[2],
                frontRow[3],
                frontRow[0].add(offset),
                frontRow[1].add(offset),
                frontRow[2].add(offset),
                frontRow[3].add(offset),
        };
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
