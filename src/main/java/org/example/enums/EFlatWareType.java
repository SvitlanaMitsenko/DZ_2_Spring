package org.example.enums;

public enum EFlatWareType {
    KNIFE, FORK, SPOON;

    @Override
   public String toString(){
       switch (this){
           case KNIFE:
               return "Ніж";
           case FORK:
               return "Виделка";
           case SPOON:
               return "Ложка";
       }
       return  this.toString();
   }
}
