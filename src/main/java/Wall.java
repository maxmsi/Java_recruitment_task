package main.java;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {

    private List<Block> blocks ;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        Optional<Block> blockByColor = Optional.ofNullable(blocks.stream()
                .filter(e -> e.getColor().equals(color))
                .findAny()
                .orElse(null));

        return blockByColor;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocksByMaterial = blocks.stream()
                .filter(e->e.getMaterial().equals(material))
                .collect(Collectors.toList());
        return blocksByMaterial;
    }

    @Override
    public int count() {
        return blocks.size();
    }


}
