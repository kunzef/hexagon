package com.hexagonkt.http.model

/**
 * HTTP multi-value field. Used in headers, query parameters and form parameters.
 */
interface HttpField {
    val name: String
    val value: String?
    val values: List<String>

    operator fun plus(value: Any): HttpField

    operator fun minus(element: Any): HttpField
}
