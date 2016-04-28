import java.util.ArrayList;

public class Category {
  String mName;
  int mId;
  private static ArrayList<Category> instances = new ArrayList<Category>();

  public Category(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public  static ArrayList<Category> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }
}
