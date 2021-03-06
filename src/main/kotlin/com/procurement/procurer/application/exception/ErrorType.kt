package com.procurement.procurer.application.exception

enum class ErrorType constructor(val code: String, val message: String) {
    INVALID_JSON_TYPE("00.00", "Invalid type: "),
    INVALID_PMD("10.13", "Invalid pmd."),
    CONTEXT("20.01", "Context parameter not found."),
    INVALID_FORMAT_TOKEN("10.63", "Invalid format the award id."),
    INVALID_REQUIREMENT_VALUE("10.66", "Invalid requirement value."),
    INVALID_PERIOD_VALUE("10.67", "Invalid period value."),
    INVALID_CRITERIA("10.68", "Invalid criteria value."),
    INVALID_CONVERSION("10.69", "Invalid conversion value."),
    INVALID_AWARD_CRITERIA("10.70", "Invalid award criteria."),
    INVALID_JSON("10.71", "Invalid json."),
    ENTITY_NOT_FOUND("10.72", "No entity found in db with specified parameters."),
    INVALID_REQUIREMENT_RESPONSE("10.73", "Invalid requirement response."),
    EMPTY_LIST("10.74", "Collection is empty."),
    NOT_UNIQUE_IDS("10.75", "Elements in collection is not unique by id.");
}
