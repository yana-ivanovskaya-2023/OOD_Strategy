package com.yana.ood_strategy.painter

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

abstract class Painter {

    protected abstract val paint: Paint
    abstract fun draw(canvas: Canvas, path: Path)

}