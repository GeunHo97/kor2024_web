package day64.JPA연관관계.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "Reply")
public class ReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rno;

    @Column(columnDefinition = "varchar(255)",nullable = false)
    private String rcontent;

    // 단방향 FK : 게시물(pk) --- 댓글[fk]
    @ManyToOne
    @JoinColumn(name = "bno")
    private BoardEntity boardEntity;

    // 단방향 FK : 회원(pk) --- 댓글[fk]
    @ManyToOne
    @JoinColumn(name = "mno")
    private MemberEntity memberEntity;
}
