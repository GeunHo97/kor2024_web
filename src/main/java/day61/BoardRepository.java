package day61;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // SPRING MVC패턴 에서 Repository 담당 역할
public interface BoardRepository
        extends JpaRepository< BoardEntity , Integer > {
    // 해당하는 인터페이스는 BoardEntity 클래스 조작할 예정이고.
    // pk필드는 bno의 타입인 int --> Integer
}
