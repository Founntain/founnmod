package de.founntain.founnmod.enums;

public enum HarvestLevel {
    WOOD(0),
    STONE(1),
    IRON(2),
    DIAMOND(3),
    DIAMOND_PLUS(4);

    private final int value;

    HarvestLevel(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}