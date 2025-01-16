package day62;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//1. 내장 서버(톰캣) 실행
//2. 현재 프로젝트의 MVC패턴 관련 클래스들의 찾는다 @ComponentScan
    // 컴포넌트스캔이란? 스프링이 알고있는 클래스들을 찾는 과정
    // 주요 MVC 컴포넌트? @RestController @Controller @Service @Repository @Component 등등
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
    }
}
