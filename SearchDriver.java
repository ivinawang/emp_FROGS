public class SearchDriver {
	private static long avgBin = 0;
	private static long avgLin = 0;
	private static long begTimeLin = 0;
	private static long begTimeBin = 0;
	private static long endTimeLin = 0;
	private static long endTimeBin = 0;
	private static long timeLin = 0;
	private static long timeBin =0;
	private static long sumLin =0;
	private static long sumBin =0;

	public static void averageTime(Comparable[] a) {
		for (int i = 0; i < 200; i++) {
			int target = a.length-1;
			begTimeLin = System.currentTimeMillis();
               		LinSearch.linSearch(a, target);
                	endTimeLin = System.currentTimeMillis();
                	timeLin = endTimeLin - begTimeLin;
			sumLin += timeLin;

	                begTimeBin = System.currentTimeMillis();
	                BinSearch.binSearch(a, target);
	                endTimeBin = System.currentTimeMillis();
        	        timeBin = endTimeBin - begTimeBin;
			sumBin += timeBin;
		}
		avgLin /= 200;
		avgBin /= 200;
		System.out.println("\n");
		System.out.println(""+a.length+" length arrays: ");
                System.out.println("For 200 trials linSearch took a total of " + sumLin + " milliseconds.");
		System.out.println("However, for 200 trials binSearch took a total of " + sumBin + " milliseconds.");
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
