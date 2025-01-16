package day52.boardservice8mvc.view;
import day52.boardservice8mvc.controller.BoardController;
import day52.boardservice8mvc.model.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // + 싱글톤 만들기 3단계, 싱글톤이란? 프로그램내 1개만 존재 가능한 객체 디자인 패턴
    private BoardView(){}
    private static BoardView instance = new BoardView();
    public  static BoardView getInstance(){  return instance; }
    // + 입력 객체
    private Scanner scan = new Scanner(System.in);
    // 0. 메인 페이지 함수
    public void run(){
        while (true){
            System.out.print("1.등록 2.출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){ write();}
            else if( choose == 2 ){ findAll(); }
        } // w end
    } // f end
    // 1. 게시물 쓰기 페이지 함수
    public void write( ){  System.out.println("[게시물 쓰기 페이지]");
        System.out.print("title : "); String title = scan.next();
        System.out.print("content : "); String content = scan.next();
        System.out.print("password : "); int pwd = scan.nextInt();
        BoardDto boardDto = new BoardDto( title,content,pwd);
        boolean result = BoardController.getInstance().write( boardDto );
        if( result ){  System.out.println("write success"); }
        else{  System.out.println("write fail");  }
    } // f end

    // 2. 게시물 출력 페이지 함수
    public void findAll( ){ System.out.println("[게시물 출력 페이지]");
        ArrayList<BoardDto> result = BoardController.getInstance().findAll();
        for( int index = 0 ; index <= result.size() -1 ; index++ ){
            System.out.print("제목 : " + result.get( index ).getTitle() );
            System.out.print("내용 : " + result.get( index ).getContent() );
            System.out.println();
        }
    } // f end

} // class end










