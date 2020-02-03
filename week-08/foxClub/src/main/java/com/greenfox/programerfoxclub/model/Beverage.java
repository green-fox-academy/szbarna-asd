package com.greenfox.programerfoxclub.model;

public enum Beverage {
    WATER {
        @Override
        public String toString() {
            return "water";
        }
    },
    LEMONADE {
        @Override
        public String toString() {
            return "lemonade";
        }
    },
    COKE {
        @Override
        public String toString() {
            return "coke";
        }
    },
    BEER {
        @Override
        public String toString() {
            return "beer";
        }
    },
    SPRITE {
        @Override
        public String toString() {
            return "sprite";
        }
    },
    PIZZA {
        @Override
        public String toString() {
            return "pizza";
        }
    },
    HOTDOG {
        @Override
        public String toString() {
            return "hot-dog";
        }
    },
    SALAD {
        @Override
        public String toString() {
            return "salad";
        }
    },
    SHIT {
    @Override
    public String toString() {
        return "shit";
    }
    }
}
