package com.github.silvertide7.template;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CreeperHeartItem extends Item {

  public CreeperHeartItem(Settings settings) {
    super(settings);
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    if (hand == Hand.MAIN_HAND) {
      System.out.println("Sssss....");
    }
    return super.use(world, user, hand);
  }

}