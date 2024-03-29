package com.jetpack.cryptofun.domain.usecase.get_coins

import com.jetpack.cryptofun.common.Resource
import com.jetpack.cryptofun.data.remote.dto.toCoin
import com.jetpack.cryptofun.domain.model.Coin
import com.jetpack.cryptofun.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) : IGetCoinsUseCase {

    override operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "Something went wrong"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Coin>>("Couldn't reach server. Check your internet connection"))
        }
    }
}

interface IGetCoinsUseCase {
    fun invoke(): Flow<Resource<List<Coin>>>
}