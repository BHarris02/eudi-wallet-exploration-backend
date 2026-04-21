package com.example.eudi_wallet_exploration_backend.controller

import com.example.eudi_wallet_exploration_backend.model.IssuerMetadata
import com.example.eudi_wallet_exploration_backend.service.IssuerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * A `@RestController` exposing `GET /.well-known/openid-credential-issuer`.
 *
 * Returns an `IssuerMetadata` response body describing the credential type the Issuer supports and the URLs of its
 * endpoints. Has no logic &mdash; immediately delegates to `IssuerService`.
 */
@RestController
class IssuerMetadataController(private val issuerService: IssuerService) {
    @GetMapping("/.well-known/openid-credential-issuer")
    fun getMetadata(): IssuerMetadata = issuerService.getMetadata()
}
