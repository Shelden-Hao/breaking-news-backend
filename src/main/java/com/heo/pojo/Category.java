package com.heo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.groups.Default;
import lombok.Builder;
import lombok.Data;
import org.apache.ibatis.annotations.Update;

import javax.xml.crypto.dsig.spec.XPathType;
import java.time.LocalDateTime;
@Data
public class Category {
    @NotNull(groups = Update.class)
    private Integer id;//主键ID
    @NotEmpty
    private String categoryName;//分类名称
    // @NotEmpty(groups = {Add.class, Update.class})
    @NotEmpty
    private String categoryAlias;//分类别名
    private Integer createUser;//创建人ID
    @JsonFormat(pattern = "yyyy-MM-dd MM:mm:ss")
    private LocalDateTime createTime;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd MM:mm:ss")
    private LocalDateTime updateTime;//更新时间
    public interface Add extends Default {

    }

    public interface Update extends Default {

    }

}

