class RandomizedSet {
    Map<Integer,Integer> mp;
    List<Integer> li;
    Random r;
    public RandomizedSet() {
        mp = new HashMap<>();
        li = new ArrayList<>();
        r = new Random();
    }

    public boolean insert(int val) {
        if(mp.containsKey(val)) return false;
        else{
            li.add(val);
            mp.put(val,li.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)) return false;
        else{
            int idx = mp.get(val);
            int lastval = li.get(li.size()-1);
            // Move last element to idx
            li.set(idx,lastval);
            mp.put(lastval,idx);
            // Remove last element from list
            li.remove(li.size()-1);
            // Remove val from map
            mp.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        int randomidx = r.nextInt(li.size());
        return li.get(randomidx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */