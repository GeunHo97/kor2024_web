package day59.model.dao;

import day52.boardservice12mvc.model.BoardDao;
import day59.model.dto.MemberDto;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component  // 스프링 컨테이너(메모리) 에 빈(인스턴스) 주입
public class MemberDao {
    private Connection conn;
    private String DBURL = "jdbc:mysql://localhost:3306/mydb0109";
    private String DBUSER = "root";
    private String DBPWD = "1234";

    // [0] DB연동
    public MemberDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        } catch ( Exception e ) {
            throw new RuntimeException(e);
        }
   }
    // [1] 회원가입 SQL 처리
    public boolean signup(MemberDto memberDto ){
        try {
            String sql = "insert into member(mid,mpwd,mname,mphone)values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMpwd());
            ps.setString(3, memberDto.getMname());
            ps.setString(4, memberDto.getMphone());
            int count = ps.executeUpdate();
            if (count == 1) { return true;   }
        } catch (Exception e) {  System.out.println(e);    }
        return false;
    } // f end

    // [2] 로그인 SQL 처리
    public boolean login( String mid , String mpwd){
        try {
            String sql = "select * from member where mid = ? and mpwd = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mid);
            ps.setString(2, mpwd);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) { System.out.println(e); }
       return false;
    }
}

















