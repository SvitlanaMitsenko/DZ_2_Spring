package org.example;

import org.example.enums.ECountry;
import org.example.enums.EFlatWareType;
import org.example.enums.EMaterial;
import org.example.enums.EMetalMaterial;

public abstract class AFlatWare implements IFlatWare {
    protected EFlatWareType type;
    protected ECountry country;
    protected EMaterial handleMaterial;

    public AFlatWare(EFlatWareType type, ECountry country, EMaterial handleMaterial) {
        this.type = type;
        this.country = country;
        this.handleMaterial = handleMaterial;
    }
    EMetalMaterial blade;
    Float length;
    Float width;

    protected AFlatWare() {
    }

    @Override
    public String getDescription() {
        return type.toString() + ", виробник - " + country.toString() + ", матеріал рукояти - " + handleMaterial.toString();
    }
}
