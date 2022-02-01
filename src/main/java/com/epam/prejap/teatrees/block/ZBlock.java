package com.epam.prejap.teatrees.block;

/**
 * Frame for Z shaped tetris block.
 *
 * @author Jovhar Isayev
 * @see Block
 */
public final class ZBlock extends Block {
    private static final byte[][] IMAGE = new byte[][]{
            {1, 1, 0},
            {0, 1, 1}
    };

    public ZBlock() {
        super(IMAGE);
    }
}
