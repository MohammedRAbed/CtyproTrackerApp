package com.plcoding.cryptotracker.crypto.presentation.coins_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.plcoding.cryptotracker.crypto.presentation.coins_list.components.CoinListItem
import com.plcoding.cryptotracker.crypto.presentation.coins_list.components.previewCoin
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinsListScreen(
    modifier: Modifier = Modifier,
    coinsListState: CoinsListState
) {
    if (coinsListState.isLoading) {
        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator()
        }
    } else {
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(coinsListState.coins) { coinUI ->
                CoinListItem(
                    coinUI = coinUI,
                    modifier = Modifier.fillMaxWidth()
                ) { /*TODO onClick*/ }
                HorizontalDivider()
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun CoinsListScreenPreview() {
    CryptoTrackerTheme {
        CoinsListScreen(
            coinsListState = CoinsListState(
                isLoading = false,
                coins = (1..100).map {
                    previewCoin.copy(id = it.toString())
                },
            ),
            modifier = Modifier.background(MaterialTheme.colorScheme.background)
        )
    }
}