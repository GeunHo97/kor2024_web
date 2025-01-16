package day63task.model.entity;

import day63.model.dto.MemberDto;
import day63task.model.dto.TodoDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Todo")
public class TodoEntity extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tno;

    @Column(columnDefinition = "longtext", nullable = false)
    private String tcontent;//회원id

    @Column(columnDefinition = "boolean")
    private boolean tstatus;


    // entity --> Dto 변환 메소드
    public TodoDto toDto(){

//        클래스명.builder().멤버변수명(새로운값).멤버변수명(새로운값).build();
        return TodoDto.builder() // 빌더패턴 시작점
                .tno(this.tno)
                .tcontent(this.tcontent)
                .tstatus(this.tstatus)
                .build(); // 빌더패턴의 끝마침.
    }
}
