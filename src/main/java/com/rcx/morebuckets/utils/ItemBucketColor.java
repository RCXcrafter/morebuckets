package com.rcx.morebuckets.utils;

import com.rcx.morebuckets.items.ItemCustomBucket;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemStack;

public class ItemBucketColor implements IItemColor {

	@Override
	public int getColorFromItemstack(ItemStack stack, int tintIndex) {
		if(tintIndex != 1) {
			if(stack.getItem() instanceof ItemCustomBucket) {
				return ((ItemCustomBucket)stack.getItem()).color;
			}
		}
		return 0xFFFFFF;
	}
}
