package day57task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // * MVC관련 컴포넌트(클래스)들을 스캔(찾아)해서 등록 처리한다.
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run( AppStart.class);
    }
}
