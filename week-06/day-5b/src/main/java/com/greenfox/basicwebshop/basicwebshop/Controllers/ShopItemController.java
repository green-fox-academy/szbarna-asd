package com.greenfox.basicwebshop.basicwebshop.Controllers;

import com.greenfox.basicwebshop.basicwebshop.Models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class ShopItemController {
    private List<ShopItem> shopItemList = new ArrayList<>();
    private ShopItem item1;
    private ShopItem item2;
    private ShopItem item3;

    public ShopItemController() {
        shopItemList.add(item1 = new ShopItem("Valami1", "Valamik1", 10, 1000));
        shopItemList.add(item2 = new ShopItem("Valami2", "Valamik2nike", 102, 0));
        shopItemList.add(item3 = new ShopItem("Valami3", "Valamik3", 1003, 1000));
        shopItemList.add(item3 = new ShopItem("Valami4", "Valamik4 nike", 1003, 0));
    }

    @GetMapping("/webshop")
    public String accountList(Model model) {
        model.addAttribute("itemList", shopItemList);

        return "index";
    }

    @GetMapping("/available")
    public String onlyAvailable(Model model) {
        model.addAttribute("itemList",getOnlyAvailable(shopItemList) );

        return "available";
    }

    @GetMapping("/list-by-price")
    public String listByPrice(Model model) {
        model.addAttribute("itemList",getListByPrice(shopItemList) );

        return "list-by-price";
    }

    @GetMapping("/contains-nike")
    public String nikeList(Model model) {
        model.addAttribute("itemList", containsNike(shopItemList) );

        return "contains-nike";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("itemList", getAverageStock(shopItemList) );

        return "average";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("itemList", getMostExpensive(shopItemList) );

        return "most-expensive";
    }

    private List<ShopItem> getOnlyAvailable(List<ShopItem> list) {
        return list
                .stream()
                .filter(item -> item.getAmount() > 0)
                .collect(Collectors.toList());
    }

    private List<ShopItem> getListByPrice(List<ShopItem> list) {
        return list
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private List<ShopItem> containsNike(List<ShopItem> list) {
        return list.stream()
                .filter(item -> item.getNameAndDescription().contains("nike"))
                .collect(Collectors.toList());
    }
    private double getAverageStock(List<ShopItem> list) {
        return list.stream()
                .mapToLong(ShopItem::getAmount)
                .average()
                .getAsDouble();
    }
    private Optional<ShopItem> getMostExpensive(List<ShopItem> list) {

        return list.stream()
                 .max(Comparator.comparing(ShopItem::getPrice));
    }
}
