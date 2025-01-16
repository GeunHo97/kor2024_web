package day61;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// ============== 클래스 ============== //
@Entity // 이 클래스가 JPA 엔티티로 표시
public class BoardEntity {
    // 1. 멤버변수
    @Id
    private int bno;            // - 게시물번호
    @Column
    private String btitle;      // - 게시물제목
    @Column
    private String bcontent;    // - 게시물내용
    // 2. 생성자
    public BoardEntity( int bno , String btitle , String bcontent ){
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
    }
    // 3. 메소드
} // class end

// ============= 클래스 end =============== //

