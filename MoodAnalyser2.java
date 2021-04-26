public class MoodAnalyser2 {

		
		String message;
		public MoodAnalyser2() {}

		public MoodAnalyser2(String message)
		{
			this.message=message;
		}
		
		public String analyseMood()
		{
			try
			{
				if(message.contains("Sad"))
					return "SAD";				
				else 
					return "HAPPY";
			}	
			catch(NullPointerException e)
			{
			return "HAPPY";
			}
		}
}
