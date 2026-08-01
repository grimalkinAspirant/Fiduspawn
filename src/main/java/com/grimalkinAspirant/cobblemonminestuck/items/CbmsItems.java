package com.grimalkinAspirant.cobblemonminestuck.items;

import com.grimalkinAspirant.cobblemonminestuck.CobblemonMinestuck;
import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.weapon.ItemRightClickEffect;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CbmsItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonMinestuck.MODID);

    public static final DeferredItem<Item> PKMN_STORAGE_DISK = ITEMS.register("pkmn_storage_disk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRLY_CANDY = ITEMS.register("grly_candy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROLY_CANDY = ITEMS.register("broly_candy",
            () -> new Item(new Item.Properties()));

    // Weapons
    public static final DeferredItem<Item> BITTER_BLADE = ITEMS.register("bitter_blade",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 6, -2.4F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.setOnFire(10), (OnHitEffect.LIFE_SATURATION)),
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> RUINATION = ITEMS.register("ruination",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, 7, -3.0F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).add(OnHitEffect.SWEEP, (OnHitEffect.enemyPotionEffect(
                    () -> new MobEffectInstance(MobEffects.WITHER, 100, 2)))),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> STUN_SHOCK = ITEMS.register("stun_shock",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.IRON, 2, -3.5F).efficiency(15.0F).set(MSItemTypes.AXE_TOOL).add(OnHitEffect.enemyPotionEffect(
                    () -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 10))),
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> IVY_CUDGEL = ITEMS.register("ivy_cudgel",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3.0F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL_FIRE)).
                    add(OnHitEffect.onCrit(OnHitEffect.enemyPotionEffect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 100, 1)))),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> IVY_CUDGEL_FIRE = ITEMS.register("ivy_cudgel_fire",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3.0F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL_WATER)).
                    add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 0)))),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> IVY_CUDGEL_WATER = ITEMS.register("ivy_cudgel_water",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3.0F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL_ROCK)).
                    add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 100, 1)))),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> IVY_CUDGEL_ROCK = ITEMS.register("ivy_cudgel_rock",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3.0F).efficiency(15.0F).set(MSItemTypes.CLUB_TOOL).set(ItemRightClickEffect.switchTo(CbmsItems.IVY_CUDGEL)).
                    add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1)))),
                    new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> WATER_SHURIKEN = ITEMS.register("water_shuriken",
            () -> new ConsumableProjectileWeaponItem(new Item.Properties(), 2.0F, 2.3F, 2));
    public static final DeferredItem<Item> SACRED_SWORD = ITEMS.register("sacred_sword",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3.0F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).
                    // set(ItemRightClickEffect.switchTo(CbmsItems.KINGS_SHIELD)).
                    add(OnHitEffect.onCrit(OnHitEffect.enemyPotionEffect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 100, 1)))),
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> KINGS_SHIELD = ITEMS.register("kings_shield",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.DIAMOND, 3, -3.0F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL).
                    // set(ItemRightClickEffect.switchTo(CbmsItems.SACRED_SWORD)).
                            add(OnHitEffect.onCrit(OnHitEffect.userPotionEffect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 1)))),
                    new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> LEAF_BLADE = ITEMS.register("leaf_blade",
            () -> new WeaponItem(new WeaponItem.Builder(Tiers.NETHERITE, -1, +1F).efficiency(15.0F).set(MSItemTypes.SWORD_TOOL),
                    new Item.Properties().rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    }