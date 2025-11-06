package com.example.navigasiui.view

import androidx.compose.runtime.Composable

@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-Laki", "Perempuan"),
    OnSubmitBtnClick : () -> unit
)