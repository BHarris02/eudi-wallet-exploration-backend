package com.example.eudi_wallet_exploration_backend.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Represents a single credential type supported by the Issuer.
 *
 * Contained within [IssuerMetadata.credentialsSupported] to inform wallets of the available credential formats and the
 * claims each credential may contain.
 */
data class CredentialSupported(
    val format: String,
    val id: String,
    val claims: Map<String, Any>
)

/**
 * Represents the metadata exposed by the Issuer at the well-known discovery endpoint.
 *
 * Consumed by the wallet at the start of the OIDC4VCI flow to discover the issuer's supported credential types and the
 * URLs of its token and credential endpoints.
 *
 * Serialised as the response body of `GET /.well-known/openid-credential-issuer`.
 */
data class IssuerMetadata(
    @JsonProperty("credential_issuer")      val credentialIssuer: String,
    @JsonProperty("credential_endpoint")    val credentialEndpoint: String,
    @JsonProperty("token_endpoint")         val tokenEndpoint: String,
    @JsonProperty("credentials_supported")  val credentialsSupported: List<CredentialSupported>
)
