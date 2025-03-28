package com.heo.anno;

import com.heo.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented  // 元注解  抽取 State 到帮助文档内
@Constraint(
        validatedBy = {StateValidation.class}  // 指定校验规则的类
)
@Target({FIELD})  // 元注解 表明注解使用的场合 FIELD 表示 使用在属性上
@Retention(RUNTIME)  // 元注解 注解在哪个阶段会被保留
public @interface State {
    // 提供校验失败后的提示信息
    String message() default "state参数的值只能是已发布或者草稿";
    // 指定分组
    Class<?>[] groups() default {};
    // 负载 注解的附加信息
    Class<? extends Payload>[] payload() default {};
}
