package com.example.eudi_wallet_exploration_backend.model

/**
 * Represents the response returned by the credential endpoint after successful issuance.
 *
 * Contains the issued verifiable credential as a serialised JWT string in [credentials].
 * The [format] field identifies the credential format &mdash; in this implementation, `vc+sd-jwt`.
 */
data class CredentialResponse()
