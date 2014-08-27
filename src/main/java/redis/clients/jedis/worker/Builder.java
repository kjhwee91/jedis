package redis.clients.jedis.worker;

public abstract class Builder<T> {
    public abstract T build(Object data);
}
