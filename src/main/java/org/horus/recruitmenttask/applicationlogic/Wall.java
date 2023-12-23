package org.horus.recruitmenttask.applicationlogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{
    private List<Block> blocks;

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return getBlocks().stream()
                .filter(b -> b.getMaterial().equals(material))
                .collect(Collectors.toList());
    }
    @Override
    public Optional<Block> findBlockByColor(String color) {
        return getBlocks().stream()
                .filter(b -> b.getColor().equals(color))
                .findAny();
    }
    @Override
    public int count() {
        return getBlocks().size();
    }
    public List<Block> getBlocks() {
        return blocks;
    }
    public Wall() {
        blocks = new ArrayList<>();
    }
    public void buildByCompositeBlock(CompositeBlock compositeBlock) throws NullPointerException {
        blocks.addAll(compositeBlock.getBlocks());
    }
    public void buildByBlock(Block block) {
        blocks.add(block);
    }
}
