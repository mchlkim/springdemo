package com.example.demo.controller;

import com.example.demo.dto.PostRequestDto;
import com.example.demo.dto.PutReqeustDto;
import org.springframework.web.bind.annotation.*;

@RestController // 해당 Class는 REST API를 처리하는 Controller
@RequestMapping("/api") // Requset Mapping URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello";
    }

    // 모든 HTTP Method 동작되기 떄문에 method 값을 지정하여 사용 (현재는 이와 같이 사용하지 않고 @GetMapping 어노테이션 사용
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}
    @GetMapping(path = "/path-variable/{id}")
    public String pathVariable(@PathVariable(name = "id") String pathName) {
        System.out.println("path-variable : %s");
        return pathName;
    }

    //RequestBody 어노테이션을 사용하여 JSON Parsing
    // DTO를 통해서 값을 받아온다,
    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto reqeustData) {
        System.out.println(reqeustData);

    }

    @PutMapping("/put/{userId}")
    public PutReqeustDto put(@RequestBody PutReqeustDto requestDto, @PathVariable(name = "userId") Long id) {
        System.out.println(id);
        return requestDto;
    }

    // Parameter에 account 값 추가 필요
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable Long userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);

        // delete가 완료되면 HTTP Status Code 200 반환
    }
}
