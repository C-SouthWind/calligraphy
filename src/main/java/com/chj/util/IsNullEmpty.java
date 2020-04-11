package com.chj.util;


import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/4/11 10:18
 * @params :
 */
public class IsNullEmpty {
    public static Boolean listIsNullEmpty(List<?> list){
        return null != list && !list.isEmpty();
    }
    public static Boolean stringIsNullEmpty(String s){
        return null != s && !"".equals(s);
    }
    public static Boolean intIsNullEmpty(Integer integer){
        return null != integer;
    }
    public static Boolean objectIsNullEmpty(Object o){return null !=o;}
}
