package com.yehong.library.controller;

import com.yehong.library.Service.ListAllBookService;
import com.yehong.library.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/thymeleaf")//网址后面的目录
public class ListAllBookController {

    private final ListAllBookService listAllBookService;

    @GetMapping("bookList")//网址后面的目录
    @ResponseBody
    public ModelAndView bookList() {
        List<Book> bookList = listAllBookService.selectAllBook();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test2");
        mv.addObject("bookList", bookList);
        return mv;
    }

    @GetMapping("hello")
    @ResponseBody
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("abc", "cba");
        return mv;
    }


}
