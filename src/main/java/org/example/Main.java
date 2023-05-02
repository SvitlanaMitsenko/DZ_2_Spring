package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        // ЗАВДАННЯ 2
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        System.out.println("\nСписок з контексту xml:");
        ArrayList<IFlatWare> list2 = (ArrayList<IFlatWare>)ctx.getBean("flatWareList");
        for(IFlatWare i: list2){
            System.out.println(i.getDescription());
        }

        // ЗАВДАННЯ 3
        //Переведите XML-конфигурацию из Задания 2 в Java конфигурацию.
        ApplicationContext  ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("\nСписок з java-контексту:");
        ArrayList<IFlatWare> list = ( ArrayList<IFlatWare>)ctx2.getBean("getBeanList");
        for(IFlatWare i: list){
            System.out.println(i.getDescription());
        }

        // ЗАВДАННЯ 4
        // Создайте в XML-конфигурации бин Map, по аналогии с List из урока.
        System.out.println("\nHashMap з контексту xml:");
        HashMap<IFlatWare,Integer> map = ( HashMap<IFlatWare,Integer>)ctx.getBean("myMap");
        for(Map.Entry<IFlatWare,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey().getDescription() + ", в кількості " + entry.getValue() + "шт.");
        }
    }
}