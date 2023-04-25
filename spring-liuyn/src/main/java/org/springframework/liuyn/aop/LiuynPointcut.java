package org.springframework.liuyn.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

public class LiuynPointcut implements Pointcut {
    @Override
    public ClassFilter getClassFilter() {
        return null;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return null;
    }
}
