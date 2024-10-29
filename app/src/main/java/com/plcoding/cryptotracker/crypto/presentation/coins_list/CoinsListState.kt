package com.plcoding.cryptotracker.crypto.presentation.coins_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUI

data class CoinsListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUI> = emptyList(),
    val selectedCoin: CoinUI? = null
)
