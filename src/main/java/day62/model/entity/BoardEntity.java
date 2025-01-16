package day62.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//1. 해당 클래스를 DB의 테이블과 매핑 하겠다는 어노테이션
@Table(name = "board")
//1. 해당 엔티티와 매핑된 테이블의 이름 정의한다.
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
    @Id //1. 해당 필드/속성의 제약조건에 primary key 정의하는 어노테이션.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 1, mysql의 auto_increament의 제약조건과 동일한 어노테이션
    private int bno;
    @Column(columnDefinition = "varchar(100)") // 1. 해당 필드/속성의 타입,제약조건 정의하는 어노테이션
    private String btitle;

    @Column(columnDefinition = "longtext", nullable = false)
    private String bcontent;

    @Column(columnDefinition = "varchar(30)",nullable = false)
    private String bwriter;

    @Column(columnDefinition = "varchar(30)",nullable = false)
    private String bpwd;
}
