package ja.zonvoirDemo.photoeditor.shape

import android.graphics.Paint
import ja.zonvoirDemo.photoeditor.shape.AbstractShape

/**
 * Simple data class to be put in an ordered Stack
 */
open class ShapeAndPaint(
    val shape: AbstractShape,
    val paint: Paint
)