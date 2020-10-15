package com.example.packagemanagerservice.permission;

import com.example.packagemanagerservice.MyPermissionActivity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 取消
 *
 * @Author: Jack Ou
 * @CreateDate: 2020/10/15 23:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/10/15 23:52
 * @UpdateRemark: 更新说明
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PermissionCancel {
    int requestCode() default MyPermissionActivity.PARAM_PERMSSION_CODE_DEFAULT;
}
