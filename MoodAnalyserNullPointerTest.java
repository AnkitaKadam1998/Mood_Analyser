import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserNullPointerTest{
	
	@Test
	public void testMessage_whenitsSad_shouldReturnSad()
	{
		MoodAnalyser ma = new MoodAnalyser("I am in Sad mood");
		String mood = ma.analyseMood();
		equals("SAD");
	}
	
	@Test
	public void testMessage_whenitsHappy_shouldReturnHappy()
	{
		MoodAnalyser ma = new MoodAnalyser("I am in any mood");
		String mood = ma.analyseMood();
		equals("HAPPY");
	}
	
	@Test
		public void testMessage_whenItsNull_shouldReturnHappy()
		{
			MoodAnalyser ma = new MoodAnalyser("Null");
			String mood = ma.analyseMood();
			equals("HAPPY");
			System.out.println("Null case");
		}
	}
