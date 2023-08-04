package service;

import model.Dish;
import model.RestaurantInfo;
import java.util.List;

public interface RestaurantService {

    int addDish(String id, Dish dish);

    int removeDish(String id, Dish dish);

    List<Dish> getAllDishes(String id);

    RestaurantInfo getInformation(String id);

    int updateInfo(String id, RestaurantInfo info);
}
