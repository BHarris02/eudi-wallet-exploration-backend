package com.example.eudi_wallet_exploration_backend.crypto

import org.springframework.stereotype.Service

/**
 * A `@Service` that wraps Nimbus JOSE + JWT. Receives the `KeyPair` bean via constructor injection. Exposes two
 * methods:
 *
 * - `sign(claims: JWTClaimsSet): String` &mdash; signs claims with the issuer's private key and returns the
 * serialized JWT
 * - `verify(jwt: String, publicKey: PublicKey): JWTClaimsSet` &mdash; verifies a JWT signature and returns the claims
 * if valid
 *
 * All raw Nimbus usage is confined to this class. Nothing else in the application touches Nimbus directly.
 */
@Service
class CryptoService {
}