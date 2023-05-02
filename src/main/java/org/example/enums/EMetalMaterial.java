package org.example.enums;

public enum EMetalMaterial {
    STEEL, CAST_IRON, COPPER;

    @Override
    public String toString(){
        switch (this){
            case STEEL:
                return "Сталь";
            case CAST_IRON:
                return "Чугун";
            case COPPER:
                return "Мідь";
        }
        return  this.toString();
    }
}
