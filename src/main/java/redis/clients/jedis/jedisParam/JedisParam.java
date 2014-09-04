package redis.clients.jedis.jedisParam;

import java.util.List;

public class JedisParam {
	public static String[] getParams(List<String> keys, List<String> args) {
		int keyCount = keys.size();
		int argCount = args.size();

		String[] params = new String[keyCount + args.size()];

		for (int i = 0; i < keyCount; i++)
			params[i] = keys.get(i);

		for (int i = 0; i < argCount; i++)
			params[keyCount + i] = args.get(i);

		return params;
	}

	public static byte[][] getParams(List<byte[]> keys, List<byte[]> args) {
		int keyCount = keys.size();
		int argCount = args.size();
		byte[][] params = new byte[keyCount + args.size()][];

		for (int i = 0; i < keyCount; i++)
			params[i] = keys.get(i);

		for (int i = 0; i < argCount; i++)
			params[keyCount + i] = args.get(i);

		return params;
	}
}
