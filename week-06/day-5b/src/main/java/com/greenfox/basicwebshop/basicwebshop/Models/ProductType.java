package com.greenfox.basicwebshop.basicwebshop.Models;

public enum ProductType {
    ELECTRONIC {
        @Override
        public String toString() {
            return "Electronics";
        }
    },
    FOOD {
        @Override
        public String toString() {
            return "Beverages and Snack";
        }
    },
    WEAR {
        @Override
        public String toString() {
            return "Clothes and shoes";
        }
    }
}
