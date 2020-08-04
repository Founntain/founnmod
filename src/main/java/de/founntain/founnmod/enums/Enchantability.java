package de.founntain.founnmod.enums;

public enum Enchantability {
    WOOD(15),
    STONE(5),
    IRON(14),
    GOLD(22),
    DIAMOND(10),
    LEATHER_ARMOR(15),
    CHAINMAIL_ARMOR(12),
    IRON_ARMO(9),
    GOLD_ARMOR(25),
    DIAMOND_ARMOR(25),
    BOOK(1);

    private final int value;

    Enchantability(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}