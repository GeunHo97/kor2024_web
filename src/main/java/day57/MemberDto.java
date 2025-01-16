package day57;

import lombok.*;

@NoArgsConstructor // 디폴트 생성자 코드를 주입(넣어준다)
@AllArgsConstructor // 모든 매개변수의 생성자 코드를 주입
@Getter // 멤버변수의 getter 메소드
@Setter // 멤버변수의 setter 메소드
@ToString // toString 메소드
@Builder // 빌더 패턴 메소드 지원
public class MemberDto {
    private String id;
    private String name;
}
