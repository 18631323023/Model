package com.wisewin.model.service;

import com.wisewin.model.dao.TestDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static java.lang.Math.PI;
import static java.lang.Math.atan;

/**
 * Created by Administrator on 2018/2/28.
 */
@Service("TestService")
@Transactional
public class TestService {
    @Resource
    private TestDAO testDAO;




   public void test() {
         testDAO.test();
    }

    /*******************************************************************************************
     *函数功能 ： 输入两条直线（每条直线以斜率和截距确定），返回两直线夹角，0为弧度，1为角度
     *输入参数 ： line_1_k为一条直线斜率，line_2_k为另一条直线斜率，aaa为0则为弧度，反之则为角度
     *返 回 值 ： float型弧度或者角度,有正负，为直线2相对于直线1的角度
     *编写时间 ： 2018.8.5
     *作    者 ： 毛哥
     ********************************************************************************************/
    public static double get_lines_arctan(double line_1_k, double line_2_k, int aaa)
    {
        if (aaa == 0)
        {
            double tan_k = 0; //直线夹角正切值
            double lines_arctan;//直线斜率的反正切值
            tan_k = (line_2_k - line_1_k) / (1 + line_2_k*line_1_k); //求直线夹角的公式
            lines_arctan = atan(tan_k);
            return lines_arctan;
        }
        else
        {
            double tan_k = 0; //直线夹角正切值
            double lines_arctan;//直线斜率的反正切值
            tan_k = (line_2_k - line_1_k) / (1 + line_2_k*line_1_k); //求直线夹角的公式
            lines_arctan = atan(tan_k)* 180.0 / PI;
            return lines_arctan;
        }
    }

}
