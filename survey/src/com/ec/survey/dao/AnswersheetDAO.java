package com.ec.survey.dao;

import java.util.List;

import com.ec.survey.dto.Answersheet;
import com.swufe.pager.PageListener;

public interface AnswersheetDAO extends PageListener {

	char addAnswersheet(Answersheet answersheet);
	//boolean updateAnswersheet(Answersheet answersheet);
	char delAnswersheet(Long answersheetId);
	char delAnswersheets(int sid);
	List<Answersheet> listAllAnswersheet(Long surveyId);
	Answersheet findAnswersheet(Long answersheetId);
	char isIpRepeate(int sid,String IP);
}
