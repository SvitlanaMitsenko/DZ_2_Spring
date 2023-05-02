package org.example.enums;

public enum ECountry {
    UKRAINE, ENGLAND, POLAND, CHINA, GERMANY;
    @Override
    public String toString(){
        switch (this){
            case UKRAINE:
                return "Україна";
            case ENGLAND:
                return "Англія";
            case POLAND:
                return "Польща";
            case CHINA:
                return "Китай";
            case GERMANY:
                return "Німеччина";
        }
        return  this.toString();
    }
}
