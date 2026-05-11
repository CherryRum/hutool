package cn.hutool.crypto.sign.http;

import cn.hutool.core.util.IdUtil;

import java.util.UUID;

/**
 * Nonce生成器。
 *
 * @author mumu
 * @since 5.8.45
 */
public interface NonceGenerator {

	/**
	 * UUID Nonce生成器。
	 */
	NonceGenerator UUID_GENERATOR = IdUtil::fastUUID;

	/**
	 * 生成Nonce。
	 *
	 * @return Nonce
	 */
	String generateNonce();
}
