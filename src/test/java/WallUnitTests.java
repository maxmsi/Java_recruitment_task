package test.java;

import main.java.Block;
import main.java.CompositeBlock;
import main.java.Wall;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


public class WallUnitTests {

    /*
        Test setup for Wall class
        CompositeBlock anonymous class described single block as :
            - color: orange
            - material : brick
     */

    CompositeBlock brickBlocks = new CompositeBlock() {
        @Override
        public String getColor() {
            return "orange";
        }

        @Override
        public String getMaterial() {
            return "brick";
        }

        @Override
        public List<Block> getBlocks() {
            return new ArrayList<>(Collections.singleton(new Block() {
                @Override
                public String getColor() {
                    return "orange";
                }

                @Override
                public String getMaterial() {
                    return "brick";
                }
            }));
        }
    };
    Wall wallOfBricks = new Wall(brickBlocks);


    @Test
    public void doNotFindBlockByColorTest(){
        Assert.assertEquals(Optional.empty(), wallOfBricks.findBlockByColor("blue"));
        assertFalse(wallOfBricks.findBlockByColor("blue").isPresent());
    }
    @Test
    public void findBlockByColorTest(){

        Optional optional = wallOfBricks.findBlockByColor("orange");
        assertTrue(optional.isPresent());
    }
    @Test
    public void doNotFindByMaterial(){
        assertFalse(!wallOfBricks.findBlocksByMaterial("steel").isEmpty());
    }

    @Test
    public void findByMaterial(){
        assertFalse(wallOfBricks.findBlocksByMaterial("brick").isEmpty());
    }

    @Test
    public void testForValidCount(){
        assertEquals(1,wallOfBricks.count());
    }
}
