package org.example.impl;

import org.example.AFlatWare;
import org.example.enums.ECountry;
import org.example.enums.EFlatWareType;
import org.example.enums.EMaterial;

public class Spoon extends AFlatWare {

    public Spoon(EFlatWareType type, ECountry country, EMaterial handleMaterial) {
        super(type, country, handleMaterial);
    }

}
