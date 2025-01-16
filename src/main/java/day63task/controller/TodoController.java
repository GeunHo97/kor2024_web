package day63task.controller;

import day62.model.entity.BoardEntity;
import day63.model.dto.MemberDto;
import day63task.model.dto.TodoDto;

import day63task.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;
    // 1.할일등록
    @PostMapping("/todo/regist")
    public boolean regist(@RequestBody TodoDto todoDto){
        // * 관례적으로 controller 에서는 엔티티를 사용하지 않는다.

        return todoService.regist(todoDto);
    }
    // 2.할일전체조회
    @GetMapping("/todo/printall")
    public List<TodoDto> printall(){
        return todoService.printall();
    }

    // 3.할일상태수정
    @PutMapping("/todo/update")
    public boolean update(@RequestBody TodoDto todoDto){
        return todoService.update(todoDto);
    }


    // D : 게시물 삭제
    // 4.할일삭제
    @DeleteMapping("/todo/delete")
    public boolean delete( @RequestParam int tno){
        return todoService.delete(tno);
    }
}
