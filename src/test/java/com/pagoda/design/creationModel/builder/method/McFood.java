package com.pagoda.design.creationModel.builder.method;

public class McFood {
    private int totalCount;     //份数
    private boolean addIce;     //饮料是否去冰
    private Hamburg hamburg;    //汉堡包
    private Drink drink;        //饮品
    private String remark;      //备注
    private boolean takeOut;    //是否外带

    public static class Hamburg {//汉堡包类
        public static final String HAMBURG_CHICKEN = "chicken";
        public static final String HAMBURG_BEEF = "beef";

        public Hamburg(String hamburgName) {
            this.hamburgName = hamburgName;
        }

        public String getHamburgName() {
            return hamburgName;
        }

        private String hamburgName;

        @Override
        public String toString() {
            return hamburgName ;
        }
    }

    public static class Drink {//饮品类
        public static final String DRINK_COLA = "cola";
        public static final String DRINK_SPRITE = "sprite";

        public Drink(String drinkName) {
            this.drinkName = drinkName;
        }

        private String drinkName;

        public String getDrinkName() {
            return drinkName;
        }

        @Override
        public String toString() {
            return drinkName;
        }
    }


    public static class Builder {
        private int totalCount = 0;
        private boolean addIce = false;
        private McFood.Hamburg hamburg = null;
        private McFood.Drink drink = null;
        private String remark = null;
        private boolean takeOut = false;

        public Builder totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder addIce(boolean addIce) {
            this.addIce = addIce;
            return this;
        }

        public Builder hamburg(McFood.Hamburg hamburg) {
            this.hamburg = hamburg;
            return this;
        }

        public Builder drink(McFood.Drink drink) {
            this.drink = drink;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder takeOut(boolean takeOut) {
            this.takeOut = takeOut;
            return this;
        }

        public McFood create() { // 构建，返回一个新对象
            return new McFood(this);
        }

    }

    public McFood(Builder builder) {
        this.totalCount = builder.totalCount;
        this.addIce = builder.addIce;
        this.hamburg = builder.hamburg;
        this.drink = builder.drink;
        this.remark = builder.remark;
        this.takeOut = builder.takeOut;
    }

    @Override
    public String toString() {
        return "McFood{" +
                "totalCount=" + totalCount +
                ", addIce=" + addIce +
                ", hamburg=" + hamburg +
                ", drink=" + drink +
                ", remark='" + remark + '\'' +
                ", takeOut=" + takeOut +
                '}';
    }
}
