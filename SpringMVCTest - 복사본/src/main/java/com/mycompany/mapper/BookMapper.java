package com.mycompany.mapper;

import org.apache.ibatis.annotations.Insert;

import com.mycompany.vo.Book;

//어노테이션은 나중에 문제가 되니 간단 실습정도로만 하고 나중에는 쓰지 말도록하자 

public interface BookMapper {
	@Insert("insert into books (title, author, image) values (#{title}, #{author}, #{image})")
	public boolean create(Book book);

}