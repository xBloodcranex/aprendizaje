package net.blc.tutorialmod.item;

import net.blc.tutorialmod.Tutorialmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CITRINE;

    public static void registerItemGroups() {
        CITRINE = FabricItemGroup.builder(new Identifier(Tutorialmod.MOD_ID, "citrine"))
                .displayName(Text.literal("Citrine Item Group"))
                .icon(() -> new ItemStack(ModItems.CITRINE)).build();
    }
}
