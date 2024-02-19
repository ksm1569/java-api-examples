package com.smsoft.report;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;


public class Main {

    public int joinMember(User user) throws SQLException {

        Connection conn = null;
        PreparedStatement pstmt = null;

        int result = 0;

        // 1. DB 접속정보 변수 (변수명이 겹쳤었음)
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String connectionUser = "test_01";
        String connectionPassword = "T8S2e00";

        String query = "INSERT INTO USER_TBL VALUES(?,?,?,?)";

        conn = DriverManager.getConnection(url, connectionUser, connectionPassword);

        conn.setAutoCommit(false);

        pstmt = conn.prepareStatement(query);

        pstmt.setString(1, user.getUserId());
        pstmt.setString(2, user.getUserPw());
        pstmt.setString(3, user.getUserName());
        pstmt.setDate(4, new java.sql.Date(user.getEnrollDate().getTime()));// 2. util.Date를 java.sql.Date로 변환해줘야함

        // 3. insert 문은 executeUpdate() 사용해야함
        result = pstmt.executeUpdate();

        if ( result > 0 ) {
            conn.rollback();
        }else {
            conn.commit();
        }

        pstmt.close();
        conn.close();

        return result;

    }
}
