package day52.boardservice12mvc;

import day52.boardservice8mvc.view.BoardView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        // 싱글톤 호출하고 싱글톤 내부 함수 호출
        // BoardView.getInstance().run();
        // * 콘솔 뷰 가 아닌 스프링 실행 코드
        SpringApplication.run( AppStart.class );
    } // main end
} // class end
