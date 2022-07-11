package AIGO.highgo.controller;

import AIGO.highgo.config.auth.LoginUser;
import AIGO.highgo.config.auth.dto.SessionUser;
import AIGO.highgo.controller.dto.PostsResponseDto;
import AIGO.highgo.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
@Slf4j
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;



    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        log.info("user - returned");
        model.addAttribute("posts", postsService.findAllDesc());
        if(user != null) model.addAttribute("userName", user.getName());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }

//    @Slf4j
//    public class Slf4jSample {
//        public static void main(String[] args) {
//            log.info("---------- Log 테스트 ---------");
//        }
//    }



}
