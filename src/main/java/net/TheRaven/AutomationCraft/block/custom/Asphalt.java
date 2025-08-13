package net.TheRaven.AutomationCraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class Asphalt extends Block {
    public Asphalt(Properties properties) {
        super(properties);
    }
    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity){
        if (level.isClientSide && entity instanceof Player player && player.onGround()){
               Vec3 playerMotion = player.getDeltaMovement();
               double boostFactor = 1.375;
               Vec3 boostedSpeed = new Vec3(playerMotion.x * boostFactor,playerMotion.y, playerMotion.z * boostFactor);
               if(playerMotion.horizontalDistance() > 0.1){
                   player.setDeltaMovement(boostedSpeed);
               }


        }
    }

}
