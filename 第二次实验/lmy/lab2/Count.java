package lmy.lab2;

import java.util.HashMap;
import java.util.Set;

public class Count {
	public static void main(String[] args) throws Exception {
		String inputPath = "D:\\input.txt";
		String outputPath = "D:\\output.txt";
		String[] keys = finish(inputPath);
		HashMap<String,Integer> counts = getMap(inputPath);
		output(counts, keys, outputPath);
	}
	
	public static String[] finish(String path) {
		String content = Files.readString(path);
		String[] words = getArray(content);
		HashMap<String,Integer> counts = count(words);
		String[] sorts = sort(counts);
		return sorts;
	}
	
	public static String[] getArray(String content) {
		String[] result = content.split(" ");
		return result;
	}
	
	public static HashMap<String,Integer> getMap(String path) {
		String content = Files.readString(path);
		String[] words = getArray(content);
		HashMap<String,Integer> counts = count(words);
		return counts;
	}
	
	public static HashMap<String,Integer> count(String[] words){
		HashMap<String,Integer> counts = new HashMap<String,Integer>();
		int num = words.length;
		for(int i = 0 ; i < num ; i ++) {
			if(words[i].equals("")) {
				continue;
			}
			
			if(counts.containsKey(words[i])) {
				counts.put(words[i], counts.get(words[i]) + 1);
			} else {
				counts.put(words[i], 1);
			}
		}
		return counts;
	}
	
	/*
	 * 自己瞎写的奇怪排序
	 */
	public static String[] sort(HashMap<String,Integer> count) {
		Set<String> keys = count.keySet();
		int num = keys.size();
		Integer[] count_num = new Integer[num];
		String[] count_key = new String[num];
		num = 0;
		for (String thisKey : keys) {
		      count_num[num] = count.get(thisKey);
		      count_key[num] = thisKey;
		      num ++;
		}
		for(int i = 0 ; i < num ; i ++) {
			for(int j = 0 ; j < num - 1 ; j ++) {
				if(count_num[j] < count_num[j + 1]) {
					int temp = count_num[j];
					count_num[j] = count_num[j + 1];
					count_num[j + 1] = temp;
					
					String tempS = count_key[j];
					count_key[j] = count_key[j + 1];
					count_key[j + 1] = tempS;
				}
			}
			
		}
		return count_key;
	}
	
	/*
	** 按行输出到output
	*/
	public static void output(HashMap<String,Integer> count, String[] order, String path) {
		int num = order.length;
		String[] result = new String[num];
		for(int i = 0 ; i < num ; i ++) {
			//System.out.println(order[i] + " " + count.get(order[i]));
			result[i] = order[i] + " " + count.get(order[i]);
		}
		Files.fileWriter(result,path);
	}
}