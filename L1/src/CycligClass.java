
public class CycligClass implements Cycle {
	
	private String answer ;
	
	private int howMany ;
	
	protected CycligClass(String answer , int howMany)
	{
		this.answer = answer;
		this.howMany = howMany;
	}
	
	public String WhoCycling()
	{
		return answer;
	}
	public int HowManyCyclists()
	{
		return howMany;
	}

}
