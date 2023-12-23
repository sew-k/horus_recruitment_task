package org.horus.recruitmenttask.applicationlogic;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return null;
    }
    @Override
    public Optional<Block> findBlocksByColor(String color) {
        return null;
    }
    @Override
    public int count() {
        return -1;
    }
}
