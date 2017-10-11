package it.itspiemonte.feedmeproject.data;

import android.provider.BaseColumns;

public class Contract {
    //Restaurant
public static final class RestaurantEntry implements BaseColumns {
    public static final String TABLE_NAME = "restaurant";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ID_MENU = "menu";
    public static final String COLUMN_POSITION = "position";
    public static final String COLUMN_TIMES = "times";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_WEB = "web";

}
//User
    public static final class UserEntry implements BaseColumns {
        public static final String TABLE_NAME = "user";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_PASSWORD = "password";
        public static final String COLUMN_CREDIT_CARD = "creditCard";

    }
    //Categories
    public static final class CategoriesEntry implements BaseColumns {
        public static final String TABLE_NAME = "categories";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_ID_MENU = "menu";

    }
    //Product
    public static final class ProductEntry implements BaseColumns {
        public static final String TABLE_NAME = "product";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_ID_CATEGORIES = "categorie";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_PRICE = "price";


    }
    //Menu
    public static final class MenuEntry implements BaseColumns {
        public static final String TABLE_NAME = "menu";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_DESCRIPTION = "description";

    }
    //Favorites
    public static final class FavoritesEntry implements BaseColumns {
        public static final String TABLE_NAME = "favorites";

        public static final String COLUMN_ID_USER = "user";
        public static final String COLUMN_ID_RESTAURANT = "restaurant";


    }
    //Review
    public static final class ReviewEntry implements BaseColumns {
        public static final String TABLE_NAME = "review";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_VALUTATION = "valutation";
        public static final String COLUMN_ID_RESTAURANT = "restaurant";
        public static final String COLUMN_ID_USER = "user";

    }

}
