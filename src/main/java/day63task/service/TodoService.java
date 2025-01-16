package day63task.service;

import day62.model.entity.BoardEntity;
import day63.model.dto.MemberDto;
import day63.model.entity.MemberEntity;
import day63task.model.dto.TodoDto;
import day63task.model.entity.TodoEntity;
import day63task.model.repository.TodoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;
    // 1.할일등록
    @Transactional
    public boolean regist( TodoDto todoDto){
        // * 관례적으로 controller 에서는 엔티티를 사용하지 않는다.
// 1. 저장할 DTO 를 entity로 변환한다.
        TodoEntity todoEntity = todoDto.toEntity();
        // 2. 변환된 entity를 save한다.
        // 3. save 결과 entity 반환 받는다.
        TodoEntity saveEntity = todoRepository.save(todoEntity);
        // 4. 회원번호(auto_increament) 를 확인하여 엔티티가 잘 생성 했는지 확인
        if (saveEntity.getTno() > 0){
            return true;
        }else {
            return true;
        }
    }
    // 2.할일전체조회
    @Transactional
    public List<TodoDto> printall(){
        // 1. 모든 엔티티를 조회한다.
        List<TodoEntity> entityList = todoRepository.findAll();
        // 2. 모든 엔티티를 DTO로 변환한다.
        List<TodoDto> list = new ArrayList<>();
        for (int index = 0; index <= entityList.size() - 1; index++) {
            TodoEntity entity = entityList.get(index);
            list.add(entity.toDto());
        }
        return list;
    }

    //3.할일상태수정
    @Transactional
    public boolean update(TodoDto todoDto){
       TodoEntity updateEntity = todoRepository.findById(todoDto.getTno()).get();
       updateEntity.setTstatus(!updateEntity.isTstatus());
        return true;
    }


    // D : 게시물 삭제
   @Transactional
    public boolean delete(  int tno){
        todoRepository.findById(tno);
        return true;
    }
}
