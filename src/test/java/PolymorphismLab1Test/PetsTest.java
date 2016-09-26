package PolymorphismLab1Test;

import PolymorphismLab1.Cat;
import PolymorphismLab1.Dog;
import PolymorphismLab1.Pets;
import PolymorphismLab1.Pig;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;
/**
 * Created by abijah on 9/26/16.
 */
public class PetsTest {

    Pets testPet;
    Dog testDog;
    Cat testCat;
    Pig testPig;



    @Before
    public void animalsToTest() {
        this.testPet = new Pets();
        this.testDog = new Dog();
        this.testCat = new Cat();
        this.testPig = new Pig();
    }

    @Test
    public void dogSpeakTest() {
        assertEquals("Dogs should say", "Woof, Woof", testDog.speak());
    }

    @Test
    public void catSpeakTest() {
        assertEquals("Cats should say", "Meow!", testCat.speak());
    }

    @Test
    public void pigSpeakTest() {assertEquals("Pigs say", "Oink, OinK!!!", testPig.speak());}

    @Test
    public void dogSubclassPet(){
        assertThat(testDog, instanceOf(Pets.class));
    }
  @Test
    public void getnumberTest(){

  }


}
