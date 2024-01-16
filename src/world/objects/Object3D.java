package world.objects;

import math.Vec3D;

public interface Object3D {
    public Vec3D[] getVertices();
    public int[] getVertexLayout();
}
