package de.founntain.founnmod.enums;

public enum ToolEfficiency{
    WOOD(2),
    STONE(4),
    IRON(6),
    GOLD(10),
    DIAMOND(8),
    NETHERITE(9),
    TRUE_FOXORB(20);

    private final int value;

    ToolEfficiency(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}