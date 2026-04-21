package com.example.eudi_wallet_exploration_backend.model

/**
 * Represents the response returned by the token endpoint after a successful code exchange.
 *
 * Contains the [accessToken] the wallet uses to authenticate its credential request, and a [cNonce] the wallet must
 * include in its key proof JWT to demonstrate possession of the private key it is registering with the issuer.
 */
data class TokenResponse()
