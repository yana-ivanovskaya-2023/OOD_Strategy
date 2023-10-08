package com.yana.ood_strategy

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import com.yana.ood_strategy.painter.Painter


class CanvasView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes), View.OnTouchListener {

    private var mPainter: Painter? = null
    private val mPaths = mutableMapOf<Painter, Path>()

    fun setPainter(painter: Painter) {
        mPainter = painter
        mPaths[painter] = Path()
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        setWillNotDraw(false)
        setOnTouchListener(this)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawColor(Color.WHITE)
        mPaths.forEach { (painter, path) ->
            painter.draw(canvas, path)
        }
    }

    override fun onTouch(p0: View?, event: MotionEvent?): Boolean {
        event ?: return false

        when (event.action) {
            MotionEvent.ACTION_DOWN -> mPaths[mPainter]?.moveTo(event.x, event.y)
            MotionEvent.ACTION_MOVE -> {
                mPaths[mPainter]?.lineTo(event.x, event.y)
                invalidate()
            }

            else -> Unit
        }
        return true
    }

}