package com.example.eudi_wallet_exploration_backend.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.security.KeyPair
import java.security.KeyPairGenerator

/**
 * A Spring `@Configuration` class that creates the application's key pair as a singleton `@Bean`.
 *
 * By centralising key creation here, all services that need to sign or verify JWTs receive the same key pair via
 * dependency injection rather than each generating their own.
 */
@Configuration
class CryptoConfig {
    @Bean
    fun issueKeyPair(): KeyPair =
        KeyPairGenerator.getInstance("EC").apply {
            initialize(256)
        }.generateKeyPair()
}
