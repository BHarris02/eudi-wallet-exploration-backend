package com.example.eudi_wallet_exploration_backend.store

import org.springframework.stereotype.Component

/**
 * A `@Component` backend by a thread-safe `ConcurrentHashMap`. Stores mappings between pre-authorised codes, access
 * tokens, and c_nonces. Provides `storeCode()`, `validateCode()`, `storeToken()`, `validateToken()`, and `getNonce()`
 * methods. No persistence &mdash; state is lost on restart, which is fine for exploration.
 */
@Component
class TokenStore {
}