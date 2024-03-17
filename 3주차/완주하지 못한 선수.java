import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();
        String answer = null;

        for(String key : participant) {
            map.put(key,map.getOrDefault(key,0)+1);
        }

        for(String key : completion) {
            map.put(key,map.getOrDefault(key,0)-1);
        }

        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}