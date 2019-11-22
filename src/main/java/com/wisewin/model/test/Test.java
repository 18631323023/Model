package com.wisewin.model.test;


import com.wisewin.model.util.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Shibo on 17/1/5.
 */
public class Test {


    public static void main2(String[] args) {

      /*  Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1=new SimpleDateFormat("mm");
        String a=sdf.format(date);
        String b=sdf.format(date);
        System.out.println(b);
        System.out.println(a);*/
        Calendar c = Calendar.getInstance();
        int hour=c.get(Calendar.HOUR_OF_DAY);
        Date date=new Date();
        if (hour < 6) {
            //开始时间-1天 加上 06:00:00
            date = getDayBefore(date, 1);
        }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String s1 = sdf.format(date);
            String s2 = s1 + " 06:00:00";

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date1=null;
            try {
                date1 = sdf1.parse(s2);


            } catch (ParseException e) {
                e.printStackTrace();
            }


        System.out.println(date1);




 /* *//*      double f = 111231.4585;
        BigDecimal bg = new BigDecimal(f);
        double f1 = bg.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);*//*
        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.println(df.format(0.1234));
      int a=1;
      int b=22;
      double c=(double)a/b;
        BigDecimal bg = new BigDecimal(c);
        double f1 = bg.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);
        System.out.println(df.format(f1));
    }*/
      /*  JSONObject result=new JSONObject();
        result.put("1",null);
        result.put("2",2);
        result.put("3",3);
        System.out.println(result.toString());
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("MM");
        SimpleDateFormat sdf1=new SimpleDateFormat("dd");
        String s1=sdf1.format(date);
        String s=sdf.format(date);
        System.out.println(s+"月"+s1+"日");*/



    }
    public static Date getDayBefore(Date date,int i) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.add(c.DATE,-i); //把日期往后增加i天,整数  往后推,负数往前移动
        return c.getTime();
    }
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String nowStr = dateFormat.format(new Date());

        String endStr = nowStr.substring(0,nowStr.indexOf(" ")) + " 23:59:59";

        System.out.println("相差的秒数："+((dateFormat.parse(endStr).getTime() - dateFormat.parse(nowStr).getTime()) / 1000));
    }

}
