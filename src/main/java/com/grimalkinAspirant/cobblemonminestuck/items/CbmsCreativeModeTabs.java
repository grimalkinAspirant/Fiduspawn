package com.grimalkinAspirant.cobblemonminestuck.items;

import com.grimalkinAspirant.cobblemonminestuck.CobblemonMinestuck;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CbmsCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CobblemonMinestuck.MODID);

    public  static final Supplier<CreativeModeTab> COBBLEMONMINESTUCK_TAB = CREATIVE_MODE_TAB.register("cobblemonminestuck_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CbmsItems.ULTIMATE_EXP_CANDY.get()))
                    .title(Component.translatable("Fiduspawn"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(CbmsItems.SACRED_SWORD);
                        output.accept(CbmsItems.WATER_SHURIKEN);
                        output.accept(CbmsItems.BITTER_BLADE);
                        output.accept(CbmsItems.RUINATION);
                        output.accept(CbmsItems.STUN_SHOCK);
                        output.accept(CbmsItems.IVY_CUDGEL);
                        output.accept(CbmsItems.LEAF_BLADE);
                        output.accept(CbmsItems.GRLY_CANDY);
                        output.accept(CbmsItems.BROLY_CANDY);
                        output.accept(CbmsItems.RARE_CANDY_FAYGO);
                        output.accept(CbmsItems.ULTIMATE_EXP_CANDY);
                        output.accept(CbmsItems.SUPER_DUPER_RARE_CANDY);
                        //output.accept(CbmsItems.GOLD_LEAF_FLOOR);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
