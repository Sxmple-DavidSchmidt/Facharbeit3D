package util;

public class Vec3D {
    public double x;
    public double y;

    public Vec3D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vec3D add(Vec3D vec) {
        return new Vec3D(x + vec.x, y + vec.y);
    }
}
