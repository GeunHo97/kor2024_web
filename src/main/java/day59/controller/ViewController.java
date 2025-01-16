package day59.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // 스프링 컨테이너(메모리) 에 빈(인스턴스) 주입
public class ViewController {
    // + 템플릿 파일들을 (VIEW) 반환하는 메소드들을 모아둔 클래스

    // 1. 메인페이지 반환하는 get매핑 함수           // http://localhost:8080/
    @GetMapping("")
    public String index(){
        return "/day59/index.html";
    }

    // 2. 회원가입 페이지 반환 하는 get매핑 함수   //http://localhost:8080/signup
    @GetMapping("/signup")
    public String signup(){
        return "/day59/signup.html";
    }

    // 3. 로그인 페이지 반환 하는 get매핌함수     // http://localhost:8080/login
    @GetMapping("/login")
    public String login(){
        return "/day59/login.html";
    }

}
