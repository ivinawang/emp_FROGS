public class SearchDriver {
	private double avgBin = 0.0;
	private double avgLin = 0.0;
	private long BegTimeLin = 0;
	private long BegTimeBin = 0;
	private long EndTimeLin = 0;
	private long EndTimeBin = 0;
	private long TimeLin = 0;
	private long TimeBin =0;

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
		System.out.println(""+a.length+" length arrays: ");
		System.out.println("LinSearch took an average of " + avgLin + " miliseconds.");
		System.out.println("However, binSearch took an avg of " + avgBin + " miliseconds.");

	}

	public static Comparable[] populate(Comparable[]) {
		
	}

	public static void main(String[] args) {
		for (i=10; i<1000000000; i *= 100) {
			Comparable[] a = new Integer[i];
			//populate the array
			//get avg

		}


		//10,000 length arrays
		Comparable[] hewwo = new Integer[10000];
		for( int i = 0; i < hewwo.length; i++ ) {
			hewwo[i] = i;
		}
		for (int i = 0; i < 15; i++) {
			int target = (int) (Math.random() * 10000);
			BegTimeLin = System.currentTimeMillis();
               		LinSearch.linSearch(hewwo, target);
                	EndTimeLin = System.currentTimeMillis();
                	TimeLin = EndTimeLin - BegTimeLin;
									avgLin += TimeLin;

	                BegTimeBin = System.currentTimeMillis();
	                BinSearch.binSearch(hewwo, target);
	                EndTimeBin = System.currentTimeMillis();
        	        TimeBin = EndTimeBin - BegTimeBin;
									avgBin += TimeBin;
		}
		avgLin /= 15;
		avgBin /= 15;
		System.out.println("\n");
		System.out.println("10,000 length arrays: ");
		System.out.println("LinSearch took an average of " + avgLin + " miliseconds. However, binSearch took an avg of" + avgBin + " miliseconds.");

		System.out.println("\n");
		//1,000,000 length arrays
                Comparable[] computerKiller = new Integer[1000000];
                for( int i = 0; i < computerKiller.length; i++ ) {
                        computerKiller[i] = i;
                }
                for (int i = 0; i < 15; i++) {
                        int target = (int) (Math.random() * 1000000);
                        BegTimeLin = System.currentTimeMillis();
                        LinSearch.linSearch(computerKiller, target);
                        EndTimeLin = System.currentTimeMillis();
                        TimeLin = EndTimeLin - BegTimeLin;

                        BegTimeBin = System.currentTimeMillis();
                        BinSearch.binSearch(computerKiller, target);
                        EndTimeBin = System.currentTimeMillis();
                        TimeBin = EndTimeBin - BegTimeBin;
                        System.out.println("LinSearch took " + TimeLin + " miliseconds. However, binSearch to run which took " + TimeBin + " miliseconds.");
                }
		System.out.println("\n");
		//100,000,000 length arrays
		Comparable[] computerMurderer = new Integer[100000000];
                for( int i = 0; i < computerMurderer.length; i++ ) {
                        computerMurderer[i] = i;
                }
                for (int i = 0; i < 15; i++) {
                        int target = (int) (Math.random() * 100000000);
                        BegTimeLin = System.currentTimeMillis();
                        LinSearch.linSearch(computerMurderer, target);
                        EndTimeLin = System.currentTimeMillis();
                        TimeLin = EndTimeLin - BegTimeLin;

                        BegTimeBin = System.currentTimeMillis();
                        BinSearch.binSearch(computerMurderer, target);
                        EndTimeBin = System.currentTimeMillis();
                        TimeBin = EndTimeBin - BegTimeBin;
                        System.out.println("LinSearch took " + TimeLin + " miliseconds. However, binSearch to run which took " + TimeBin + " miliseconds.");
                }

	}
}
