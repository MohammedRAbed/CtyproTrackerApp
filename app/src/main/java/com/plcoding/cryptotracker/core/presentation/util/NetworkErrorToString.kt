package com.plcoding.cryptotracker.core.presentation.util

import android.content.Context
import com.plcoding.cryptotracker.R
import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.NetworkError.*

fun NetworkError.toString(context: Context) : String {
    val resId = when(this) {
        REQUEST_TIMEOUT -> R.string.error_request_timeout
        TOO_MANY_REQUESTS -> R.string.error_too_many_requests
        NO_INTERNET -> R.string.error_no_iternet
        SERVER_ERROR -> R.string.unknown_error
        SERIALIZATION -> R.string.unknown_error
        UNKNOWN -> R.string.unknown_error
    }

    return context.getString(resId)
}