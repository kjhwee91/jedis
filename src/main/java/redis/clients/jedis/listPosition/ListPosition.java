package redis.clients.jedis.listPosition;

import redis.clients.util.SafeEncoder;

public class ListPosition {
	public enum LIST_POSITION {
		BEFORE, AFTER;
		public final byte[] raw;

		private LIST_POSITION() {
			raw = SafeEncoder.encode(name());
		}
	}
}
