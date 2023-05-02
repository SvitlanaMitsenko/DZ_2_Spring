package org.example.impl;

import org.example.AFlatWare;
import org.example.enums.ECountry;
import org.example.enums.EFlatWareType;
import org.example.enums.EMaterial;

public class Fork extends AFlatWare {
    float prongLength;
    public Fork(){}
    public Fork(EFlatWareType type, ECountry country, EMaterial handleMaterial, float prongLength) {
        super(type, country, handleMaterial);
        this.prongLength = prongLength;
    }

    public static Fork onInit(){
        return new Fork();
      // return new Fork(EFlatWareType.FORK, ECountry.CHINA, EMaterial.METAL, 60f);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", довжина зубців - " + prongLength + mesureUnit;
    }

    public void setProngLength(float prongLength) {
        this.prongLength = prongLength;
    }
        public void setType(EFlatWareType type){
        this.type = type;
    }
    public void setHandleMaterial(EMaterial handleMaterial){
        this.handleMaterial = handleMaterial;
    }
    public void setCountry(ECountry country){
        this.country = country;
    }
}
