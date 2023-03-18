package FastFoodMenu;

import java.util.List;
import java.util.ArrayList;

public class Menu {

    private static Menu instance = null;

    private List<String> FastfoodMenu;

    private Menu(){
        FastfoodMenu = new ArrayList<>();
        FastfoodMenu.add("Yumburger");
        FastfoodMenu.add("Burger Steak");
        FastfoodMenu.add("Fried Chicken with Spaghetti");
        FastfoodMenu.add("Fries with Yumburger");
        FastfoodMenu.add("Coca Cola");
    }

    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }
        return instance;
    }
    public List<String> getFastfoodMenu(){
        return  FastfoodMenu;
    }
    public void addFastfoodMenu(String item){
        FastfoodMenu.add(item);
    }

}
