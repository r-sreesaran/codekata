package davethomascodekata.karatechop;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import  davethomascodekata.karatechop.KarateChop;

public class KarateChopTests {
    KarateChop instance = new KarateChop();
    
    @Test
    public void testSearch(){
        int[] empty;
        Assert.assertEquals(-1, instance.chop(3, new int [] {} ));
        Assert.assertEquals(-1, instance.chop(3, new int [] {1}));
        Assert.assertEquals(0,  instance.chop(1, new int [] {1}));
  
        Assert.assertEquals(0,  instance.chop(1, new int [] {1,3,5}));
        Assert.assertEquals(1,  instance.chop(3, new int [] {1,3,5}));
        Assert.assertEquals(2,  instance.chop(5, new int [] {1,3,5}));
        Assert.assertEquals(-1, instance.chop(0, new int [] {1,3,5}));
        Assert.assertEquals(-1, instance.chop(2, new int [] {1,3,5}));
        Assert.assertEquals(-1, instance.chop(4, new int [] {1,3,5}));
        Assert.assertEquals(-1, instance.chop(6, new int [] {1,3,5}));
  
        Assert.assertEquals(0,  instance.chop(1, new int [] {1,3,5,7}));
        Assert.assertEquals(1,  instance.chop(3, new int [] {1,3,5,7}));
        Assert.assertEquals(2,  instance.chop(5, new int [] {1,3,5,7}));
        Assert.assertEquals(3,  instance.chop(7, new int [] {1,3,5,7}));
        Assert.assertEquals(-1, instance.chop(0, new int [] {1,3,5,7}));
        Assert.assertEquals(-1, instance.chop(2, new int [] {1,3,5,7}));
        Assert.assertEquals(-1, instance.chop(4, new int [] {1,3,5,7}));
        Assert.assertEquals(-1, instance.chop(6, new int [] {1,3,5,7}));
        Assert.assertEquals(-1, instance.chop(8, new int [] {1,3,5,7}));
    }
    }
