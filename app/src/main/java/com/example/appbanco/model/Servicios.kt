package com.example.appbanco.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Servicios(@StringRes val stringResourceId: Int,@DrawableRes val imageResourceID: Int , val descriptionResId: Int) {

}