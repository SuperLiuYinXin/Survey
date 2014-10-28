package com.ec.survey.dao;

import java.util.List;

import com.ec.survey.dto.Text;
import com.swufe.pager.PageListener;

public interface TextDAO extends PageListener{
	char addText(Text text);
	char delText(int sid);
	List<Text> listAllText(int questionId);
	Text findText(int textId);
}
