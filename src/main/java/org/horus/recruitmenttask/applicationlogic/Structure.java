package org.horus.recruitmenttask.applicationlogic;

import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional<Block> findBlocksByColor(String color);
    List<Block> findBlocksByMaterial(String material);
    int count();
}
