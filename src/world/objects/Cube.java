package world.objects;

import util.Vec3D;
import world.Object3D;

public class Cube implements Object3D {
    private final Vec3D[] frontRow;

    public Cube() {
        frontRow = new Vec3D[] {
                new Vec3D(-0.5, -0.5, -0.5),
                new Vec3D(-0.5, 0.5, -0.5),
                new Vec3D(0.5, -0.5, -0.5),
                new Vec3D(0.5, 0.5, -0.5)
        };
    }

    @Override
    public Vec3D[] getVertices() {
        Vec3D offset = new Vec3D(0, 0, 1);

        return new Vec3D[] {
                frontRow[0], //LVU
                frontRow[1], //LHU
                frontRow[2], //RVU
                frontRow[3], //RHU
                frontRow[0].add(offset), //LVO
                frontRow[1].add(offset), //LHO
                frontRow[2].add(offset), //RVO
                frontRow[3].add(offset), //RHO
        };
    }

    @Override
    public int[] getVertexLayout() {
        return new int[] {
                0, 2, 6,
                0, 4, 6,
                4, 6, 7,
                4, 5, 7,
                2, 3, 7,
                2, 6, 7,
                0, 2, 3,
                0, 1, 3,
                0, 1, 4,
                1, 4, 5,
                1, 3, 5,
                3, 5, 7
        };
    }
}
