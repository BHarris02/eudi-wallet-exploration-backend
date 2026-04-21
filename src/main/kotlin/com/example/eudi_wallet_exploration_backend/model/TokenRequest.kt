package com.example.eudi_wallet_exploration_backend.model

/**
 * Represents the form-encoded token request submitted by the wallet to the token endpoint.
 *
 * Used during the pre-authorised code flow to exchange a one-time code for an access token and a
 * [TokenResponse.cNonce]. The [grantType] must be `urn:ietf:params:grant-type:pre-authorized_code`.
 */
data class TokenRequest()
