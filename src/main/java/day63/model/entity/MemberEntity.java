package day63.model.entity;

import day63.model.dto.MemberDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Member")
@Getter@Setter@ToString@Builder@NoArgsConstructor@AllArgsConstructor
public class MemberEntity extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno; // 회원번호

    @Column(columnDefinition = "varchar(30)", nullable = false,unique = true)
    private String mid;//회원id

    @Column(columnDefinition = "varchar(20)",nullable = false)
    private String mpwd;

    @Column(columnDefinition = "varchar(10)",nullable = false)
    private String mname;

    @Column(columnDefinition = "varchar(13)",nullable = false,unique = true)
    private String mphone;


    // entity --> Dto 변환 메소드
    public MemberDto toDto(){
        
//        클래스명.builder().멤버변수명(새로운값).멤버변수명(새로운값).build();
        return MemberDto.builder() // 빌더패턴 시작점
                .mno(this.mno)
                .mid(this.mid)
                .mname(this.mname)
                .mphone(this.mphone)
                .build(); // 빌더패턴의 끝마침.
    }

}
