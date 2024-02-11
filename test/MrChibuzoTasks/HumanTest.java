package MrChibuzoTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    public void testForHumanAge(){
        Human human = new Human();
        human.setAge(15);
        assertEquals(15,human.getAge());
    }
    @Test
    public void testForHumaHeight(){
        Human human = new Human();
        human.setHeight(5.6);
        assertEquals(5.6,human.getHeight());
    }
    @Test
    public void testIfHumanHasAName(){
        Human human = new Human();
        human.setName("john");
        Assertions.assertNotNull("john",human.getName());
    }

}