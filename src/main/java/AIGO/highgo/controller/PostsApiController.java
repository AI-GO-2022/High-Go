package AIGO.highgo.web;


import AIGO.highgo.service.posts.PostsService;
import AIGO.highgo.web.dto.PostsResponseDto;
import AIGO.highgo.web.dto.PostsSaveRequestDto;
import AIGO.highgo.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController //->json을 반환하는 컨트롤러로 만들어줌.
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}

// postmapping, putmapping, getmapping 의 기능? 차이점?
// controller에서 dto를 받아와서 service에서 entity 업데이트.->repository에 반영