class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {

        String[] arr1 = s1.split("[^a-z]+");
        String[] arr2 = s2.split("[^a-z]+");

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(String s : arr1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for(String s : arr2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        ArrayList<String> ans = new ArrayList<>();

        for(String s : map1.keySet()) {
            if(map1.get(s) == 1 && !map2.containsKey(s)) {
                ans.add(s);
            }
        }

        for(String s : map2.keySet()) {
            if(map2.get(s) == 1 && !map1.containsKey(s)) {
                ans.add(s);
            }
        }

        return ans.toArray(new String[0]);
    }
}