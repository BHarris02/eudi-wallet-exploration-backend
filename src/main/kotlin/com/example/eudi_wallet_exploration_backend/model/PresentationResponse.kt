package com.example.eudi_wallet_exploration_backend.model

/**
 * Represents the response returned by the Verifier after evaluating a credential presentation.
 *
 * Indicates whether the VP token submitted by the wallet was valid and satisfied the requirements of the
 * [PresentationDefinition]. A failed validation includes a human-readable [message] describing the reason for
 * rejection.
 */
data class PresentationResponse()
