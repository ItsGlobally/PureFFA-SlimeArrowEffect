package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

public abstract class SlimeArrowMain implements EffectAddon {
    @Override
    public Integer getAPIVer() { return 1; };
    @Override
    public String getName() {
        return "SlimeArrow";
    }

    @Override
    public String getAuthor() {
        return "ItsGlobally";
    }

    @Override
    public void onEnable() {
        new ArrowSlimeShoot().registerArrowShootEffect(this);
    }

    @Override
    public void onDisable() {
        new ArrowSlimeShoot().unregisterArrowShootEffect();
    }
}
