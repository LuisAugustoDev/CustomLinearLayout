package com.guty.minimalistlinear;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MinimalistLinear extends LinearLayout {

    private static final int DEFAULT_PRIMARY_COLOR = Color.parseColor("#4ded30");
    private static final int DEFAULT_BACKGROUND_COLOR = Color.parseColor("#202020");
    private static final int DEFAULT_CORNER_RADIUS = 20; // em dp

    private Paint paint;
    private Path path;
    private RectF rectF;

    public MinimalistLinear(Context context) {
        super(context);
        init();
    }

    public MinimalistLinear(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MinimalistLinear(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setWillNotDraw(false);
        paint = new Paint();
        path = new Path();
        rectF = new RectF();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        // DEFAULT_CORNER_RADIUS
        path.reset();
        path.addRoundRect(new RectF(0, 0, width, height), DEFAULT_CORNER_RADIUS, DEFAULT_CORNER_RADIUS, Path.Direction.CW);
        canvas.clipPath(path);

        // Desenhar a parte verde
        paint.setColor(DEFAULT_PRIMARY_COLOR);
        canvas.drawRect(0, 0, 15, height, paint);

        // Desenhar a parte cinza
        paint.setColor(DEFAULT_BACKGROUND_COLOR);
        canvas.drawRect(15, 0, width, height, paint);
    }
}
