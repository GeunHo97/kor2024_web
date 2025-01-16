package day56;

public class RestDto {
    // + 멤버변수
    private String key1;
    private String key2;
    // + 생성자
    public RestDto(){}
    public RestDto(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }
    // + 메소드 , toString() , Getter and Setter
    @Override
    public String toString() {
        return "RestDto{" +
                "key1='" + key1 + '\'' +
                ", key2='" + key2 + '\'' +
                '}';
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }
} // class end
