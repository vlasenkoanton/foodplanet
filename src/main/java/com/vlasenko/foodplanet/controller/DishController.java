package com.vlasenko.foodplanet.controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dishes")
public class DishController {

    @RequestMapping(value = "/loadAll", method = RequestMethod.POST)
    @ResponseBody
    public String loadAll() {
        return String.valueOf(getAllDishes());
    }

    private JsonArray getAllDishes() {
        JsonArray dishes = new JsonArray();

        JsonObject diflope = new JsonObject();
        diflope.addProperty("name", "diflope");
        diflope.addProperty("price", 500);
        diflope.addProperty("weight", 300);

        JsonObject makarohi = new JsonObject();
        makarohi.addProperty("name", "makarohi");
        makarohi.addProperty("price", 12);
        makarohi.addProperty("weight", 1500);

        dishes.add(diflope);
        dishes.add(makarohi);
        return dishes;
    }
}
