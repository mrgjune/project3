
public class KMeans {
    private int K; // number of classes
    private Characteristic[][] pixelProperties;
    private Characteristic[] means;
    private int numDimensions;

    public KMeans(int numClasses, int numDims, int numRows, int numCols) {
        K = numClasses;
        means = new Characteristic[K];
        pixelProperties = new Characteristic[numRows][numCols];
        numDimensions = numDims;
    }

    public RGBImage runKmeans() {
        randomizeMeans();

        // create a labelled (by classes) image
        RGBImage lbldImg = new RGBImage(pixelProperties.length, pixelProperties[0].length);

        // needs to determine the class for a pixel
        // can have a method that determines this class and returns it
        // e.g. call: int classNum = determineClass(pixelProperties[r][c]);

        // also needs to call: recomputeMeans();

        return lbldImg;
    }

    private void randomizeMeans() {
        // give random means for each dimension of each K in means array
    }

    private void recomputeMeans() {
        // will need a sum per K of all the items belonging to each class
        Characteristic[] sums = new Characteristic[K];

        // need to call addValues(pixelProperties[r][c]);
    }

    public void assignPixelProperties(int r, int c, double[] props) {
        pixelProperties[r][c] = new Characteristic(numDimensions);
        pixelProperties[r][c].setValues(props);
    }

    private int determineClass(Characteristic c) {
        // call distance in Characteristic class
        // to determine smallest distance between c and each mean
        // return class associated with the smallest distance
    }
}
