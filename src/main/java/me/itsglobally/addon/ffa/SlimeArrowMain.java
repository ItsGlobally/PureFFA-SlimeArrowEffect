package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

import java.util.UUID;

public class SlimeArrowMain implements EffectAddon {
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
    public UUID authorUUID() {
        return UUID.fromString("748c3863-c04d-493b-bce3-05a1765a5b56");
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
