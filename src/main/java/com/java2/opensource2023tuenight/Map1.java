package com.java2.opensource2023tuenight;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapAB_marc(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
    public Map<String, String> mapAB3_andres(Map<String, String> map){
        if(map.containsKey("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        }
        if(map.containsKey("b") && !map.containsKey("a")){
            map.put("a", map.get("b"));
        }
        return map;
    }



}
