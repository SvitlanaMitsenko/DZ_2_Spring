package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class CollectionsBean {
    @Autowired(required = false)
    public List<IFlatWare> beanList = new ArrayList<>();
  //  @Bean
    public void printBeanList() {
        System.out.println(beanList);
    }
}
