package com.patterncat.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by piguanghua on 2016/12/23.
 */
public class TimeUtils {
    public static String getTime(){
        Date dt=new Date();
        SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd");
        return  matter1.format(dt) ;
    }
}
