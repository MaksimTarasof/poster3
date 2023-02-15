import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void test() {
        PosterManager manager = new PosterManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        PosterManager manager = new PosterManager();
        manager.add("Film IV");
        String[] expected = {"Film IV"};
        String[] actual = manager.findALast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        PosterManager manager = new PosterManager();
        manager.add("Film V");
        String[] expected = {"Film V"};
        String[] actual = manager.findALast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        PosterManager manager = new PosterManager();
        manager.add("Film VI");
        String[] expected = {"Film VI"};
        String[] actual = manager.findALast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test5() {
        PosterManager manager = new PosterManager();
        manager.add("Film VII");
        String[] expected = {"Film VII"};
        String[] actual = manager.findALast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test6() {
        PosterManager manager = new PosterManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findALast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
