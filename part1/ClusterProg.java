public ClusterProg
{
	// args[0] is image name
	// args[1] is the K
	public static void main(String args[])
	{
		RGBImage inImg = ...;
		// K, numDims, rows, cols
		KMeans km = new KMeans(Integer.parseInt(args[1]), 3, 
				     inputImg.getNumRows(), inputImg.getNumCols());

		// write code to compute the characteristics of each pixel and then 
                //   assign those properties for that pixel
		// need to call: km.assignPixelProperties(r,c,properties);
		
		RGBImage labelledImage = km.runKmeans();
		labelledImage.writeImage("segmentedByColorK" + args[1] + "-" + 
                                         args[0]);
	}
}
