package com.example.eudi_wallet_exploration_backend.model

/**
 * Represents the key proof submitted bt the wallet as a part of a [CredentialRequest].
 *
 * The [jwt] is a signed JWT whose claims include the [TokenResponse.cNonce] received from the token endpoint, binding
 * the proof to this specific issuance session and preventing replay across sessions.
 */
data class CredentialProof()

/**
 * Represents the request body submitted by the wallet to the credential endpoint.
 *
 * Specifies the [format] of the requested credential and optionally includes a [proof] JWT demonstrating that the
 * wallet controls the private key associated with the public key it intends to bind to the issued credential.
 */
data class CredentialRequest()
