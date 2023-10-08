package com.yana.ood_strategy.painter

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

class Marker(
    private val color: Int
) : Painter() {

    override val paint: Paint
        get() = Paint().apply {
            this.color = this@Marker.color
            strokeWidth = 40f
            alpha = 60
            style = Paint.Style.STROKE
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
            isAntiAlias = true
        }

    override fun draw(canvas: Canvas, path: Path) {
        canvas.drawPath(path, paint)
    }

}