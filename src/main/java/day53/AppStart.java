package day53;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// [1] 스프링 서버를 실행하기위한 클래스
@SpringBootApplication // 톰캣(웹) 서버를 세팅 해주는 어노테이션
public class AppStart {
    public static void main(String[] args) {
        // 스프링 서버가 실행되면서 톰캣(웹)서버도 같이 실행된다.
        SpringApplication.run( AppStart.class );
    }
} // class end
// [2] 외부로부터 HTTP 요청를 매핑(연결) 하기 위한 컨트롤러 클래스
@RestController // 현재 클래스의 HTTP 컨트롤러 클래스임을 지정한다.
class day53Controller{
    @PostMapping("/day53")      // HTTP [POST] http://localhost:8080/day52 주소 선언/만들기
    public String postMethod(){
        System.err.println("day53Controller.postMethod"); // soutm
        return "Server Connect POST OK";
    }
    @GetMapping("/day53")       // HTTP [GET] http://localhost:8080/day52 주소 선언/만들기
    public String getMethod() {
        System.err.println("day53Controller.getMethod"); // sout
        return "Server connect GET OK";
    }
    @PutMapping("/day53")       // HTTP [PUT] http://localhost:8080/day52 주소 선언/만들기
    public String putMethod(){
        System.err.println("day53Controller.putMethod"); // soutm
        return "Server connect PUT OK";
    }
    @DeleteMapping("/day53")    // HTTP [DELETE] http://localhost:8080/day52 주소 선언/만들기
    public String deleteMethod(){
        System.err.println("day53Controller.deleteMethod"); // soutm
        return "Server connect DELETE OK";
    }
}








