package de.founntain.founnmod.enums;

public enum ToolDurability {
    //Materials
    WOOD(59),
    STONE(131),
    IRON(250),
    GOLD(32),
    FOXORB(700),
    DIAMOND(1561),
    NETHERITE(2031),
    //Other
    FISHING_ROD(64),
    FLINT_AND_STEEL(64),
    SHEARS(238),
    SHIELD(336),
    BOW(384),
    TRIDENT(250),
    ELYTRA(432),
    CROSSBOW(326);

    private final int value;

    ToolDurability(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}