package kr.co.sboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import kr.co.sboard.dto.ArticleDTO;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Article")
public class ArticleEntity {

    private int no;
    private int parent;
    private int comment;
    private String cate;
    private String title;
    private String content;
    private int file;
    private int hit;
    private String writer;
    private String regip;
    private LocalDateTime rdate;

    public ArticleDTO toDTO() {
        return ArticleDTO.builder()
                .no(no)
                .parent(parent)
                .comment(comment)
                .cate(cate)
                .title(title)
                .content(content)
                .file(file)
                .hit(hit)
                .writer(writer)
                .regip(regip)
                .rdate(rdate)
                .build();
    }

}
