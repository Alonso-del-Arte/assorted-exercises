package games.rpg.inventory;

import org.junit.jupiter.api.Test;

/**
 * Test of the Weapon class.
 * @author Alonso del Arte
 */
class WeaponTest {

    @Test
    void testIsOneTimeUse() {
        System.out.println("isOneTimeUse");
        Weapon weapon = new WeaponImpl();
        String msg = "Weapon like dagger or sword should not be one-time use";
        assert !weapon.isOneTimeUse() : msg;
    }

    private static class WeaponImpl extends Weapon {}

}
