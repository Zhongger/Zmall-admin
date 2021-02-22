
package com.zhongger.zmail.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author Mark sunlightcs@bytedance.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}
