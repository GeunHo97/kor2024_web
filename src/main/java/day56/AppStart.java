package day56;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 현재 클래스의 어노테이션(스티커) 주입한다.
// 1. Spring web 에 필요한 설정을 자동으로 한다. web server
// 2. 현재 클래스 의 패키지와 하위 패키지에서 모든 컴포넌트를 읽고 등록한다. * 상위 패키지는 읽지 못한다. *
// 3. 현재 클래스 의 패키지와 하위 패키지에서 모든 설정 파일을 읽고 등록한다.
// 주의할점 :
//          1. 프로젝트내 spring web server 동일한 port내 1개만 실행 가능하다.
//          2. 'AppStart' 클래스는 모든 컴포넌트(클래스)보다 상위 패키지에 존재 해야한다.
@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run( AppStart.class );
    }
}
