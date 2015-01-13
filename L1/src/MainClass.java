
public class MainClass{

	
	
	
	public static void main(String[] args) {
		BikeCyclingClass bcc = new BikeCyclingClass();
		Cycle cyc = bcc.BikeCycling();
		System.out.print(cyc.WhoCycling());

		TriCyclingClass tcc = new TriCyclingClass();
		cyc = tcc.TriCycling();
		System.out.print(cyc.WhoCycling());
		
	}

}
