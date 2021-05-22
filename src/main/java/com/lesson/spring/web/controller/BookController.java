package com.lesson.spring.web.controller;

import com.lesson.dto.BookInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * BookController
 *
 * @author Alicia
 * @description
 * @date 2021/5/23
 */
@RestController
public class BookController {

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<BookInfo> query(@RequestParam(value = "name", defaultValue = "hello spring mvc") String bookName,
                                Long categoryId){
        System.out.println(bookName);
        List<BookInfo> bookInfos = new ArrayList<>();
        bookInfos.add(new BookInfo());
        bookInfos.add(new BookInfo());
        bookInfos.add(new BookInfo());
        return bookInfos;
    }
}
