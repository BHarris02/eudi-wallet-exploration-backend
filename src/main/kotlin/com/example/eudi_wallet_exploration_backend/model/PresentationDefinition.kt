package com.example.eudi_wallet_exploration_backend.model

/**
 * Specifies a single claim constraint within a [Constraints] block.
 *
 * The [path] is a list of JSONPath expressions targeting the claim within the credential (e.g. `["$.age_over_18"]`).
 * The optional [filter] asserts a required value or type for the claim at that path.
 */
data class Field()

/**
 * Specifies the field-level constraints a credential must satisfy to match an [InputDescriptor].
 *
 * Contains a list of [fields], each targeting a specific claim path within the credential and optionally applying a
 * filter to assert its value.
 */
data class Constraints()

/**
 * Describes a single credential requirement ith a [PresentationDefinition].
 *
 * Identifies a credential type the Verifier needs and specifies the [constraints] that a candidate credential must
 * satisfy &mdash; e.g., the presence of a specific claim with a specific value.
 */
data class InputDescriptor()

/**
 * Describes the credentials and claims a Verifier requires from a wallet presentation.
 *
 * Included in an OpenID4VP authorisation request URI and consumed by the wallet to determine which stored credentials
 * satisfy the Verifier's requirements. Contains one or more [inputDescriptors], each describing a credential the
 * Verifier needs.
 */
data class PresentationDefinition()
