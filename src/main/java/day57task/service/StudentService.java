package day57task.service;

import day57task.controller.StudentController;
import day57task.model.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // + 객체(빈) 생성해서 메모리(SPRING컨테이너) 등록(주입)한다.
// 이 클래스의 객체(빈) 는 너가(SPRING) 관리 해줘 : IOC
// + 싱글톤 필요가 없어졌다.
public class StudentService {
    // 너(Spring)가 만든 빈(객체/인스턴스)를 주세요. @Autowired
    @Autowired private StudentDao studentDao;
}
