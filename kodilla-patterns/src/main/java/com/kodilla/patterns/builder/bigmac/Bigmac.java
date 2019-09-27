package com.kodilla.patterns.builder.bigmac;

import com.sun.org.apache.xerces.internal.impl.dv.dtd.NOTATIONDatatypeValidator;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final Integer burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun = "";
        private Integer burgers = 0;
        private String sauce = "";
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(Integer burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder mustardSauce() {
                this.sauce = "sos musztardowy";
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
                ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {




            return new Bigmac(bun,burgers,sauce,ingredients);
        }

    }

    private Bigmac(final String bun,final Integer burgers,final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public Integer getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients.toString() +
                '}';
    }
}
