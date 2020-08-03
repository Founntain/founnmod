package de.founntain.founnmod.tools;

import java.util.function.Supplier;

import de.founntain.founnmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {
    FOXORB(10, 2500, 30F, 3.0F, 30, () -> {
        return Ingredient.fromItems(RegistryHandler.FOXORB.get());
    });

    private final int harvesLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int echantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvesLevel, int maxUses, float efficiency, float attackDamage, int echantability, Supplier<Ingredient> repairMaterial){
        this.harvesLevel = harvesLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.echantability = echantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvesLevel;
    }

    @Override
    public int getEnchantability() {
        return echantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
    
}