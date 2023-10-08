package com.yana.ood_strategy.painter

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path


class Rainbow : Painter() {

    override val paint: Paint
        get() = Paint().apply {
            style = Paint.Style.STROKE
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
            isAntiAlias = true
            strokeWidth = 20f
        }

    private val mPaint1 = paint.apply {
        color = Color.parseColor(RED)
    }
    private val mPaint2 = paint.apply {
        color = Color.parseColor(ORANGE)
    }
    private val mPaint3 = paint.apply {
        color = Color.parseColor(YELLOW)
    }
    private val mPaint4 = paint.apply {
        color = Color.parseColor(GREEN)
    }
    private val mPaint5 = paint.apply {
        color = Color.parseColor(LIGHT_BLUE)
    }
    private val mPaint6 = paint.apply {
        color = Color.parseColor(BLUE)
    }
    private val mPaint7 = paint.apply {
        color = Color.parseColor(PURPLE)
    }

    private val mMatrix = Matrix().apply {
        setTranslate(14f, 14f)
    }

    override fun draw(canvas: Canvas, path: Path) {
        val path1 = Path(path)

        path1.transform(mMatrix)
        canvas.drawPath(path1, mPaint1)
        path1.transform(mMatrix)
        canvas.drawPath(path1, mPaint2)
        path1.transform(mMatrix)
        canvas.drawPath(path1, mPaint3)
        path1.transform(mMatrix)
        canvas.drawPath(path1, mPaint4)
        path1.transform(mMatrix)
        canvas.drawPath(path1, mPaint5)
        path1.transform(mMatrix)
        canvas.drawPath(path1, mPaint6)
        path1.transform(mMatrix)
        canvas.drawPath(path1, mPaint7)
    }

    companion object {
        private const val RED = "#C62828"
        private const val ORANGE = "#EF6C00"
        private const val YELLOW = "#F9A825"
        private const val GREEN = "#558B2F"
        private const val LIGHT_BLUE = "#0277BD"
        private const val BLUE = "#283593"
        private const val PURPLE = "#4527A0"
    }

}

