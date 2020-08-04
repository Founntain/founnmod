package de.founntain.founnmod.tools;

import java.util.function.Supplier;

import de.founntain.founnmod.enums.Enchantability;
import de.founntain.founnmod.enums.HarvestLevel;
import de.founntain.founnmod.enums.ToolDurability;
import de.founntain.founnmod.enums.ToolEfficiency;
import de.founntain.founnmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {
    FOXORB(HarvestLevel.IRON, ToolDurability.FOXORB, ToolEfficiency.IRON, 3.0F, Enchantability.IRON, () -> {
        return Ingredient.fromItems(RegistryHandler.FOXORB.get());
    });

    private final int harvesLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int echantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(HarvestLevel harvesLevel, ToolDurability toolDurability, ToolEfficiency toolEfficiency, float attackDamage, Enchantability echantability, Supplier<Ingredient> repairMaterial){
        this.harvesLevel = harvesLevel.getValue();
        this.maxUses = toolDurability.getValue();
        this.efficiency = toolEfficiency.getValue();
        this.attackDamage = attackDamage;
        this.echantability = echantability.getValue();
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