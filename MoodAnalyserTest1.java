import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserTest1{
	
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
		MoodAnalyser ma = new MoodAnalyser("I am in Happy mood");
		String mood = ma.analyseMood();
		equals("HAPPY");
	}
	}
