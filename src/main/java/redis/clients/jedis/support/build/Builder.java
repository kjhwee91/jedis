package redis.clients.jedis.support.build;

public abstract class Builder<T> {
    public abstract T build(Object data);
}
