

package com.zhongger.zmail.admin.modules.app.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 *
 * @author Mark sunlightcs@bytedance.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
