public class SearchDriver {
	private static double avgBin = 0.0;
	private static double avgLin = 0.0;
	private static long begTimeLin = 0;
	private static long begTimeBin = 0;
	private static long endTimeLin = 0;
	private static long endTimeBin = 0;
	private static long timeLin = 0;
	private static long timeBin =0;

	public static void averageTime(Comparable[] a) {
		for (int i = 0; i < 50; i++) {
			int target = a.length;
			begTimeLin = System.currentTimeMillis();
               		LinSearch.linSearch(a, target);
                	endTimeLin = System.currentTimeMillis();
                	timeLin = endTimeLin - begTimeLin;
			avgLin += timeLin;

	                begTimeBin = System.currentTimeMillis();
	                BinSearch.binSearch(a, target);
	                endTimeBin = System.currentTimeMillis();
        	        timeBin = endTimeBin - begTimeBin;
			avgBin += timeBin;
		}
		avgLin /= 50;
		avgBin /= 50;
		System.out.println("\n");
		System.out.println(""+a.length+" length arrays: ");
		System.out.println("linSearch took an average of " + avgLin + " milliseconds.");
		System.out.println("However, binSearch took an avg of " + avgBin + " milliseconds.");

	}

	public static Comparable[] populate(Comparable[] x) {
		for(int i = 0; i < x.length; i++) {
			x[i] = i;
		}
		return x;
	}

	public static void main(String[] args) {
		for (int i=10; i< 1_000_000_000; i *= 10) {
			Comparable[] a = new Integer[i];
			a = populate(a); //populate the array
			averageTime(a); //get avg
		}
	}
}
