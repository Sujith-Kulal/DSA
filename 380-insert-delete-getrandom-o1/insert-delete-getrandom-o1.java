import java.util.*;

public class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(index, lastElement);
        map.put(lastElement, index);

        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }

    
    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.insert(1));    
        System.out.println(set.remove(2));    
        System.out.println(set.insert(2));    
        System.out.println(set.getRandom());  
        System.out.println(set.remove(1));    
        System.out.println(set.insert(2));    
        System.out.println(set.getRandom());  
    }
}
