package main.java;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {

    private List<Block> blocks ;

    public Wall(CompositeBlock blocks) {
        this.blocks = blocks.getBlocks();
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return Optional.ofNullable(blocks.stream()
                .filter(block -> block.getColor().equals(color))
                .findAny()
                .orElse(null));
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
       return blocks.stream()
                .filter(block-> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }


}
