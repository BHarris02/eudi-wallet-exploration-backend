package com.example.eudi_wallet_exploration_backend.service

import com.example.eudi_wallet_exploration_backend.model.IssuerMetadata
import org.springframework.stereotype.Service

/**
 * Responsible for the credential offer lifecycle. Generates pre-authorised codes (random UUID strings), stores them
 * in `TokenStore`, and builds the `CredentialOffer` response structure. Also provides the `IssuerMetadata` response.
 * Contains no crypto.
 */
@Service
class IssuerService {
    fun getMetadata(): IssuerMetadata = IssuerMetadata(
        credentialIssuer = "",
        credentialEndpoint = "",
        tokenEndpoint = "",
        credentialsSupported = emptyList()
    )
}
