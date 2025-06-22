package me.bedtwL.addon.ffa;

import me.bedtwL.ffa.api.PlayerArrowShootEffect;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ArrowSlimeShoot implements PlayerArrowShootEffect {
    @Override
    public void ArrowShootEffect(Location location, Player player) {
        location.getWorld().playEffect(location, Effect.SLIME, 0);
    }

    @Override
    public String getName() {
        return "SlimeTrail";
    }

    @Override
    public String getItemNameKey() {
        return "slime-arrow-shoot";
    }

    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.SLIME_BALL);
    }
}
