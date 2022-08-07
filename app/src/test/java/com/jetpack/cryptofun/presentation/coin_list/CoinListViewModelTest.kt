package com.jetpack.cryptofun.presentation.coin_list

import com.jetpack.cryptofun.BaseViewModelTest
import com.jetpack.cryptofun.common.Resource
import com.jetpack.cryptofun.domain.model.Coin
import com.jetpack.cryptofun.domain.usecase.get_coins.IGetCoinsUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class CoinListViewModelTest : BaseViewModelTest() {

    private lateinit var coinListViewModel: CoinListViewModel

    @Mock
    lateinit var getCoinsUseCase: IGetCoinsUseCase

    @Test
    fun `test coin list is empty`() = runTest {
        // Given
        val flowQuestions = flowOf(Resource.Success<List<Coin>>(listOf()))

        // When
        Mockito.doReturn(flowQuestions).`when`(getCoinsUseCase).invoke()
        coinListViewModel = CoinListViewModel(getCoinsUseCase)

        // Then
        assert(coinListViewModel.state.value.coins.isEmpty())
        assert(coinListViewModel.state.value.isLoading.not())
        assert(coinListViewModel.state.value.error.isEmpty())
    }
}