package com.yana.ood_strategy.painter

import android.content.Context
import android.graphics.BitmapShader
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Shader
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import com.yana.ood_strategy.R


class CatPawPrinter(
    private val context: Context
) : Painter() {

    override val paint: Paint
        get() = Paint().apply {
            strokeWidth = 90f
            alpha = 120
            style = Paint.Style.STROKE
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
            isAntiAlias = true

            val bitmap = ContextCompat.getDrawable(
                context,
                R.drawable.cat_paw
            )?.toBitmap(60, 60) ?: return@apply

            shader = BitmapShader(
                bitmap,
                Shader.TileMode.REPEAT,
                Shader.TileMode.REPEAT
            )
        }

    override fun draw(canvas: Canvas, path: Path) {
        canvas.drawPath(path, paint)
    }

}
