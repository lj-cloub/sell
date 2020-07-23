package com.imook.sell;

import com.imook.pool.RedisPool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

/**
 * @ClassName RedisTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {
    @Test
    public void RedisTest(){
        RedisPool rp = new RedisPool();
        Jedis jedis = rp.getJedis();
        System.out.print(jedis.ping());
        jedis.set("wqwq","wqwq");
        System.out.println(jedis.get("wqwq"));
    }
}
