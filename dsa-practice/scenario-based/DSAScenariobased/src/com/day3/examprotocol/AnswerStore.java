package com.day3.examprotocol;
import java.util.HashMap;
public class AnswerStore 
{
	HashMap<Integer, String> answers = new HashMap<>();

	    void saveAnswer(int qid, String answer) 
	    {
	        answers.put(qid, answer);
	    }

	    String getAnswer(int qid) 
	    {
	        return answers.get(qid);
	    }
}
