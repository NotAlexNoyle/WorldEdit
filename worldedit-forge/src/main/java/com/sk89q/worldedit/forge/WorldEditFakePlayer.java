/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.forge;

import com.mojang.authlib.GameProfile;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.MenuProvider;
import net.minecraftforge.common.util.FakePlayer;

import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;

public class WorldEditFakePlayer extends FakePlayer {

    private static final GameProfile FAKE_GAME_PROFILE = new GameProfile(UUID.nameUUIDFromBytes("worldedit".getBytes()), "[WorldEdit]");

    public WorldEditFakePlayer(ServerLevel world) {
        super(world, FAKE_GAME_PROFILE);
    }

    @Override
    public boolean canEat(boolean checkHunger) {
        return true;
    }

    @Override
    public OptionalInt openMenu(@Nullable MenuProvider menuProvider) {
        return OptionalInt.empty();
    }
}
