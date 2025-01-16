package day63.service;

import day63.model.dto.MemberDto;
import day63.model.entity.MemberEntity;
import day63.model.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    @Autowired private MemberRepository memberRepository;

    //1. 회원가입
    public boolean signup(MemberDto memberDto){

        // 1. 저장할 DTO 를 entity로 변환한다.
        MemberEntity memberEntity = memberDto.toEntity();
        // 2. 변환된 entity를 save한다.
        // 3. save 결과 entity 반환 받는다.
        MemberEntity saveEntity = memberRepository.save(memberEntity);
        // 4. 회원번호(auto_increament) 를 확인하여 엔티티가 잘 생성 했는지 확인
        if (saveEntity.getMno() > 0){
            return true;
        }else {
            return true;
        }
    }
    //2. 모든 회원목록 조회
    public List<MemberDto> infolist(){
        // 1. 모든 엔티티를 조회한다.
        List<MemberEntity> entityList = memberRepository.findAll();
        // 2. 모든 엔티티를 DTO로 변환한다.
        List<MemberDto> list = new ArrayList<>();
        for (int index = 0; index <= entityList.size() - 1; index++) {
            MemberEntity entity = entityList.get(index);
            list.add(entity.toDto());
        }
        return list;
    }

}// class end
