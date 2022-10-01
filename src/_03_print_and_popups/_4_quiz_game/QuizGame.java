package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int count= 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is 100 x 100?");
				// 3.  Use an if statement to check if their answer is correct
				if(input.equals("10,000")) {
			
				
				// 4.  if the user's answer was correct, add one to their score 
			 count +=1;
				}
				else {
					count -=1;
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
			  input = JOptionPane.showInputDialog("What is 20 x 10?");
			  if(input.equals("200")) {
				  count +=1;
			  }
			  else {
				  count -=1;
			  }
			  input = JOptionPane.showInputDialog("What is 60 divided by 3600 ?");
			  if(input.equals("-60")) {
				  count +=1;
			  }
			  else {
				  count -=1;
			  }
			 
			 
		
		// After all the questions have been asked, tell the user their final score
			  JOptionPane.showMessageDialog(null,count); 

			  
							  
						 
				
	}
}
