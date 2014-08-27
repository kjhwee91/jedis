package redis.clients.jedis.pipelineUtil;

import redis.clients.jedis.client.Client;

@Deprecated
/**
 * This method is deprecated due to its error prone with multi
 * and will be removed on next major release
 * @see https://github.com/xetorthio/jedis/pull/498
 */
public abstract class PipelineBlock extends Pipeline {
    // For shadowing
    @SuppressWarnings("unused")
    private Client client;

    public abstract void execute();
}
