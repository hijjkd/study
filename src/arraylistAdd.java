import leetcode.Food;

import java.util.*;

public class arraylistAdd {
    public static void main(String[] args) {

        List<Long> sortOrderIds = new ArrayList<>();//网络请求获取数据

        sortOrderIds.add(2l);
        sortOrderIds.add(4l);
        sortOrderIds.add(1l);
        sortOrderIds.add(3l);
        sortOrderIds.add(5l);
        sortOrderIds.add(6l);


        Map<Long, Integer> map = new LinkedHashMap<>();

        for (Long id : sortOrderIds
        ) {
            map.put(id, 1);
        }


        ArrayList<Food> foodList = new ArrayList<>();//结果
        Food food1 = new Food(1L, "水果", 3l);
        Food food2 = new Food(2L, "蔬菜", 4l);
        Food food3 = new Food(3L, "蔬菜", 5l);
        Food food4 = new Food(4L, "蔬菜", 6l);
        Food food5 = new Food(5l, "鸡蛋", 3l);
        Food food6 = new Food(6l, "面", 4l);


//


        foodList.add(food1);
        foodList.add(food2);
//        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
       foodList.add(food4);
//
//
//
        foodList.add(food5);
//        Map<Long,Food> tempFoodList = new LinkedHashMap<>();
//
//        for (Food food:foodList
//             ) {
//
//            tempFoodList.put(food.id,food);
//        }
//
//
//        ArrayList<Food> resultFood = new ArrayList<>();//结果
////        int sorted = 0;
//        for (int i = 0; i < sortOrderIds.size(); i++) {//排序，多或者少的问题
//            if (tempFoodList.containsKey(sortOrderIds.get(i))) {
//                resultFood.add(tempFoodList.get(sortOrderIds.get(i)));
//              tempFoodList.remove(sortOrderIds.get(i));
//            }
//        }
//        for (Map.Entry<Long,Food> entry:tempFoodList.entrySet()
//             ) {
//
//
//            resultFood.add(entry.getValue());
//        }

//        ArrayList<Food> resultSortFoods = new ArrayList<>();

        Map<Long, Food> tempFoodList = new LinkedHashMap<>();
        for (Food food : foodList) {
            tempFoodList.put(food.id, food);
        }

        ArrayList<Food> resultFood = new ArrayList<>();
        for (int i = 0; i < sortOrderIds.size(); i++) {
            Long needSortId = sortOrderIds.get(i);
            if (tempFoodList.containsKey(needSortId)) {
                resultFood.add(tempFoodList.get(needSortId));
                tempFoodList.remove(needSortId);
            }
        }


//        for (Food food : resultFood
//        ) {
//            System.out.println(food.id);
//        }


        TreeSet<Food> treeSet = new TreeSet<>();

        for (Food food : foodList
        ) {

            treeSet.add(food);

        }
        System.out.println(treeSet);

    }

}




