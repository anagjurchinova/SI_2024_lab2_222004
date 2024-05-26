package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void EveryBranchMethod(){

        RuntimeException ex;
        List<Item> items = null;
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items,5));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        List<Item> items1= Arrays.asList(new Item("Bluza","A",400,10.0f));
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items1,200));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        List<Item> items5 = Arrays.asList(new Item("Pernica","1212",470,20.0f));
        assertFalse(SILab2.checkCart(items5,290));

        List<Item> items3 = Arrays.asList(new Item("Shnola","989",50,0.0f));
        assertTrue(SILab2.checkCart(items3,55));

        List<Item> items4 = Arrays.asList(new Item("","001",500,20.0f));
        assertFalse(SILab2.checkCart(items4,150));

        List<Item> items2= Arrays.asList(new Item("Kniga",null,120,5.0f));
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items2,60));
        assertTrue(ex.getMessage().contains("No barcode!"));
    }
    @Test
    public void MultipleConditionMethod(){

        List<Item> items = Arrays.asList(new Item("Anything", "123", 200, 0.1f));
        assertTrue(SILab2.checkCart(items,30));// F && X && X

        List<Item> items01 = Arrays.asList(new Item("Item01", "1234", 300, 0.0f));
        assertTrue(SILab2.checkCart(items01,350));//T && F && X

        List<Item> items02= Arrays.asList(new Item("Item02", "0123", 360, 0.1f));
        assertTrue(SILab2.checkCart(items02,305));//T && T && T

    }
}