package day57task.model.dto;

import lombok.*;

@NoArgsConstructor      // 디폴트 생성자 주입
@AllArgsConstructor     // 모든매개변수 생성자 주입
@Getter     // 각 멤버변수의 GETTER 메소드 주입
@Setter     // 각 멤버변수의 SETTER 메소드 주입
@ToString   // 참조(주소)값 대신 멤버변수 호출 메소드 주입
@Builder    // 생성자 대신 인스턴스(객체) 만드는 빌더 패턴 주입
public class StudentDto {
    private int sno;
    private String sname;
    private int skor;
    private int smath;
    private int seng;
}
