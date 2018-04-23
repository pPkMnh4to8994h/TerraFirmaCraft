package net.dries007.tfc.objects;

public enum Agriculture
{
    CROP,
    FRUITTREE,
    BERRYBUSH,
    ;

    public enum Crop
    {
        BARLEY(Category.TEMPERATE),
        OAT(Category.TEMPERATE),
        RICE(Category.TEMPERATE),
        RYE(Category.TEMPERATE),
        WHEAT(Category.TEMPERATE),
        REDBELLPEPPER(Category.TEMPERATE),
        YELLOWBELLPEPPER(Category.TEMPERATE),
        CABBAGE(Category.TEMPERATE),
        CARROT(Category.TEMPERATE),
        GARLIC(Category.TEMPERATE),
        GREENBEAN(Category.TEMPERATE),
        MAIZE(Category.TEMPERATE),
        ONION(Category.TEMPERATE),
        RUTABAGA(Category.TEMPERATE),
        POTATO(Category.TEMPERATE),
        SOYBEAN(Category.TEMPERATE),
        SQUASH(Category.TEMPERATE),
        TOMATO(Category.TEMPERATE),
        JUTE(Category.TEMPERATE),
        ;

        public final Category category;

        Crop(Agriculture.Category category)
        {
            this.category = category;
        }
    }

    public enum FruitTree {
        BANANA(Category.TEMPERATE),
        CHERRY(Category.TEMPERATE),
        GREEN_APPLE(Category.TEMPERATE),
        LEMON(Category.TEMPERATE),
        OLIVE(Category.TEMPERATE),
        ORANGE(Category.TEMPERATE),
        PEACH(Category.TEMPERATE),
        PLUM(Category.TEMPERATE),
        RED_APPLE(Category.TEMPERATE),
        ;

        public final Category category;

        FruitTree(Agriculture.Category category) {
            this.category = category;
        }
    }

    public enum BerryBush {
        BLACKBERRY(Category.TEMPERATE),
        BLUEBERRY(Category.TEMPERATE),
        BUNCHBERRY(Category.TEMPERATE),
        CLOUDBERRY(Category.TEMPERATE),
        CRANBERRY(Category.TEMPERATE),
        ELDERBERRY(Category.TEMPERATE),
        GOOSEBERRY(Category.TEMPERATE),
        RASPBERRY(Category.TEMPERATE),
        SNOWBERRY(Category.TEMPERATE),
        STRAWBERRY(Category.TEMPERATE),
        WINTERGREENBERRY(Category.TEMPERATE),
        ;

        public final Category category;

        BerryBush(Agriculture.Category category) {
            this.category = category;
        }
    }

        public enum Category {
        //TEMPERATURE FOR SPAWNING AND GROWING todo set temperature categories.
        COLD,
        COOL,
        TEMPERATE,
        WARM,
        HOT,
        ;
    }
}
