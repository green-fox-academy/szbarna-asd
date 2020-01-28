package com.greenfox.basicwebshop.basicwebshop.Controllers;

import com.greenfox.basicwebshop.basicwebshop.Models.ProductType;
import com.greenfox.basicwebshop.basicwebshop.Models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class ShopItemController {
    private List<ShopItem> shopItemList = new ArrayList<>();

    public ShopItemController() {
        shopItemList.add(new ShopItem("Valami1", "Valamik1", 10, 1000, ProductType.ELECTRONIC));
        shopItemList.add(new ShopItem("Valami2", "Valamik2nike", 102, 0, ProductType.FOOD));
        shopItemList.add(new ShopItem("Valami3", "Valamik3", 1003, 1000, ProductType.WEAR));
        shopItemList.add(new ShopItem("Valami4", "Valamik4 nike", 1003, 0, ProductType.FOOD));
    }

    @GetMapping("/webshop")
    public String accountList(Model model) {
        model.addAttribute("itemList", shopItemList);
        model.addAttribute("text", "Items");

        return "index";
    }

    @GetMapping("/available")
    public String onlyAvailable(Model model) {
        model.addAttribute("itemList",getOnlyAvailable(shopItemList));
        model.addAttribute("text", "List Of Available Item(s)");

        return "index";
    }

    @GetMapping("/list-by-price")
    public String listByPrice(Model model) {
        model.addAttribute("itemList",getListByPrice(shopItemList));
        model.addAttribute("text", "List Of Item(s) By Price");

        return "index";
    }

    @GetMapping("/contains-nike")
    public String nikeList(Model model) {
        model.addAttribute("itemList", containsNike(shopItemList));
        model.addAttribute("text", "List Of Nike Item(s)");

        return "index";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("average", getAverageStock(shopItemList));

        return "average";
    }

    @GetMapping("/most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("itemList", getMostExpensive(shopItemList));
        model.addAttribute("text", "List Of Most Expensive Item(s)");

        return "index";
    }

    @PostMapping("/search")
    public String searchForItem(Model model, String expression) {
        model.addAttribute("itemList",searchForItem(shopItemList, expression));
        model.addAttribute("text", "List Of Searched Item(s)");

        return "index";
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
                .orElse(0);
    }
    private List<ShopItem> getMostExpensive(List<ShopItem> list) {
        List<ShopItem> mostExpensive = new ArrayList<>();
        Optional<ShopItem> optionalShopItem = list.stream()
                .filter(item -> item.getAmount() > 0)
                .max(Comparator.comparing(ShopItem::getPrice));
        optionalShopItem.ifPresent(mostExpensive::add);
        return mostExpensive;
    }
    private List<ShopItem> searchForItem(List<ShopItem> list, String expressionToLookFor) {

        return list.stream()
                .filter(item -> item.getNameAndDescription().contains(expressionToLookFor))
                .collect(Collectors.toList());

    }


}

