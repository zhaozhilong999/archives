package com.manage.archives.mapper;

import com.manage.archives.entity.TDBorrowMain;
import org.apache.ibatis.annotations.Mapper;


public interface TDBorrowMainMapper {

     TDBorrowMain getOne(String borrowMainId);
}
