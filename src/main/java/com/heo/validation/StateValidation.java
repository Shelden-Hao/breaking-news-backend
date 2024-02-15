package com.heo.validation;

import com.heo.anno.State;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * 自定义接口的校验规则类
 * State 给哪个注解提供校验规则
 * String 校验的数据类型
 */
public class StateValidation implements ConstraintValidator<State, String> {
    /**
     *
     * @param s 将来要校验的数据
     * @param constraintValidatorContext
     * @return 返回 false 校验不通过，true 则通过
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        // 提供校验规则
        if (s == null) {
            return false;
        }
        if (s.equals("已发布") || s.equals("草稿")) {
            return true;
        }
        return false;
    }
}
