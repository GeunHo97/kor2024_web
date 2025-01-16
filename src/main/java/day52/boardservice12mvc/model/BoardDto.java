package day52.boardservice12mvc.model;

public class BoardDto {
    // 1. 멤버변수
    private String title;
    private String content;
    private int pwd;
    // 2. 생성자
    public BoardDto(){}
    public BoardDto(String title, String content, int pwd) {
        this.title = title;
        this.content = content;
        this.pwd = pwd;
    }
    // 3. 메소드 , getter/setter , toString
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", pwd=" + pwd +
                '}';
    }
} // class end
