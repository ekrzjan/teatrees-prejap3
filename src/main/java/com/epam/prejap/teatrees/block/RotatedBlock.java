package com.epam.prejap.teatrees.block;

/**
 * @author Krzysztof Janas
 */
public final class RotatedBlock extends Block {
    public RotatedBlock(Block block) {
        super(rotatedDots(block));
    }

    private static byte[][] rotatedDots(Block block) {
        byte[][] dots = new byte[block.cols()][block.rows()];
        for (int i = 0; i < block.cols(); i++)
            for (int j = 0; j < block.rows(); j++)
                dots[i][j] = block.dotAt(block.rows - j - 1, i);
        return dots;
    }
}
