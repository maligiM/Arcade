import java.util.ArrayList;

public class Question {
	public int points;
	public String question;
	public String answer;
	public String category;
	public Question(int points, String question, String answer, String category) {
		this.points =points;
		this.question = question;
		this.answer = answer;
		this.category=category;
	}
	public Question(int p, int q ) {
		
	}

}
 class QuestionList{
	 Question[] questions = new Question[20];
	 public QuestionList() {
		 questions[0] = new Question(100,"What is the capital of France","Paris","Geography");
		 questions[1] = new Question(200,"What is the longest river in  the world","Nile River","Geography");
		 questions[2] = new Question(300,"Which country has the largest land area in the world","Russia","Geography");
		 questions[3] = new Question(400,"Name a country that shares a  border with Russia and China ","Mongolia","Geography");
		 questions[4] = new Question(500,"What is the tallest mountain  in Africa","Mount Kilimanjaro","Geography");
		 questions[5] = new Question(100,"Who is the lead singer of the band Queen?","Freddie Mercury","Pop Culture");
		 questions[6] = new Question(200,"Which movie won the award for  best picture in 2020?","Parasite","Pop Culture");
		 questions[7] = new Question(300,"What is the name of the town  in the show Stranger things?","Hawkins","Pop Culture");
		 questions[8] = new Question(400,"Who created the super hero  Spider Man?","Stan Lee","Pop Culture");
		 questions[9] = new Question(500,"WWhat is the birth name of  Bob Dylan","Robert Zimmerman","Pop Culture");
		 questions[10] = new Question(100,"Who is the first president  of the United States?","George Washington","History");
		 questions[11] = new Question(200,"What year did the Titanic sink?","1912","History");
		 questions[12] = new Question(300,"Which country was the first  to allow women to vote in 1893?","New Zealand","History");
		 questions[13] = new Question(400,"Who was the Prime Minister of  Great Britain during WWII?","Winston Churchill","History");
		 questions[14] = new Question(500,"What was the name of the Byzantine  capital before it was renamed to Istanbul?","Constantinople","History");
		 questions[15] = new Question(100,"What planet is known as the “Red Planet”?","Mars","Science");
		 questions[16] = new Question(200,"What is the chemical symbol for nitrogen?","N","Science");
		 questions[17] = new Question(300,"What gas to plants  absorb during photosynthesis","Carbon Dioxide","Science");
		 questions[18] = new Question(400,"Who made the theory of  general relativity?","Albert Einstein","Science");
		 questions[19] = new Question(500,"What is the most abundant protein  in the human body?","Collagen","Science");
		 
	 }
	 
	
}