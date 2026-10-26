package com.grimalkinAspirant.cobblemonminestuck.items;

import com.grimalkinAspirant.cobblemonminestuck.CobblemonMinestuck;
import com.mraof.minestuck.computer.ProgramTypes;
import com.mraof.minestuck.item.MSFoods;
import com.mraof.minestuck.item.MSItemProperties;
import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.components.MSItemComponents;
import com.mraof.minestuck.item.foods.DrinkableItem;
import com.mraof.minestuck.item.weapon.ItemRightClickEffect;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import java.util.List;

import static com.grimalkinAspirant.cobblemonminestuck.CobblemonMinestuck.BLOCKS;

public class CbmsItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonMinestuck.MODID);

    // public static final DeferredItem<Item> PKMN_STORAGE_DISK = ITEMS.register("pkmn_storage_disk", () -> new Item(new Item.Properties().stacksTo(1).component(MSItemComponents.PROGRAM_TYPE, ProgramTypes.POKEMON_STORAGE)));
    public static final DeferredItem<Item> GRLY_CANDY = ITEMS.register("grly_candy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROLY_CANDY = ITEMS.register("broly_candy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTIMATE_EXP_CANDY = ITEMS.register("ultimate_exp_candy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUPER_DUPER_RARE_CANDY = ITEMS.register("super_duper_rare_candy",
            () -> new Item(new Item.Properties()));

    // Food
    public static final DeferredItem<Item> RARE_CANDY_FAYGO = ITEMS.register("rare_candy_faygo",
            () -> new DrinkableItem(new Item.Properties().stacksTo(16).food(MSFoods.FAYGO)));

    // Weapons
    public static final DeferredItem<Item> BITTER_BLADE = ITEMS.register("bitter_blade",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 6, -2.4F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.setOnFire(10), (OnHitEffect.LIFE_SATURATION)),
                    new MSItemProperties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> RUINATION = ITEMS.register("ruination",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.HORRORTERROR_TIER, 7, -2.4F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP, (OnHitEffect.enemyPotionEffect(
                    () -> new MobEffectInstance(MobEffects.WITHER, 100, 2)))),
                    new MSItemProperties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> STUN_SHOCK = ITEMS.register("stun_shock",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.URANIUM_TIER, 2, -3.5F).efficiency(15.0F).set(MSItemTypes.AXE_TOOL).add(OnHitEffect.enemyPotionEffect(
                    () -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 10))),
                    new MSItemProperties().durability(1561).rarity(Rarity.RARE)));
    public static final DeferredItem<Item> IVY_CUDGEL = ITEMS.register("ivy_cudgel",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.ORGANIC_TIER, 6, -2.7F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL_FIRE)).
                    add(OnHitEffect.onCrit(OnHitEffect.enemyPotionEffect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 100, 1)))),
                    new MSItemProperties().durability(2048).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> IVY_CUDGEL_FIRE = ITEMS.register("ivy_cudgel_fire",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.ORGANIC_TIER, 6, -2.7F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL_WATER)).
                    add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 0)))),
                    new MSItemProperties().durability(2048).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> IVY_CUDGEL_WATER = ITEMS.register("ivy_cudgel_water",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.ORGANIC_TIER, 6, -2.7F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL_ROCK)).
                    add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 100, 1)))),
                    new MSItemProperties().durability(2048).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> IVY_CUDGEL_ROCK = ITEMS.register("ivy_cudgel_rock",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.ORGANIC_TIER, 6, -2.7F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL)).
                    add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1)))),
                    new MSItemProperties().durability(2048).rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> WATER_SHURIKEN = ITEMS.register("water_shuriken",
            () -> new ConsumableProjectileWeaponItem(new Item.Properties(), 2.0F, 2.3F, 2));
    public static final DeferredItem<Item> SACRED_SWORD = ITEMS.register("sacred_sword",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -2.6F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).
                    // set(ItemRightClickEffect.switchTo(CbmsItems.KINGS_SHIELD)).
                    add(OnHitEffect.onCrit(OnHitEffect.enemyPotionEffect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 100, 1)))),
                    new MSItemProperties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> KINGS_SHIELD = ITEMS.register("kings_shield",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3.0F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).
                    // set(ItemRightClickEffect.switchTo(CbmsItems.SACRED_SWORD)).
                            add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1)))),
                    new MSItemProperties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> LEAF_BLADE = ITEMS.register("leaf_blade",
            () -> new WeaponItem(new WeaponItem.Builder(MSItemTypes.PAPER_TIER, 1, 2F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL),
                    new MSItemProperties().durability(2048).rarity(Rarity.EPIC)));
    // Blocks
public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        }
    }