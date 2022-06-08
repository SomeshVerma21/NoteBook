package com.vermaji.noteshare.mainUI.homeFragment.composeComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.vermaji.noteshare.R

@Preview
@Composable
fun HomeItem(){
    Row() {
        Image(painter = painterResource(id = R.drawable.ic_note_book) , contentDescription = "note icon")

    }
}