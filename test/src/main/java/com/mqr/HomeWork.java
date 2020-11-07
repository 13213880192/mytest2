package com.mqr;

import java.util.Scanner;

/**
 * @author mqr
 * @version 1.0
 */
public class HomeWork {

    public static void main(String[] args) {
//        System.out.println(kfcPay());
        chooiseTarget();
    }

    // KFC第二杯半价策略
    public static double kfcPay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入购买商品的价格：");
        int price = sc.nextInt();
        System.out.println("请你输入购买数量：");
        int num = sc.nextInt();
        /*
             如果成立证明购买数量为偶数：则计算方式为（
             (num/2)*price+(num/2)*(price/2)
             = ((num/2)*1.5*price  ）
             如果不成立，则证明购买数量为奇数，则计算方式为
            (num/2)*1.5*price+price
             */
        double payMoney = (num%2==0)?((num/2)*1.5*price):((num/2)*1.5*price+price);

        return payMoney;
    }

    // 花费套餐选择
    public static void chooiseTarget(){
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入每月电话分钟数：");
        int time = sc.nextInt();
        double payMoneyForA =  time*0.2+16;
        double payMoneyForB = 0.5*time;
        // 判断相同时间A套餐花费的钱和B套餐话费的钱进行比较，谁大不选谁
        result = payMoneyForA>payMoneyForB?"B":"A";
        System.out.println("您应该选择的套餐为："+result+"套餐");
    }
}
