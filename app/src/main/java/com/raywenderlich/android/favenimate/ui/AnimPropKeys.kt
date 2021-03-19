package com.raywenderlich.android.favenimate.ui

import androidx.compose.animation.ColorPropKey
import androidx.compose.animation.DpPropKey
import androidx.compose.animation.core.FloatPropKey
import androidx.compose.animation.core.IntPropKey

val width = DpPropKey(label = "width")

val roundedCorners = IntPropKey(label = "roundedCorners")

val backgroundColor = ColorPropKey(label = "backgroundColor")

val textColor = ColorPropKey(label = "textColor")

val textOpacity = FloatPropKey(label = "textOpacity")

val iconOpacity = FloatPropKey(label = "iconOpacity")

val pressedHearSize = DpPropKey(label = "pressedHearSize")

val idleHeartIconSize = DpPropKey(label = "idleHeartIconSize")

