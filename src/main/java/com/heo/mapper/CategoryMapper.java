package com.heo.mapper;

import com.heo.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Insert("insert into category(category_name,category_alias,create_user,create_time,update_time) "+
            "value(#{categoryName},#{categoryAlias},#{createUser},#{createTime},#{updateTime})")
    void add(Category category);
    @Select("select * from category where create_user=#{userId}")
    List<Category> list(Integer userId);
    @Select("select * from category where id=#{id}")
    Category findById(Integer id);

    @Update("update category set category_name=#{categoryName},category_alias=#{categoryAlias},update_time=#{updateTime} where id=#{id}")
    void update(Category category);

    @Delete("delete from category where id=#{id}")
    void delete(Integer id);
}
