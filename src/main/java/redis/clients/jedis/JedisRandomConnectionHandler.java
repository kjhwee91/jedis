package redis.clients.jedis;

import java.util.Set;

import redis.clients.host.HostAndPort;

public class JedisRandomConnectionHandler extends JedisClusterConnectionHandler {

    public JedisRandomConnectionHandler(Set<HostAndPort> nodes) {
	super(nodes);
    }

    public Jedis getConnection() {
	return getRandomConnection().getResource();
    }

    @Override
    Jedis getConnectionFromSlot(int slot) {
	return getRandomConnection().getResource();
    }
}
