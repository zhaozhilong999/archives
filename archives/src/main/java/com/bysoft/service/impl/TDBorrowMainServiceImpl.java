package com.bysoft.service.impl;

import com.bysoft.entity.TDBorrowMain;
import com.bysoft.mapper.TDBorrowMainMapper;
import com.bysoft.service.TDBorrowMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TDBorrowMainServiceImpl implements TDBorrowMainService {

    @Autowired
    private TDBorrowMainMapper tdBorrowMainMapper;
    public TDBorrowMain getOne(String borrowMainId) {
        return tdBorrowMainMapper.getOne(borrowMainId);
    }
}
