package AIGO.highgo.controller.dto;

import AIGO.highgo.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
DTO(Data Transfer Object)는 데이터 전송(이동) 객체라는 의미를 가지고 있다.
DB의 데이터를 Service나 Controller 등으로 보낼 때 사용하는 객체


Entity 클래스와 거의 유사한 형태지만,
"절대로 Entity 클래스를 Request/Response 클래스로 사용해서는 안 된다"
why? Entity 클래스 -> 데이터베이스와 맞닿은 핵심 클래스.
                    Entity 클래스를 기준으로 테이블이 생성되고, 스키마가 변경된다. 너무 큰 변경이 됨.
                    Dto ->view를 위한 클래스 ->자주변경.
                    View Layer(Dto)/DB Layer(Entity(domain)) 역할 분리!
 */


@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
