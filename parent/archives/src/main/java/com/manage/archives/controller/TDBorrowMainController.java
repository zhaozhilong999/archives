package com.manage.archives.controller;

import com.manage.archives.entity.TDBorrowMain;
import com.manage.archives.mapper.TDBorrowMainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TDBorrowMainController {

    @Autowired
    private TDBorrowMainMapper tdBorrowMainMapper;
    @GetMapping(value = "borrow")
    public TDBorrowMain getOne(){
        TDBorrowMain one = tdBorrowMainMapper.getOne("1039649434221235128");
        return one;
    }
}
