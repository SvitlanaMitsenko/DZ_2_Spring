package org.example.enums;

public enum EMaterial {
    WOOD, PLASTIC, METAL;

    @Override
    public String toString(){
        switch (this){
            case WOOD:
                return "Дерево";
            case PLASTIC:
                return "Пластик";
            case METAL:
                return "Метал";
        }
        return  this.toString();
    }
}
