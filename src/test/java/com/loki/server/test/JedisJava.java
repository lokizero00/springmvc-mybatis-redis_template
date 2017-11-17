package com.loki.server.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class JedisJava {
	static Jedis jedis=null;
	public static void main(String[] args) {
		startRedis();
//		System.out.println("redis 存储的字符串为："+jedis.get("baidu"));
//		stringDemo();
//		listDemo();
		keyDemo();
		stopRedis();
	}
	
	private static void startRedis() {
		//连接Redis服务
		jedis=new Jedis("123.57.81.90");
		System.out.println("连接成功");
		//查看服务是否运行
		System.out.println("服务正在运行: "+jedis.ping());
	}
	
	private static void stopRedis() {
		jedis.close();
		jedis=null;
	}
	
	private static void stringDemo() {
		jedis.set("baidu", "www.baidu.com");
		System.out.println("redis 存储的字符串为："+jedis.get("baidu"));
	}
	
	private static void listDemo() {
		jedis.lpush("site-list", "Google");
		jedis.lpush("site-list", "Baidu");
		jedis.lpush("site-list", "Bing");
		List<String> list=jedis.lrange("site-list", 0, 2);
		for(String i:list) {
			System.out.println("列表项为："+i);
		}
	}
	
	private static void keyDemo() {
		Set<String> keys=jedis.keys("*");
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key);
		}
	}
}
