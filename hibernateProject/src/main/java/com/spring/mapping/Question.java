package com.spring.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	@Column(name="question_id")
	private int quesId;
	private String ques;
	@OneToOne
	private Answer answer;
	public int getQuesId() {
		return quesId;
	}
	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question(int quesId, String ques, Answer answer) {
		super();
		this.quesId = quesId;
		this.ques = ques;
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", ques=" + ques + ", answer=" + answer + "]";
	}
	
	
	
	
	
	
	
	
}
