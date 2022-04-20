package com.daq.boot.util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest {

   public static void main(String[] args) {
       // TODO Auto-generated method stub

       /*** SET ***/
       //HashSet : 중복X, 순서X
       HashSet<String> hashSet = new HashSet<String>();
       hashSet.add("4");//중복 허용 하는지 확인
       hashSet.add("4");
       hashSet.add("2");
       hashSet.add("1");
       hashSet.add("3");
       hashSet.add("5");

       Iterator<String> it = hashSet.iterator();

       System.out.println("-HashSet");

       while (it.hasNext()) {
           System.out.println(it.next());
       }

       //TreeSet : 중복X, 순서O
       TreeSet<String> treeSet = new TreeSet<String>();
       treeSet.add("4");//중복 허용 하는지 확인
       treeSet.add("4");
       treeSet.add("2");
       treeSet.add("1");
       treeSet.add("3");
       treeSet.add("5");

       it = treeSet.iterator();

       System.out.println("\r\n-TreeSet");

       while (it.hasNext()) {
           System.out.println(it.next());
       }


       /*** LIST ***/
       //ArrayList: 중복O, 순서O, 데이터 입력 삭제에 속도가 느림, 검색속도 빠름
       ArrayList<String> arrayList = new ArrayList<String>();
       arrayList.add("4");//중복 허용 하는지 확인
       arrayList.add("4");
       arrayList.add("2");
       arrayList.add("1");
       arrayList.add("3");
       arrayList.add("5");

       System.out.println("\r\n-ArrayList");

       for(String str:arrayList){
           System.out.println(str);
       }

       //LinkedList: 중복O, 순서O, 데이터 입력 삭제에 속도가 빠름, 검색속도 느림
       LinkedList<String> linkedList = new LinkedList<String>();
       linkedList.add("4");//중복 허용 하는지 확인
       linkedList.add("4");
       linkedList.add("2");
       linkedList.add("1");
       linkedList.add("3");
       linkedList.add("5");

       System.out.println("\r\n-LinkedList");

       for(String str:linkedList){
           System.out.println(str);
       }


       /*** MAP ***/
       //HashMap: 키 중복X, 정렬X, Key=Value 형식의 데이터 저장
       HashMap<String, String> hashMap = new HashMap<String, String>();
       hashMap.put("4", "Value_4");
       hashMap.put("1", "Value_1");
       hashMap.put("1", "Value_1");//키 중복 허용 하는지 확인
       hashMap.put("2", "Value_2");
       hashMap.put("5", "Value_5");
       hashMap.put("3", "Value_3");

       System.out.println("\r\n-HashMap");

       for(String key : hashMap.keySet()){
           System.out.println(key +" = "+ hashMap.get(key));
       }

       //TreeMap: 키 중복X, 정렬O, Key=Value 형식의 데이터 저장
       TreeMap<String, String> treeMap = new TreeMap<String, String>();
       treeMap.put("4", "Value_4");//순서 보기
       treeMap.put("1", "Value_1");
       treeMap.put("1", "Value_1");//키 중복 허용 하는지 확인
       treeMap.put("3", "Value_3");
       treeMap.put("5", "Value_5");
       treeMap.put("2", "Value_2");        

       System.out.println("\r\n-TreeMap");

       for(String key : treeMap.keySet()){
           System.out.println(key +" = "+ treeMap.get(key));
       }

   }

}
