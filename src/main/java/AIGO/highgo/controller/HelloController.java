package AIGO.highgo.controller;

import AIGO.highgo.controller.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // -> 컨트롤러를 json을 반환하는 컨트롤러로 만들어줌. 예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한 번에 사용할 수 있도록 해줌.
public class HelloController {
    @GetMapping("/hello")   // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줌. -> /hello로 요청이 오면 문자열 hello를 반환하는 기능
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {  //@RequestParam -> 외부(test)에서 API로 넘긴 파라미터를 가져오는 어노테이션
        return new HelloResponseDto(name, amount);
    }

}
