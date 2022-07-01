package com.jetpack.cryptofun.data.repository

import com.jetpack.cryptofun.data.api.CoinPaprikaApi
import com.jetpack.cryptofun.data.remote.dto.CoinDetailDto
import com.jetpack.cryptofun.data.remote.dto.CoinDto
import com.jetpack.cryptofun.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}