package util;

public class Vec3D {
    public double x;
    public double y;
    public double z;

    public Vec3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3D add(Vec3D vec) {
        return new Vec3D(x + vec.x, y + vec.y, z + vec.z);
    }

    public Vec3D scale(double factor) {
        return new Vec3D(x * factor, y * factor, z * factor);
    }
}
