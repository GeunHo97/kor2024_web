package day54day55.boardservice13;

// ================= 콘솔 ==================== //
//public class AppStart {
//    public static void main(String[] args) {
//        BoardView.getInstance().mainPage();
//    }
//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// ================= 웹 ==================== //
@SpringBootApplication // 스프링 웹 기본 세팅 주입 , 웹 서버 실행
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run( AppStart.class );
    }
}

















