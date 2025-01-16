package day56;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // 해당 클래스에 어노테이션[ 미리 코드가 담긴 스티커] 주입
public class RestController1 {

    @GetMapping("/day56/rest1") // [GET] http://localhost:8080/day56/rest1
    @ResponseBody
    public String getRest1( ){
        return "안녕 클라이언트 , 나는 GET Rest1 이야.";
    } // F END

    @PostMapping("/day56/rest1") // [POST] http://localhost:8080/day56/rest1
    @ResponseBody
    public String postRest1(){
        return "안녕 클라이언트 , 나는 POST Rest1 이야.";
    } // F END

    @PutMapping("/day56/rest1") // [PUT] http://localhost:8080/day56/rest1
    @ResponseBody
    public String putRest1(){
        return "안녕 클라이언트 , 나는 PUT Rest1 이야.";
    }

    @DeleteMapping("/day56/rest1") // [DELETE] http://localhost:8080/day56/rest1
    @ResponseBody
    public String deleteRest1(){
        return "안녕 클라이언트 , 나는 DELETE Rest1 이야.";
    }

} // CLASS END




