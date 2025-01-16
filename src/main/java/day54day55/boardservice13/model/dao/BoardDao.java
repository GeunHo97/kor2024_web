package day54day55.boardservice13.model.dao;

import day54day55.boardservice13.model.dto.BoardDto;

import java.sql.*;
import java.util.ArrayList;

public class BoardDao {
    private Connection conn; // 연동 인터페이스
    // + 싱글톤
    private static BoardDao instance = new BoardDao();
    private BoardDao(){
        try{  // =========== DB 연동 ============ //
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mydb0102", "root" , "1234");
        } catch (Exception e) {   System.out.println(e);   }
    }
    public static BoardDao getInstance(){  return instance;  }

    // 1. 게시물 쓰기
    public boolean write(BoardDto boardDto ){
        try{
            // 1. SQL 작성한다.
            String sql ="insert into board( btitle , bcontent , bwriter , bpwd) values( ? , ? , ? , ? )";
            PreparedStatement ps = conn.prepareStatement( sql ); // 2. 작성한 SQL를 기재한다.
            ps.setString( 1 , boardDto.getBtitle() );   // 3. 기재된 SQL의  첫번째 ? 매개변수 값 대입.
            ps.setString( 2 , boardDto.getBcontent() ); // 3. 기재된 SQL의  두번째 ? 매개변수 값 대입.
            ps.setString( 3 , boardDto.getBwriter() );  // 3. 기재된 SQL의  세번째 ? 매개변수 값 대입.
            ps.setString( 4 , boardDto.getBpwd() );     // 3. 기재된 SQL의  네번째 ? 매개변수 값 대입.
            int count = ps.executeUpdate();             // 4. SQL 실행 => 실행된 결과 레코드 수 반환
            if( count == 1 ){ return  true; }           // 5. 삽입된 결과 레코드가 1개 이면 등록 성공 TRUE
        } catch (Exception e) {   System.out.println(e); }
        return false;   // 5. 등록 실패 FALSE
    }

    // 2. 게시물 전체 조회
    public ArrayList<BoardDto> findAll(){
        // * 여러개 레코드를 DTO로 만들어서 저장할 리스트 객체 선언.
        ArrayList<BoardDto> list = new ArrayList<>();
        try{
            String sql = "select * from board"; // 1. sql 작성한다.
            PreparedStatement ps = conn.prepareStatement( sql ); // 2. sql 기재한다.
            // 3. sql 실행하고 결과를 조작하는 ResultSet 인터페이스로 받는다.
            ResultSet rs = ps.executeQuery();
            // 4. 조회 결과의 레코드 하나씩 조회하기 .next() : 다음레코드 이동
            while ( rs.next() ){
                // 5. 현재 조회된 레코드를 DTO로 만들기
                BoardDto boardDto = new BoardDto(
                        // * 현재 조회중인 레코드의 특정 필드명의 값 반환.  rs.get타입("필드명")
                        rs.getInt("bno") , rs.getString("btitle"),
                        rs.getString("bcontent"), rs.getString("bdate"),
                        rs.getString("bwriter") , null // 패스워드는 보안상 조회시 제외
                );
                list.add( boardDto );  // 6. 만든 DTO에 ArrayList에 대입.
            } // w end 
        } catch (Exception e) {  System.out.println(e); }
        return list; // 7. 리스트 반환
    }

    // 3. 게시물 개별 조회
    public BoardDto findId( int bno ){
        try {
            String sql = "select * from board where bno = ? "; // (1) SQL 작성한다.
            PreparedStatement ps = conn.prepareStatement(sql); // (2) SQL 기재한다.
            ps.setInt(1, bno);// (3) 기재된 SQL의 매개변수를 대입한다.
            ResultSet rs = ps.executeQuery(); // (4) 기재된 SQL 실행하고 결과를 반환 받는다.
            if (rs.next()) {// (5) 실행결과에 따른 제어한다.
                BoardDto boardDto = new BoardDto(  // * 조회된 레코드를 DTO로 만든다.
                        rs.getInt("bno"), rs.getString("btitle"),
                        rs.getString("bcontent"), rs.getString("bdate"),
                        rs.getString("bwriter"), null);
                return boardDto;
            }
        }catch ( Exception e ){  System.out.println( e ); }
        return null;
    } // f end

    // 4. 게시물 수정
    public boolean update( BoardDto boardDto ){
        try {
            String sql = "update board set btitle = ? , bcontent = ? where bno = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setInt(3, boardDto.getBno());
            int count = ps.executeUpdate();
            if (count == 1) {  return true;  }
        }catch ( Exception e ){System.out.println( e ); }
        return false;
    } // f end

    // 5. 게시물 삭제
    public boolean delete( int bno ){
        try {
            String sql = "delete from board where bno = ? "; // (1) SQL 작성한다.
            PreparedStatement ps = conn.prepareStatement(sql); // (2) SQL 기재한다.
            ps.setInt(1, bno);// (3) 기재된 SQL의 매개변수 대입한다.
            int count = ps.executeUpdate();// (4) 기재된 SQL 실행하고 결과를 반환 받는다.
            if (count == 1) {
                return true;
            } // (5) 실행결과에 따른 제어한다.
        } catch (Exception e) { System.out.println( e ); }
        return false;
    } // f end

}










