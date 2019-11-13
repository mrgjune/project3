public class Characteristic {
    private double[] characteristics;
    private int classNumber;

    public Characteristic(int numDims) {
        characteristics = new double[numDims];
    }

    public void addValues(Characteristic c) {
        for (int i = 0; i < characteristics.length; i++) {
            characteristics[i] += c.characteristics[i];
        }
    }

    public void setValues(double[] vals) {
        for (int i = 0; i < vals.length; i++) {
            characteristics[i] = vals[i];
        }
    }

    public double getVal(int idx) {
        return characteristics[idx];
    }

    public void setVal(int idx, double value) {
        characteristics[idx] = value;
    }

    public void setClassNumber(int cN) {
        classNumber = cN;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public double distance(Characteristic c2) {
        // determine the distance between this and c2
    }

    public static double distance(Characteristic c1, Characteristic c2) {
        // determine the distance between c1 and c2
        return c1.distance(c2);
    }
}
