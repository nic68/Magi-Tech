package net.magitech.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.magitech.MagiTechElements;

@MagiTechElements.ModElement.Tag
public class BasicMiningUnitRedstoneOnProcedure extends MagiTechElements.ModElement {
	public BasicMiningUnitRedstoneOnProcedure(MagiTechElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BasicMiningUnitRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BasicMiningUnitRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BasicMiningUnitRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BasicMiningUnitRedstoneOn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH)) {
			if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK.getDefaultState().getBlock()))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
			}
		}
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH)) {
			if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK.getDefaultState().getBlock()))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
			}
		}
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST)) {
			if ((!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState().getBlock()))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
			}
		}
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST)) {
			if ((!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK.getDefaultState().getBlock()))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
			}
		}
	}
}
