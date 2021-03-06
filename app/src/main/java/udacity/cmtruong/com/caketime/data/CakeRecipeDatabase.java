package udacity.cmtruong.com.caketime.data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

@Database(version = CakeRecipeDatabase.VERSION)
public final class CakeRecipeDatabase {


    public static CakeRecipeDatabase getInstance() {
        return new CakeRecipeDatabase();
    }

    public static final int VERSION = 2;

    @Table(IngredientsColumns.class)
    public static final String INGREDIENTS = "ingredients";

    @Table(CakeRecipeColumns.class)
    public static final String CAKE_RECIPES = "cake_recipe";


}
