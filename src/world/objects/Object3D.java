package world.objects;

import util.Vec3D;

public interface Object3D {
    public Vec3D[] getVertices();
    public int[] getVertexLayout();
}
