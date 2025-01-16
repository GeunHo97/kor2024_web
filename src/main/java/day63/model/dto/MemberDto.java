package day63.model.dto;

import day63.model.entity.MemberEntity;
import lombok.*;

@Getter@Setter@ToString@Builder
@NoArgsConstructor@AllArgsConstructor
public class MemberDto {

    private int mno;
    private String mid;
    private String mpwd;
    private String mname;
    private String mphone;
    private String cdate; // 회원가입 날짜/시간
    private String udate; // 회원 정보 수정 날짜/시간

    // Dto --> entity
    public MemberEntity toEntity(){
        // 빌더퍁턴 : 인스턴스를 생성자를 이용하여 만들었다면 규칙이 존재한다. 유연한 인스턴스 생성하는 방법 제시.
        //        클래스명.builder().멤버변수명(새로운값).멤버변수명(새로운값).build();
        return MemberEntity.builder()
                .mno(this.mno)
                .mid(this.mid)
                .mpwd(this.mpwd)
                .mname(this.mname)
                .mphone(this.mphone)
                .build();
    }

}
