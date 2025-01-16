package day61task.controller;


import day61task.model.Entity.MemberEntity;
import day61task.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired // 스프링 컨테이너(메모리) 에 등록된 빈(객체)을 가져온다.
    private MemberService memberService;

    @PostMapping("/signup")
    public boolean signup(
            @RequestParam String id ,
            @RequestParam String pw ){
        boolean result = memberService.signup( id , pw );
        return  result;
    } //

    @GetMapping("/findAll")
    public List<MemberEntity> findAll(){
        List<MemberEntity> list = memberService.findAll();
        return list;
    } //

} //
