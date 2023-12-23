package org.horus.recruitmenttask.applicationlogic;

import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();
}
