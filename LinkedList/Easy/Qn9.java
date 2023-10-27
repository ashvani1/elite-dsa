package LinkedList.Easy;
import java.util.*;

public class Qn9 //[consider it as a hash class link MyHashSet]
{
    private final int MAX_VALUE = 1000000;
    private final int ARRAY_SIZE = 100;
    private List<List<Integer>> buckets;

    public Qn9() {
        buckets = new ArrayList<>(ARRAY_SIZE);
        for(int i = 0; i < ARRAY_SIZE; i++) {
            buckets.add(null);
        }
    }

    public void add(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> bucketList = buckets.get(index);

        if(bucketList == null) {
            List<Integer> list = new LinkedList<>();
            list.add(key);
            buckets.set(index, list);
        }

        else {
            // buckets contains list with given index but list doesn't have given key
            if(!bucketList.contains(key)) {
                bucketList.add(key);
            }
        }
        //System.out.println("bucket size after add "+buckets.size());
    }

    public void remove(int key) {
        int index = key % ARRAY_SIZE;  //give index of bucket where the key can be available
        List<Integer> bucketList = buckets.get(index);

        if(bucketList != null) {
            bucketList.remove(Integer.valueOf(key));
        }


    }

    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;  //give index of bucket where the key can be available
        List<Integer> bucketList = buckets.get(index);
        return bucketList != null && bucketList.contains(key);

    }
}

/**
 * Your Qn9 object will be instantiated and called as such:
 * Qn9 obj = new Qn9();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
