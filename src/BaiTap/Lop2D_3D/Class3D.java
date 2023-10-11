package BaiTap.Lop2D_3D;

public class Class3D extends Class2D {
    private float z;

    public Class3D() {
    }

    public Class3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return (super.toString() + "Class3D{ z= " + this.z + " }");
    }

    public void getXYZ(float x, float y, float z) {
        float[] arr = {x, y, z};
    }

    public void setZ(float z) {
        this.z = z;
    }
}
