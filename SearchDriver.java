public class SearchDriver {
	private static double avgBin = 0.0;
	private static double avgLin = 0.0;
	private static long BegTimeLin = 0;
	private static long BegTimeBin = 0;
	private static long EndTimeLin = 0;
	private static long EndTimeBin = 0;
	private static long TimeLin = 0;
	private static long TimeBin =0;

	public static void averageTime(Comparable[] a) {
		for (int i = 0; i < 50; i++) {
			int target = (int) (Math.random() * a.length);
			BegTimeLin = System.currentTimeMillis();
               		LinSearch.linSearch(a, target);
                	EndTimeLin = System.currentTimeMillis();
                	TimeLin = EndTimeLin - BegTimeLin;
			avgLin += TimeLin;

	                BegTimeBin = System.currentTimeMillis();
	                BinSearch.binSearch(a, target);
	                EndTimeBin = System.currentTimeMillis();
        	        TimeBin = EndTimeBin - BegTimeBin;
			avgBin += TimeBin;
		}
		avgLin /= 50;
		avgBin /= 50;
		System.out.println("\n");
		System.out.println(""+a.length+" length arrays: ");
		System.out.println("linSearch took an average of " + avgLin + " miliseconds.");
		System.out.println("However, binSearch took an avg of " + avgBin + " miliseconds.");

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
