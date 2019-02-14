package com.suraj.springassignment.customer_application;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	int questionId;
	String question;
	List answers;
	Set answerSet;
	Map AnswerMap;
	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the answers
	 */
	public List getAnswers() {
		return answers;
	}
	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List answers) {
		this.answers = answers;
	}
	/**
	 * @return the answerSet
	 */
	public Set getAnswerSet() {
		return answerSet;
	}
	/**
	 * @param answerSet the answerSet to set
	 */
	public void setAnswerSet(Set answerSet) {
		this.answerSet = answerSet;
	}
	/**
	 * @return the answerMap
	 */
	public Map getAnswerMap() {
		return AnswerMap;
	}
	/**
	 * @param answerMap the answerMap to set
	 */
	public void setAnswerMap(Map answerMap) {
		AnswerMap = answerMap;
	}
	
	
public void getAns(){
	System.out.println("Details: "+"qusestionId: "+getQuestionId()+" "+"questins: "+getQuestion()+"   " +" List_answers: "+getAnswers()+" "+"Set_answers: "+getAnswerSet()+" "+" Map_answer: "+getAnswerMap()  );
}
	
}
