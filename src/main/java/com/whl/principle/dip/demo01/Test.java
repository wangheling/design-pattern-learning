package com.whl.principle.dip.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 15:14
 */
public class Test {

//    public static void main(String[] args) {
//        Student student = new Student();
//        student.studyJava();
//        student.studyPython();
//        //当新增学习的语言，需要修改高层代码，在Student增加新的方法
//    }


    public static void main(String[] args) {
        StudentV2 student = new StudentV2();
        student.study(new JavaCourse());
        student.study(new PythonCourse());
        //依赖倒置，无需修改高层代码，只需增加一个语言类，通过传参通知student
    }


}
