package org.example;

import org.example.IFlatWare;
import org.example.enums.ECountry;
import org.example.enums.EFlatWareType;
import org.example.enums.EMaterial;
import org.example.enums.EMetalMaterial;
import org.example.impl.Fork;
import org.example.impl.Knife;
import org.example.impl.Spoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JavaConfig {
    @Autowired(required = false)
    public List<IFlatWare> beanList = new ArrayList<>();

    @Bean
    public List<IFlatWare> getBeanList() {
        return beanList;
    }
    @Bean
    public IFlatWare spoon1() {
        return new Spoon(EFlatWareType.SPOON, ECountry.POLAND, EMaterial.METAL);
    }

    @Bean
    public IFlatWare spoon2() {
        return new Spoon(EFlatWareType.SPOON, ECountry.UKRAINE, EMaterial.WOOD);
    }

    @Bean
    public IFlatWare fork1() {
        return new Fork(EFlatWareType.FORK, ECountry.ENGLAND, EMaterial.METAL, 25f);
    }

    @Bean
    //   @Qualifier("CollectionsBean")
    public IFlatWare fork2() {
        return new Fork(EFlatWareType.FORK, ECountry.UKRAINE, EMaterial.METAL, 35f);
    }

    @Bean
    // @Qualifier("CollectionsBean")
    public IFlatWare knife1() {
        IFlatWare knife1 = new Knife(EFlatWareType.KNIFE, ECountry.CHINA, EMaterial.WOOD, 25f, 20f);
        ((Knife) knife1).setBladeMaterial(EMetalMaterial.COPPER);
        return knife1;
    }

    @Bean
    //  @Qualifier("CollectionsBean")
    public IFlatWare knife2() {
        IFlatWare knife2 = new Knife(EFlatWareType.KNIFE, ECountry.UKRAINE, EMaterial.METAL, 18f, 24f);
        ((Knife) knife2).setBladeMaterial(EMetalMaterial.STEEL);
        return knife2;
    }
}

//    public class CollectionsBean {
//
//
//    }

