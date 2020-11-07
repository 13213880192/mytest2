package com.mqr;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author mqr
 * @version 1.0
 */
public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份份：");
        int month = sc.nextInt();
        if(year<0 || month<0 || month>12){
            System.out.println("您输入的日期有误！");
        }else{
            LocalDate date = LocalDate.of(year, month,1);
            LocalDate date2 = null;
            if(month == 12){
                date2 = LocalDate.of(year+1, 1,1);
            }else{
                date2 = LocalDate.of(year, month+1,1);
            }
            System.out.println(date2.toEpochDay() - date.toEpochDay());
        }
    }
}
