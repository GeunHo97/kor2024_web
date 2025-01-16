package day64.JPA연관관계.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@Builder@ToString
@Table(name = "member")
public class MemberEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;

    @Column(columnDefinition = "varchar(50)",unique = true)
    private String mid;

    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String mpwd;

    @Column(columnDefinition = "varchar(30)", nullable = false)
    private String mname;

    @Column(columnDefinition = "varchar(50)", unique = true , nullable = false)
    private String memail;

    // 양방향 : 데이터베이스에서 지원하지 않지만 , ORM 에서 지원한다.
    @OneToMany(mappedBy = "memberEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY) // 하나(PK) 다수(FK)에게 ,  1 : M ,
    // mappedBy ="단방향의멤버변수" : 자바에서만 양방향을 사용하겠다는 설정
    @ToString.Exclude //빌더패턴 사용시 자동으로 초기값을 주입하는 어노테이션
    private List<BoardEntity> boardEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "memberEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @ToString.Exclude @Builder.Default
    private List<ReplyEntity> replyEntityList = new ArrayList<>();
}
