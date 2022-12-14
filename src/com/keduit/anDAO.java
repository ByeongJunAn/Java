package com.keduit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class anDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private static anDAO dao;
	private final String url = "jdbc:mysql://localhost:3306/keduit?serverTimezone=UTC";
	private final String user = "root";
	private final String pwd = "0000";

	private anDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("----------- DriverManager---------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void disConnection() {
		try {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static anDAO newInstance() {
		if (dao == null)
			dao = new anDAO();
		return dao;
	}

	public void anInsert(anVO vo) {
		try {
			// 1. DB?�결
			getConnection();

			// 2. sql문�?? ????
			String sql = "insert into SeoulLocation values (null, ?,?,?,?,?,?)";

			// 3. mysql�? sql문�?? ????
			pstmt = conn.prepareStatement(sql);

			// prepareStatement?? vo??�? ???? �??? �??? ????
			pstmt.setString(1, vo.getTitle()); // 물�???? 첫�?�? ???��? ?�기
			pstmt.setString(2, vo.getdate());
			pstmt.setString(3, vo.getplace());
			pstmt.setString(4, vo.gethost());
			pstmt.setString(5, vo.getpresenter());
			

			// 5. ???��?? �??? ???��??? ???��????. 커�? ???��?��??
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
