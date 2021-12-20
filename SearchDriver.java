public class SearchDriver {

	public static void main(String[] args) {
		Comparable[] a = { 2, 4, 6, 8, 6, 42 };
		long BegTimeLin = 0;
		long BegTimeBin = 0;
		long EndTimeLin = 0;
		long EndTimeBin = 0;
		long TimeLin = 0;
		long TimeBin =0;
		BegTimeLin = System.currentTimeMillis();
		LinSearch.linSearch(a, 42);
		EndTimeLin = System.currentTimeMillis();
		TimeLin = EndTimeLin - BegTimeLin;

		BegTimeBin = System.currentTimeMillis();
                BinSearch.binSearch(a, 42);
                EndTimeBin = System.currentTimeMillis();
                TimeBin = EndTimeBin - BegTimeBin;

		System.out.println("LinSearch took " + TimeLin + " miliseconds. However, binSearch to run which took " + TimeBin + " miliseconds.");

		//1,000 length arrays
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

	                BegTimeBin = System.currentTimeMillis();
	                BinSearch.binSearch(hewwo, target); 
	                EndTimeBin = System.currentTimeMillis();
        	        TimeBin = EndTimeBin - BegTimeBin;
			System.out.println("LinSearch took " + TimeLin + " miliseconds. However, binSearch to run which took " + TimeBin + " miliseconds.");
		}
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
