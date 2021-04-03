
package model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import exceptions.InvalidDayException;
import exceptions.YoungerException;

public class MiniMarketTest {

    private MiniMarket miniMarket;



    private void setupScenary() {
         miniMarket = new MiniMarket();
    }

    @Test
    public void testYounger() {

        setupScenary();

        String id = "TI";
        String number = "1006107372";

        try {
            miniMarket.verifyInput(id, number);
        } catch (YoungerException e) {
            assertTrue(true);
        } catch (InvalidDayException e) {
            assertTrue(false);
        }

        assertTrue(miniMarket.getPeopleInside().isEmpty());
        assertTrue(miniMarket.getCount() == 1);

    }


    @Test
    public void testInvalidDay() {

        setupScenary();

        String id = "CE";

        String day=String.valueOf(LocalDateTime.now().getDayOfMonth());

        String number = day+"1";

        try {
            miniMarket.verifyInput(id, number);
        } catch (YoungerException e) {
            assertTrue(false);
        } catch (InvalidDayException e) {
            assertTrue(true);
        }

        assertTrue(miniMarket.getPeopleInside().isEmpty());
        assertTrue(miniMarket.getCount() == 1);

        
    }


    @Test
    public void testRegisterPerson() {

        setupScenary();

        String id = "PA";


        String day=String.valueOf(LocalDateTime.now().getDayOfMonth()+1);

        String number = day+"1";

        try {
            miniMarket.verifyInput(id, number);
        } catch (YoungerException e) {
            assertTrue(false);
        } catch (InvalidDayException e) {
            assertTrue(false);
        }

        assertTrue(miniMarket.getPeopleInside().size()==1);
        assertTrue(miniMarket.getCount() == 1);

        
    }



}