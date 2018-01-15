package com.ckp.test.interperter.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Client {
	
	public static void main(String[] args) throws IOException {
		String exp = getExp();
		
		Map<String, Integer> varMap = getValue(exp);
		
		InterperEngine engine = new InterperEngine(exp);
		
		System.out.println(engine.run(varMap));
		
	}
	
	//获得表达式
	public static String getExp() throws IOException{
		System.out.println("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}
	
	public static Map<String, Integer> getValue(String exp) throws IOException{
		Map<String, Integer> varMap = new HashMap<String, Integer>();
		
		for (char ch : exp.toCharArray()) {
			if(ch != '+' && ch != '-' && ch != '*' && ch != '~'){
				if(!varMap.containsKey(String.valueOf(ch))){
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					varMap.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		
		return varMap;
	}

}
