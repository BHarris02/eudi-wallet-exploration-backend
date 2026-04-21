package com.example.eudi_wallet_exploration_backend.service

import org.springframework.stereotype.Service

/**
 * Responsible for both sides of the presentation flow. `generatePresentationRequest()` constructs a
 * `PresentationDefinition` requiring the `age_over_18` claim, generates a nonce, stores it in `NonceStore`, and
 * returns the authorisation request URL. `validatePresentation()` parses the VP token JWT, verifies the signature,
 * checks the nonce, and asserts the required claim is present.
 */
@Service
class VerifierService {
}