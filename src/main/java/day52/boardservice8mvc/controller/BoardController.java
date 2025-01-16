package day52.boardservice8mvc.controller;

import day52.boardservice8mvc.model.BoardDao;
import day52.boardservice8mvc.model.BoardDto;

import java.util.ArrayList;

public class BoardController {
    // + 싱글톤 만들기 3단계
    private BoardController(){}
    private static BoardController instance = new BoardController();
    public static BoardController getInstance(){return instance;}

    // 1. 게시물 쓰기 제어 함수
    public boolean write(BoardDto boardDto ){
        return BoardDao.getInstance().write( boardDto );
    }

    // 2. 게시물 출력 제어 함수
    public ArrayList<BoardDto> findAll( ){
        return BoardDao.getInstance().findAll();
    }

} // class end
