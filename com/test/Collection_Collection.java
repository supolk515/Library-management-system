package com.test;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Collection {//Collection是接口
    public static void main(String[] args){
        Collection<String> coll = new ArrayList<>();//c1为collection的实现类对象。<type>制定添加类型
        //boolean add(E e)向集合添加元素,list一定true,set重复元素会false
        coll.add("aa");
        coll.add("bb");
        System.out.println(coll.add("cc"));//添加成功：true
        System.out.println(coll);

        //boolean remove(E e)删除具体元素（collection中方法要兼顾List和Set的特性，所以不能通过索引删）
        coll.remove("aa");
        System.out.println(coll);
        System.out.println(coll.remove("aa"));//删除的元素不存在：false

        //void clear()删除所有元素
        //coll.clear();
        //System.out.println();

        //boolean contains(Object obj)查询集合是否包含该元素
        System.out.println(coll.contains("bb"));

        //boolean isEmpty()判断集合是否为空
        System.out.println(coll.isEmpty());

        //int size()元素个数
        System.out.println(coll.size());

        Collection<Student> coll2 = new ArrayList<>();
        Student s1 = new Student("zs",19);
        Student s2 = new Student("ls",20);
        Student s3 = new Student("zs",19);
        coll2.add(s1);
        coll2.add(s2);
        System.out.println(coll2.contains(s3));
    }
}
