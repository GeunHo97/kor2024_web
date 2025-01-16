package day63task.model.dto;

import day63.model.entity.MemberEntity;
import day63task.model.entity.TodoEntity;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private int tno;
    private String tcontent;
    private boolean tstatus;
    private String cdate;
    private String udate;
    // Dto --> entity
    public TodoEntity toEntity(){
        // 빌더퍁턴 : 인스턴스를 생성자를 이용하여 만들었다면 규칙이 존재한다. 유연한 인스턴스 생성하는 방법 제시.
        //        클래스명.builder().멤버변수명(새로운값).멤버변수명(새로운값).build();
        return TodoEntity.builder()
                .tno(this.tno)
                .tcontent(this.tcontent)
                .tstatus(this.tstatus)
                .build();
    }

}
