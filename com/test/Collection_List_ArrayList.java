package com.test;
import java.util.*;


public class Collection_List_ArrayList {
    public void main(String[] args){
        int days = DaysofMonths.daysofmonths(13);
        System.out.println(days);

        System.out.println(Factorial.factorial(5));

        Scanner sc = new Scanner(System.in);
        int number = 13579;
        int temp = number;
        int count = 0;
        while (temp >= 10){
            temp /= 10;
            count++;
        }
        for (int i = 0; i <= count; i++){
            int k = (int)Math.pow(10,i);
            System.out.print(number / k % 10);
        }
        System.out.println();

        int[] arr1 = new int[]{1,8,7,9,2};
        System.out.println(Minimum.minimum(arr1));
        int[] arr11 = Arrays.copyOf(arr1,5);
        for (int i = 0; i < arr11.length; i++){
            System.out.print(arr11[i]+" ");
        }
        System.out.println();

        String s = "Hello";
        System.out.println(s.length() + " " + s.charAt(4) + " " + s.contains("H") + " " + s.indexOf("e"));

        CharacterBlock. characterBlock(4,3);

        int[] arr2 =Arrays.copyOf(arr1,5);
        Arrays.sort(arr2);//升序
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        int[] arr3 = Arrays.copyOf(arr1,5);
        BubbleSort.bubbleSort(arr3);
        for (int i : arr3){
            System.out.print(i +" ");
        }
        System.out.println();

        System.out.println(Arrays.binarySearch(arr3,2));//数组必须升序，key存在时的输出 = index
        System.out.println(Arrays.binarySearch(arr3,6));//key不存在时的输出等于该在的位置序号的相反数

        int[] arr4 = Arrays.copyOfRange(arr3,0,4);//左闭右开
        System.out.println(Arrays.toString(arr4));

        Arrays.fill(arr4,10);
        System.out.println(Arrays.toString(arr4));

        int x = 10;
        Integer y = x;// y是包装类（可以作为泛型加入集合）
        int z = y;//z是普通类

        int k = Integer.parseInt("111");
        String s2 = Integer.toString(111);
        int k2 = Integer.parseInt(s2);//包装类除了Character都有对应的类型转换方法Xxx.parseXxx(String)
        System.out.println(k + k2);
        boolean tof = Boolean.parseBoolean("true");
        System.out.println(tof);

        //String s3 = sc.nextLine();//不会被空格打断

        Integer[] Arr = {1,4,9,10,7};

        Arrays.sort(Arr,new Comparator<Integer>(){//匿名内部类
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序
            }
        });

        System.out.println(Arrays.toString(Arr));

        Student ss = new Student("aaa",10);
        System.out.println(ss.toString());

        List<String> l1 = new ArrayList<>();//E = String

        l1.add("aa");
        l1.add("aa");
        l1.add("bb");

        //E get(index)//返回该索引的元素
        String str = l1.get(1);
        System.out.println(str);

        //E remove(index)//删除并返回该索引的元素
        String str2 = l1.remove(2);
        System.out.println(str2 + " " + l1.contains("bb"));

        //E set(index,e)//将该索引原来的元素替换为e并返回原来的元素
        String str3 = l1.set(0,"cc");
        System.out.println(str3 + " " + l1.get(0));
   }
}

