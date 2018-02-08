package com.springboot.manager.common;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Description： jdk 8 lambda表达式的测试使用
 * @Author:hudi
 * @Date: Created in 13:59 2018/2/8
 */

public class LambdaTest {
    /**
     * 用lambda表达式实现Runnable
     */
    @Test
    public void test1(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();
        new Thread(() ->  System.out.println("In Java8, Lambda expression rocks !!")).start();
    }

    /**
     * 使用Java 8 lambda表达式进行事件处理
     */
    @Test
    public void test2(){
        JButton show =  new JButton("Show");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event handling without lambda expression is boring");
            }
        });
        // Java 8方式：
        show.addActionListener((e) -> {
            System.out.println("Light, Camera, Action !! Lambda expressions Rocks");
        });
    }

    /**
     * 使用lambda表达式对列表进行迭代
     */
    @Test
    public void test3(){
      /*  // Java 8之前：
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (String feature : features) {
            System.out.println(feature);
        }*/

        // Java 8之后：
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(e->System.out.println(e));

        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
        // 看起来像C++的作用域解析运算符
        features.forEach(System.out::println);

        // 不使用lambda表达式为每个订单加上12%的税


    }

    /**
     *
     */
    @Test
    public void test4(){

    }


    /**
     *
     */
    @Test
    public void test5(){

    }


    /**
     *Java 8中使用lambda表达式的Map和Reduce示例
     */
    @Test
    public void test6(){
        // 不使用lambda表达式为每个订单加上12%的税
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            System.out.println(price);
        }

        // 使用lambda表达式
        costBeforeTax.stream().map(cost -> cost + .12*cost).forEach(System.out::println);

        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);

    }

    /**
     *通过过滤创建一个String列表
     */
    @Test
    public void test7(){
        // 创建一个字符串列表，每个字符串长度大于2

        List<String> strList =Arrays.asList("11111","222222","33","4","5555");
        List<String> newList = strList.stream().filter(str -> str.length()>2).collect(Collectors.toList());
        System.out.printf("strList : %s ,newList : %s %n ",strList,newList);
    }

    /**
     *对列表的每个元素应用函数
     */
    @Test
    public void test8(){
        // 将字符串换成大写并用逗号链接起来
        List<String> strs = Arrays.asList("USA", "Japan", "France", "Germany",  "Germany", "Germany","Italy", "U.K.","Canada");
        String str = strs.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(","));  // 生成字符串
        List<String> strt= strs.stream().map(e -> e.toUpperCase()).distinct().collect(Collectors.toList()); // distinct() 去除重复元素 生成数组
        System.out.println(str);
        System.out.printf("strs : %s", strt);
    }


}
