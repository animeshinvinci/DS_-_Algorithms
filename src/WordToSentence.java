import java.util.Arrays;


public class WordToSentence {
	
	
	public static void main(String[] args) {
		
		String [] words = new String[10];
		words[0] = "I";
		words[1] = "am";
		words[2] = "Animesh";
		words[3] = "Mishra";
		words[4] = "HI";
		words[5] = "Bye";
		words[6] = "Are";
		words[7] = "You";
		words[8] = "Fool";
		words[9] = "No";
		
		String match = "IamAnimeshMishra";
		
		Arrays.sort(words);
		 for(String w:words){
			 System.out.println(w);
		 }
		 String [] matchedwords = new String[10];
		 matchWithSentence(match,words,matchedwords);
		 
		 
	}

	private static void matchWithSentence(String match, String[] words,
			String[] matchedwords) {
		// TODO Auto-generated method stub
		
		
	}
	

}
