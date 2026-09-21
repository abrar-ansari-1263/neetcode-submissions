class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted)){
                List<String> list = map.get(sorted);
                list.add(s);
                map.put(sorted,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted,list);
            }
        }
        return new ArrayList(map.values());

    }
}
