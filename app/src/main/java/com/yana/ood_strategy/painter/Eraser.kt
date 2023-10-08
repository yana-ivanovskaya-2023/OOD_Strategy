package com.yana.ood_strategy.painter

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path

class Eraser : Painter() {

    override val paint: Paint
        get() = Paint().apply {
            color = Color.WHITE
            strokeWidth = 200f
            style = Paint.Style.STROKE
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
            isAntiAlias = true
        }

    override fun draw(canvas: Canvas, path: Path) {
        canvas.drawPath(path, paint)
    }

}