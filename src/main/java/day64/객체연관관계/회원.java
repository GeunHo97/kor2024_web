package day64.객체연관관계;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor@AllArgsConstructor
@Setter@Getter@Builder@ToString
public class 회원 {
    private int 회원번호;
    private String 회원아이디;
    private String 회원이름;
    // 양방향 : 회원객체는 여러개 게시물을 작성할 수 있으므로 Lsit타입
    @Builder.Default // 빌더패턴 사용시 초기값이 대입되지 않는 멤버변수에 대해서는 초기값을 자동으로 대입한다.
    @ToString.Exclude
    List<게시물> 작성한게시물 = new ArrayList<>();
    @ToString.Exclude
    @Builder.Default
    List<댓글> 작성한댓글 = new ArrayList<>();
    // 양방향 주의할점 : 두 객체 서로 참조할때는 순환참조(무한호출) 주의해야한다.
    // 해결방안1 : ToString 메소드를 사용하지 않는다.
    // 해결방안2 : 참조 멤버변수만 ToString 메소드를 사용하지 않는다. @ToString.Exclude
    // ToString() 메소드란? Object클래스의 메소드로써 객체의 멤버변수 값 을 반환 함수
        // ToString() 사용하지 않으면 객체 참조시 주소값이 반환 ( 기본값 )
}
