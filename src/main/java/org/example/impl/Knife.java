package org.example.impl;

import org.example.AFlatWare;
import org.example.enums.ECountry;
import org.example.enums.EFlatWareType;
import org.example.enums.EMaterial;
import org.example.enums.EMetalMaterial;

public class Knife extends AFlatWare {
    EMetalMaterial bladeMaterial;
    float bladeWidth;
    float bladeLength;
    public Knife(EFlatWareType type, ECountry country, EMaterial handleMaterial, float bladeWidth, float bladeLength) {
        super(type, country, handleMaterial);
        this.bladeLength = bladeLength;
        this.bladeWidth = bladeWidth;
    }
    public void setBladeMaterial(EMetalMaterial bladeMaterial) {
        this.bladeMaterial = bladeMaterial;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", довжина леза - " + bladeLength + mesureUnit + ", ширина леза - " + bladeWidth + mesureUnit + ", метал леза - " + bladeMaterial;
    }
}
