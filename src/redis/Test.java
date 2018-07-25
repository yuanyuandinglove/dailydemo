package redis;

import redis.clients.jedis.Jedis;

public class Test {
    public  static  void main(String args[]){
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("username","123");
        jedis.set("password","456");
        jedis.set("haha","123hahah");

        String value  = jedis.get("username");

        System.out.println("this is test: "  + value);
    }
}
