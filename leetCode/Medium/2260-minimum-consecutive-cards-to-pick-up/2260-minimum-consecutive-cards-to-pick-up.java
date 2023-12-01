class Solution {
    public int minimumCardPickup(int[] cards) {
        if(cards.length == 1) return -1;

        //key는 값, value는 인덱스
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(cards[0], 0);

        int min = 100001;

        for(int i=1; i<cards.length; i++) {
            if(map.containsKey(cards[i])) {
                int lastIdx = map.get(cards[i]);
                min = Math.min(i-lastIdx+1, min);
            }
            map.put(cards[i], i);
        }
        return min == 100001 ? -1 : min;
    }
}