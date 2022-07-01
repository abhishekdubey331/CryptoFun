package com.jetpack.cryptofun.presentation.coin_list

import com.jetpack.cryptofun.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
