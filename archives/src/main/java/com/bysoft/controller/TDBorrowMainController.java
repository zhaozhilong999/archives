package com.bysoft.controller;

import com.bysoft.entity.TDBorrowMain;
import com.bysoft.service.TDBorrowMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TDBorrowMainController {

    @Autowired
    private TDBorrowMainService tdBorrowMainService;

    @GetMapping(value = "borrow")
    public TDBorrowMain getOne(){
        return tdBorrowMainService.getOne("1039649434221235128");
    }
}
