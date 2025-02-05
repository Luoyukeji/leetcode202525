import java.util.*;

public class Main {
    //  给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
    public static void main(String[] args) {
        Main main = new Main();

        String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println( main.groupAnagrams(strs)
);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            //将字符串转换为字符数组并排序，生成唯一的键

            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            //将原始字符按照键分组

            //用来检查 map 中是否已经存在指定的 key。如果 map 中已经有这个键，则返回 true，否则返回 false。
            if (!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}