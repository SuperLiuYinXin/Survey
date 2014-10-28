package com.ec.survey.dao.mssqlimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSet;

import com.ec.survey.dao.TextDAO;
import com.ec.survey.dto.Question;
import com.ec.survey.dto.Text;
import com.swufe.pager.PageConfig;
import com.swufe.sql.ConnectionFactory;
import com.swufe.sql.SQLCommand;

public class TextDAOimpl implements TextDAO {

	public char addText(Text text) {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "INSERT INTO text(q_id, t_content)" + " VALUES(?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, text.getQId());
			pstmt.setString(2, text.getTContent());

			return pstmt.executeUpdate() == 1 ? '1' : '0';

		} catch (SQLException e) {

			e.printStackTrace();
			return '0';
		} finally {
			SQLCommand.close(pstmt);
			SQLCommand.close(conn);
		}

	}

	public char delText(int sid) {
		SQLCommand cmd = new SQLCommand();
		if (-1 != cmd
				.executeSQL("delete from text where q_id in (select q_id from question where s_id="
						+ sid + ")")) {
			return '1';
		} else {
			return '0';
		}
	}

	public Text findText(int textId) {
		SQLCommand cmd = new SQLCommand();
		RowSet rs = cmd.queryRowSet("select * from text where t_id=" + textId);
		Text text = new Text();
		try {
			if (rs.next()) {
				text.setTId(rs.getLong("t_id"));
				text.setQId(rs.getLong("q_id"));
				text.setTContent(rs.getString("t_content"));
				return text;
			}

			return null;

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			SQLCommand.close(rs);
		}
		return null;
	}

	public List<Text> listAllText(int questionId) {
		SQLCommand cmd = new SQLCommand();
		RowSet rs = cmd.queryRowSet("select * from text where q_id="
				+ questionId);

		Text text;
		List<Text> list = new ArrayList<Text>();
		try {
			while (rs.next()) {
				text = new Text();
				text.setTId(rs.getLong("t_id"));
				text.setQId(rs.getLong("q_id"));
				text.setTContent(rs.getString("t_content"));
				list.add(text);
			}

			return list;

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			SQLCommand.close(rs);
		}
		return null;
	}


	public List<?> doSelect(int recordStart, int sizePage, PageConfig pageConfig) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCount(PageConfig pageConfig) {
		// TODO Auto-generated method stub
		return 0;
	}


}
