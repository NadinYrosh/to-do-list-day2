import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {
  @After
  public void tearDown() {
    Category.clear();
    Task.clear();
  }

  @Test
  public void category_instantiatesCorrectly_true() {
    Category testCategory = new Category("Home");
    assertEquals(true, testCategory instanceof Category);
  }

  @Test
  public void getName_categoryInstatiatesWithName_Home() {
    Category testCategory = new Category("Home");
    assertEquals("Home", testCategory.getName());
  }
}
