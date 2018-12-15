package fr.pcsoft.wdjava.ui.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.PictureDrawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.core.utils.fb;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.p065b.p067a.wb;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/* renamed from: fr.pcsoft.wdjava.ui.utils.i */
public class C1508i {
    /* renamed from: a */
    public static final int f4608a = 1;
    /* renamed from: b */
    public static final int f4609b = 2;
    /* renamed from: c */
    public static final int f4610c = 7;
    /* renamed from: d */
    public static boolean f4611d = true;
    /* renamed from: e */
    public static final int f4612e = 2;
    /* renamed from: f */
    public static final int f4613f = 5;
    /* renamed from: g */
    public static final int f4614g = 7;
    /* renamed from: h */
    public static final int f4615h = 4;
    /* renamed from: i */
    public static final int f4616i = 1;
    /* renamed from: j */
    public static final int f4617j = 1;
    /* renamed from: k */
    public static final int f4618k = 4;
    /* renamed from: l */
    public static final int f4619l = 6;
    /* renamed from: m */
    public static final int f4620m = 4;
    /* renamed from: n */
    public static final int f4621n = 2;
    /* renamed from: o */
    public static final int f4622o = 0;
    /* renamed from: p */
    public static final int f4623p = 3;
    /* renamed from: z */
    private static final String[] f4624z = new String[]{C1508i.m10501z(C1508i.m10502z("_N\b\u0014Ag\b\u000f\u0019W3\r\u0004Zva\b\u0016\u001bP\fA\u0014\u0015rI\u0011\u001bA3\r\u0004Zq|\u0007\u0012\u000eS}\u001d2\u000eSg\fMZQ|\u0019\b\u001f\u0012z\u0004\u0011\u0015A`\u0000\u0003\u0016W")), C1508i.m10501z(C1508i.m10502z("z\u0004\u0000\u001dW<")), C1508i.m10501z(C1508i.m10502z("V\u001b\u0013\u001fGaI\u0005\u000f@r\u0007\u0015Z^rI\r\u001fQg\u001c\u0013\u001f\u0012w\f\u0012Z[}\u000f\u000e\b_r\u001d\b\u0015\\`I\u0012\u000f@3\u0005F\u0013_r\u000e\u0004T")), C1508i.m10501z(C1508i.m10502z("_\fA\u001c]a\u0004\u0000\u000e\u0012\u001cA\u0014\u0015v\u001a\u0015ZBr\u001aA\u001f\\3\u0019\t\u001bAvI\u0000\fWpI\r\u001f\u0012g\u0010\u0011\u001f\u0012^\u0000\f\u001f")), C1508i.m10501z(C1508i.m10502z("Z\u0004\u0011\u0015A`\u0000\u0003\u0016W3\r\u0004Z@ú\n\u0014\nÛa\f\u0013Z^v\u001aA\u0013\\u\u0006\u0013\u0017Sg\u0000\u000e\u0014A3\u001a\u0014\b\u0012N\b\u0017St\fO")), C1508i.m10501z(C1508i.m10502z("a\u001e")), C1508i.m10501z(C1508i.m10502z("Z\u0004\u0011\u0015A`\u0000\u0003\u0016W3\r\u0004ZQa\u0004\b\u0012f\u0007A\u0019]c\u0000\u0004ZVvI\r\u001b\u0012q\u0000\u0015\u0017ScG")), C1508i.m10501z(C1508i.m10502z("@?&"))};

    /* renamed from: a */
    public static final Bitmap m10470a(int i, int i2, Config config, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        createBitmap.setDensity(i3);
        return createBitmap;
    }

    /* renamed from: a */
    public static final Bitmap m10471a(Activity activity) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        boolean isDrawingCacheEnabled = rootView.isDrawingCacheEnabled();
        try {
            rootView.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            return createBitmap;
        } finally {
            rootView.setDrawingCacheEnabled(isDrawingCacheEnabled);
        }
    }

    /* renamed from: a */
    public static Bitmap m10472a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        return C1508i.m10491a(matrix, 1, bitmap.getWidth(), bitmap.getHeight()) ? C1508i.m10478a(bitmap, matrix) : bitmap;
    }

    /* renamed from: a */
    public static Bitmap m10473a(Bitmap bitmap, double d, int i, int i2, int i3) {
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth() / 2;
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight() / 2;
        }
        Matrix matrix = new Matrix();
        return C1508i.m10490a(matrix, d, i, i2) ? C1508i.m10478a(bitmap, matrix) : bitmap;
    }

    /* renamed from: a */
    public static Bitmap m10474a(Bitmap bitmap, int i) {
        switch (i) {
            case 1:
                return C1508i.m10472a(bitmap);
            case 2:
                return C1508i.m10492b(bitmap);
            case 3:
                return C1508i.m10500f(bitmap);
            default:
                return bitmap;
        }
    }

    /* renamed from: a */
    public static Bitmap m10475a(Bitmap bitmap, int i, double d) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        return (C1508i.m10490a(matrix, d, 0, 0) || C1508i.m10491a(matrix, 2, bitmap.getWidth(), bitmap.getHeight())) ? C1508i.m10478a(bitmap, matrix) : bitmap;
    }

    /* renamed from: a */
    public static Bitmap m10476a(Bitmap bitmap, int i, int i2) {
        if (i < 0) {
            i = bitmap.getWidth();
        }
        if (i2 < 0) {
            i2 = bitmap.getHeight();
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, false);
    }

    /* renamed from: a */
    public static Bitmap m10477a(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        int i4 = 0;
        if (i3 == 4) {
            Bitmap a = C1508i.m10470a(i, i2, bitmap.getConfig(), bitmap.getDensity());
            Paint paint = new Paint();
            paint.setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.REPEAT));
            new Canvas(a).drawPaint(paint);
            return a;
        }
        int i5;
        int i6;
        int i7;
        double width = ((double) i) / ((double) bitmap.getWidth());
        double height = ((double) i2) / ((double) bitmap.getHeight());
        switch (i3) {
            case 5:
                width = Math.min(width, height);
                i = (int) (((double) bitmap.getWidth()) * width);
                i2 = (int) (width * ((double) bitmap.getHeight()));
                i5 = i;
                i6 = 0;
                i7 = 0;
                i4 = i2;
                break;
            case 6:
                double min = Math.min(width, height);
                if (width > height) {
                    i5 = Math.abs(i - ((int) (((double) bitmap.getWidth()) * min))) / 2;
                } else if (width < height) {
                    i5 = 0;
                    i4 = Math.abs(i2 - ((int) (((double) bitmap.getHeight()) * min))) / 2;
                } else {
                    i5 = 0;
                }
                i6 = i4;
                i4 = (int) (((double) bitmap.getHeight()) * min);
                int width2 = (int) (((double) bitmap.getWidth()) * min);
                i7 = i5;
                i5 = width2;
                break;
            case 7:
                width = Math.max(width, height);
                i = (int) (((double) bitmap.getWidth()) * width);
                i2 = (int) (width * ((double) bitmap.getHeight()));
                i5 = i;
                i6 = 0;
                i7 = 0;
                i4 = i2;
                break;
            default:
                i5 = i;
                i6 = 0;
                i7 = 0;
                i4 = i2;
                break;
        }
        Bitmap a2 = C1508i.m10470a(i, i2, bitmap.getConfig(), bitmap.getDensity());
        new Canvas(a2).drawBitmap(bitmap, null, new Rect(i7, i6, i5 + i7, i4 + i6), null);
        return a2;
    }

    /* renamed from: a */
    private static final Bitmap m10478a(Bitmap bitmap, Matrix matrix) {
        if (bitmap == null) {
            return null;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public static final Bitmap m10479a(Drawable drawable, int i, int i2) {
        if (i == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (drawable instanceof BitmapDrawable) {
            return (i == drawable.getIntrinsicWidth() && i2 == drawable.getIntrinsicHeight()) ? ((BitmapDrawable) drawable).getBitmap() : Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), i, i2, false);
        } else {
            if (drawable == null || i <= 0 || i2 <= 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
            drawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            if (drawable instanceof PictureDrawable) {
                new Canvas(createBitmap).drawPicture(((PictureDrawable) drawable).getPicture(), drawable.getBounds());
            } else {
                drawable.draw(new Canvas(createBitmap));
            }
            return createBitmap;
        }
    }

    /* renamed from: a */
    public static final Drawable m10480a(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        ConstantState constantState = mutate.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        C0691a.m2856a(f4624z[0]);
        return mutate;
    }

    /* renamed from: a */
    public static C1336b m10481a() {
        return null;
    }

    @TargetApi(23)
    /* renamed from: a */
    public static C1521w m10482a(View view, String str, int i) {
        int i2 = 0;
        if (!(view instanceof TextView) || str == null || str.equals("")) {
            return new C1521w(0, 0);
        }
        int i3;
        int i4;
        TextView textView = (TextView) view;
        int i5 = (i & 1) > 0 ? 1 : 0;
        int i6 = (i & 2) > 0 ? 1 : 0;
        int i7 = (i & 4) > 0 ? 1 : 0;
        if (i6 == 0 && i5 == 0) {
            i3 = 1;
            i4 = 1;
        } else {
            i3 = i6;
            i4 = i5;
        }
        C1521w c1521w = new C1521w(0, 0);
        TextPaint paint = textView.getPaint();
        Object g = C0808l.m4049g(str);
        if (i7 != 0) {
            i7 = view.getLayoutParams() != null ? view.getLayoutParams().width : 0;
            if (i7 < 10) {
                return new C1521w(0, 0);
            }
            Alignment alignment;
            StaticLayout build;
            switch (textView.getGravity() & 7) {
                case 1:
                    alignment = Alignment.ALIGN_CENTER;
                    break;
                case 5:
                    alignment = Alignment.ALIGN_OPPOSITE;
                    break;
                default:
                    alignment = Alignment.ALIGN_NORMAL;
                    break;
            }
            if (kb.m3965a(C0657a.MARSHMALLOW)) {
                build = Builder.obtain(g, 0, g.length(), paint, i7).setAlignment(alignment).setIncludePad(textView.getIncludeFontPadding()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setEllipsize(textView.getEllipsize()).setHyphenationFrequency(textView.getHyphenationFrequency()).setBreakStrategy(textView.getBreakStrategy()).build();
            } else {
                build = new StaticLayout(g, 0, g.length(), paint, i7, alignment, 1.0f, 0.0f, kb.m3965a(C0657a.JELLY_BEAN) ? textView.getIncludeFontPadding() : false);
            }
            if (i3 != 0) {
                c1521w.f4667b = build.getHeight();
            }
            if (i4 != 0) {
                int lineCount = build.getLineCount();
                while (i2 < lineCount) {
                    float lineWidth = (float) ((int) build.getLineWidth(i2));
                    if (lineWidth > ((float) c1521w.f4666a)) {
                        c1521w.f4666a = (int) Math.ceil((double) lineWidth);
                    }
                    i2++;
                }
            }
        } else {
            String[] m = C0808l.m4055m(g);
            while (i2 < m.length) {
                if (i4 != 0) {
                    c1521w.f4666a = Math.max(c1521w.f4666a, (int) Math.ceil((double) paint.measureText(m[i2])));
                }
                if (i3 != 0) {
                    c1521w.f4667b = ((TextView) view).getLineHeight() + c1521w.f4667b;
                }
                i2++;
            }
        }
        return c1521w;
    }

    /* renamed from: a */
    public static String m10483a(InputStream inputStream, int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        InputStream pushbackInputStream = new PushbackInputStream(inputStream, C1520v.m10565d());
        if (pushbackInputStream == null) {
            return null;
        }
        C1520v c1520v;
        String b;
        if ((i & 1) != 0) {
            byte[] bArr = new byte[C1520v.m10565d()];
            int read = pushbackInputStream.read(bArr);
            C1520v c1520v2 = C1520v.f4659e.m6222a(bArr) ? C1520v.f4659e : C1520v.f4658b.m6222a(bArr) ? C1520v.f4658b : C1520v.f4660f.m6222a(bArr) ? C1520v.f4660f : C1520v.f4662h.m6222a(bArr) ? C1520v.f4662h : null;
            if (read > 0) {
                try {
                    pushbackInputStream.unread(bArr, 0, read);
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e222) {
                    throw e222;
                } catch (Exception e2222) {
                    throw e2222;
                } catch (Exception e22222) {
                    C0691a.m2857a(f4624z[2], e22222);
                    return null;
                }
            }
            if (c1520v2 != null && i == 1) {
                return c1520v2.toString();
            }
            c1520v = c1520v2;
        } else {
            c1520v = null;
        }
        InputStream c1509j = !WDProjet.getInstance().isVersionCompatible(C0657a.KIT_KAT.getNumero()) ? new C1509j(pushbackInputStream) : new BufferedInputStream(pushbackInputStream);
        if (c1509j.markSupported()) {
            c1509j.mark(131072);
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c1509j, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            c1509j.reset();
            b = C1508i.m10494b(c1509j, i);
            if (b != null) {
                return b;
            }
        }
        b = options.outMimeType;
        if (c1520v == null) {
            try {
                if (!C0808l.m4053k(b)) {
                    if (b.startsWith(f4624z[1])) {
                        stringBuffer.append(b.substring(f4624z[1].length()).toUpperCase());
                    }
                }
            } catch (Exception e222222) {
                throw e222222;
            } catch (Exception e2222222) {
                throw e2222222;
            }
        } else {
            try {
                boolean z;
                if (!C0808l.m4053k(b)) {
                    if (!c1520v.m10568c().equals(b)) {
                        z = false;
                        C0691a.m2860a(z, f4624z[3]);
                        stringBuffer.append(c1520v);
                    }
                }
                z = true;
                C0691a.m2860a(z, f4624z[3]);
                stringBuffer.append(c1520v);
            } catch (Exception e22222222) {
                throw e22222222;
            } catch (Exception e222222222) {
                throw e222222222;
            }
        }
        if ((i & 2) != 0) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(C0607n.Gc);
            }
            stringBuffer.append(options.outWidth);
            stringBuffer.append(C0607n.Gc).append(options.outHeight);
        }
        if ((i & 4) != 0) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(C0607n.Gc);
            }
            stringBuffer.append(0);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m10484a(String str, int i) {
        Closeable a;
        Exception e;
        Throwable th;
        String str2 = null;
        try {
            a = bb.m3842a((Object) str, null);
            try {
                str2 = C1508i.m10483a((InputStream) a, i);
                bb.m3844a(a);
            } catch (C0901s e2) {
                e = e2;
                try {
                    C0691a.m2857a(f4624z[4], e);
                    bb.m3844a(a);
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    bb.m3844a(a);
                    throw th;
                }
            }
        } catch (C0901s e3) {
            e = e3;
            a = str2;
            C0691a.m2857a(f4624z[4], e);
            bb.m3844a(a);
            return str2;
        } catch (Throwable th3) {
            a = str2;
            th = th3;
            bb.m3844a(a);
            throw th;
        }
        return str2;
    }

    /* renamed from: a */
    public static void m10485a(Canvas canvas, int i, int i2, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint == null ? new Paint() : paint;
        canvas.save();
        int max = Math.max(i3, 2);
        int i6 = (max / 2) - 1;
        canvas.translate((float) i, (float) i2);
        paint2.setColor(i5);
        int i7;
        switch (i4) {
            case 1:
                for (i7 = 0; i7 < max; i7++) {
                    canvas.drawLine((float) (i6 - i7), (float) i7, (float) (i6 + i7), (float) i7, paint2);
                }
                break;
            case 2:
                i7 = 0;
                for (max--; max >= 0; max--) {
                    canvas.drawLine((float) (i6 - max), (float) i7, (float) (i6 + max), (float) i7, paint2);
                    i7++;
                }
                break;
            case 4:
                i7 = 0;
                for (max--; max >= 0; max--) {
                    canvas.drawLine((float) i7, (float) (i6 - max), (float) i7, (float) (i6 + max), paint2);
                    i7++;
                }
                break;
            case 8:
                for (i7 = 0; i7 < max; i7++) {
                    canvas.drawLine((float) i7, (float) (i6 - i7), (float) i7, (float) (i6 + i7), paint2);
                }
                break;
        }
        canvas.translate((float) (-i), (float) (-i2));
        canvas.restore();
    }

    /* renamed from: a */
    public static final void m10486a(Canvas canvas, String str, int i, int i2, Align align, Paint paint) {
        paint.setTextAlign(align);
        canvas.drawText(str, (float) i, (float) ((int) (((double) i2) + Math.ceil((double) Math.abs(paint.ascent())))), paint);
    }

    /* renamed from: a */
    public static final void m10487a(Canvas canvas, String str, Rect rect, int i, int i2, int i3, TextPaint textPaint, boolean z) {
        if (i > 0) {
            rect.inset(i, i);
        }
        if (rect.width() > 0 && rect.height() > 0) {
            if (z && str.indexOf(10) < 0 && ((int) Math.floor((double) textPaint.measureText(str))) <= rect.width()) {
                z = false;
            }
            int height;
            if (z) {
                Alignment alignment;
                CharSequence a = C0808l.m4014a(str, '\r');
                switch (i2) {
                    case 1:
                        alignment = Alignment.ALIGN_CENTER;
                        break;
                    case 2:
                        alignment = Alignment.ALIGN_OPPOSITE;
                        break;
                    default:
                        alignment = Alignment.ALIGN_NORMAL;
                        break;
                }
                textPaint.setTextAlign(Align.LEFT);
                StaticLayout staticLayout = new StaticLayout(a, 0, a.length(), textPaint, rect.width(), alignment, 1.0f, 0.0f, false);
                int i4 = rect.left;
                switch (i3) {
                    case 1:
                        height = rect.top + ((rect.height() - staticLayout.getHeight()) / 2);
                        break;
                    case 2:
                        height = rect.bottom - staticLayout.getHeight();
                        break;
                    default:
                        height = rect.top;
                        break;
                }
                canvas.translate((float) i4, (float) height);
                staticLayout.draw(canvas);
                canvas.translate((float) (-i4), (float) (-height));
            } else {
                int width;
                switch (i2) {
                    case 1:
                        width = rect.left + (rect.width() / 2);
                        textPaint.setTextAlign(Align.CENTER);
                        break;
                    case 2:
                        width = rect.left + rect.width();
                        textPaint.setTextAlign(Align.RIGHT);
                        break;
                    default:
                        width = rect.left;
                        textPaint.setTextAlign(Align.LEFT);
                        break;
                }
                height = (int) Math.ceil((double) Math.abs(textPaint.ascent()));
                switch (i3) {
                    case 0:
                        height += rect.top;
                        break;
                    case 2:
                        height = (rect.top + rect.height()) - ((int) Math.ceil((double) textPaint.descent()));
                        break;
                    default:
                        height += rect.top + ((rect.height() - ((int) (((float) height) + textPaint.descent()))) / 2);
                        break;
                }
                canvas.save(2);
                canvas.clipRect(rect);
                canvas.drawText(str, (float) width, (float) height, textPaint);
                canvas.restore();
            }
            if (i > 0) {
                rect.inset(-i, -i);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public static final void m10488a(Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        if (kb.m3965a(C0657a.LOLLIPOP)) {
            drawable.setTint(i);
        } else {
            drawable.setColorFilter(i, Mode.SRC_ATOP);
        }
    }

    /* renamed from: a */
    public static final void m10489a(Drawable drawable, Canvas canvas, Rect rect, boolean z) {
        if (z) {
            int width = rect.width();
            int height = rect.height();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                int i = rect.left + (width / 2);
                int i2 = rect.top + (height / 2);
                double min = Math.min(((double) width) / ((double) intrinsicWidth), ((double) height) / ((double) intrinsicHeight));
                intrinsicWidth = (int) (((double) intrinsicWidth) * min);
                width = (int) (min * ((double) intrinsicHeight));
                rect.left = i - (intrinsicWidth / 2);
                rect.top = i2 - (width / 2);
                rect.right = rect.left + intrinsicWidth;
                rect.bottom = width + rect.top;
            }
        }
        if (drawable instanceof PictureDrawable) {
            canvas.drawPicture(((PictureDrawable) drawable).getPicture(), rect);
            return;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }

    /* renamed from: a */
    private static final boolean m10490a(Matrix matrix, double d, int i, int i2) {
        double min = Math.min(360.0d, Math.max(-360.0d, d));
        if (min == 0.0d || Math.abs(min) == 360.0d) {
            return false;
        }
        matrix.preRotate((float) min, (float) i, (float) i2);
        return true;
    }

    /* renamed from: a */
    private static final boolean m10491a(Matrix matrix, int i, int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return false;
        }
        switch (i) {
            case 1:
                matrix.preScale(-1.0f, 1.0f);
                matrix.preTranslate((float) (-i2), 0.0f);
                return true;
            case 2:
                matrix.preScale(1.0f, -1.0f);
                matrix.preTranslate(0.0f, (float) (-i3));
                return true;
            case 3:
                matrix.preScale(-1.0f, -1.0f);
                matrix.preTranslate((float) i2, (float) i3);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static Bitmap m10492b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        return C1508i.m10491a(matrix, 2, bitmap.getWidth(), bitmap.getHeight()) ? C1508i.m10478a(bitmap, matrix) : bitmap;
    }

    /* renamed from: b */
    public static Bitmap m10493b(Bitmap bitmap, int i) {
        switch (i) {
            case 2:
                return C1508i.m10499e(bitmap);
            case 3:
                return C1508i.m10497c(bitmap);
            default:
                return bitmap;
        }
    }

    /* renamed from: b */
    public static final String m10494b(InputStream inputStream, int i) {
        StringBuffer stringBuffer = new StringBuffer("");
        wb a = wb.m7837a(inputStream, 1);
        if (a == null) {
            return null;
        }
        if ((i & 1) != 0) {
            stringBuffer.append(f4624z[7]);
        }
        if ((i & 2) != 0) {
            RectF b = a.m7851b((float) C1511l.m10528c());
            if (stringBuffer.length() > 0) {
                stringBuffer.append(C0607n.Gc);
            }
            stringBuffer.append((int) Math.ceil((double) b.width()));
            stringBuffer.append(C0607n.Gc).append((int) Math.ceil((double) b.height()));
        }
        if ((i & 4) != 0) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(C0607n.Gc);
            }
            stringBuffer.append(0);
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static final void m10495b(Canvas canvas, String str, int i, int i2, Align align, Paint paint) {
        canvas.save();
        paint.setTextAlign(align);
        int ceil = (int) (((double) i) + Math.ceil((double) Math.abs(paint.ascent())));
        canvas.rotate(270.0f, (float) ceil, (float) i2);
        canvas.drawText(str, (float) ceil, (float) i2, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public static void m10496b(String str, int i) {
        if (i != 0 && i != 360) {
            new C1513n(str, i).run();
        }
    }

    /* renamed from: c */
    public static Bitmap m10497c(Bitmap bitmap) {
        return bitmap;
    }

    /* renamed from: d */
    public static final Bitmap m10498d(Bitmap bitmap) {
        File d;
        RandomAccessFile randomAccessFile;
        File file;
        FileChannel fileChannel;
        fb c1512m;
        Bitmap bitmap2;
        Throwable th;
        RandomAccessFile randomAccessFile2 = null;
        if (bitmap != null) {
            try {
                if (!bitmap.isMutable()) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Config config = bitmap.getConfig();
                    try {
                        int i;
                        switch (C1519u.f4657a[config.ordinal()]) {
                            case 1:
                                i = (width * height) * 4;
                                break;
                            case 2:
                                i = (width * height) * 4;
                                break;
                            default:
                                i = (width * height) * 2;
                                break;
                        }
                        d = C0897o.m6271d("", "");
                        try {
                            RandomAccessFile randomAccessFile3 = new RandomAccessFile(d, f4624z[5]);
                            try {
                                FileChannel channel = randomAccessFile3.getChannel();
                                try {
                                    Buffer map = channel.map(MapMode.READ_WRITE, 0, (long) i);
                                    bitmap.copyPixelsToBuffer(map);
                                    Bitmap a = C1508i.m10470a(width, height, config, bitmap.getDensity());
                                    map.position(0);
                                    a.copyPixelsFromBuffer(map);
                                    if (channel != null) {
                                        try {
                                            channel.close();
                                        } catch (IOException e) {
                                        }
                                    }
                                    if (randomAccessFile3 != null) {
                                        try {
                                            randomAccessFile3.close();
                                        } catch (IOException e2) {
                                        }
                                    }
                                    if (d != null) {
                                        try {
                                            if (d.exists()) {
                                                d.delete();
                                            }
                                        } catch (IOException e3) {
                                            throw e3;
                                        }
                                    }
                                    return a;
                                } catch (IOException e4) {
                                    randomAccessFile = randomAccessFile3;
                                    file = d;
                                    fileChannel = channel;
                                    try {
                                        c1512m = new C1512m(bitmap, config);
                                        c1512m.run();
                                        bitmap2 = (Bitmap) c1512m.m3088a();
                                        if (fileChannel != null) {
                                            try {
                                                fileChannel.close();
                                            } catch (IOException e5) {
                                            }
                                        }
                                        if (randomAccessFile != null) {
                                            try {
                                                randomAccessFile.close();
                                            } catch (IOException e6) {
                                            }
                                        }
                                        if (file == null) {
                                            return bitmap2;
                                        }
                                        try {
                                            if (!file.exists()) {
                                                return bitmap2;
                                            }
                                            file.delete();
                                            return bitmap2;
                                        } catch (IOException e32) {
                                            throw e32;
                                        }
                                    } catch (Exception e7) {
                                        C0691a.m2857a(f4624z[6], e7);
                                        if (fileChannel != null) {
                                            try {
                                                fileChannel.close();
                                            } catch (IOException e8) {
                                            }
                                        }
                                        if (randomAccessFile != null) {
                                            try {
                                                randomAccessFile.close();
                                            } catch (IOException e9) {
                                            }
                                        }
                                        if (file != null) {
                                            try {
                                                if (file.exists()) {
                                                    file.delete();
                                                }
                                            } catch (IOException e322) {
                                                throw e322;
                                            }
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        randomAccessFile2 = randomAccessFile;
                                        d = file;
                                        if (fileChannel != null) {
                                            try {
                                                fileChannel.close();
                                            } catch (IOException e10) {
                                            }
                                        }
                                        if (randomAccessFile2 != null) {
                                            try {
                                                randomAccessFile2.close();
                                            } catch (IOException e11) {
                                            }
                                        }
                                        if (d != null) {
                                            try {
                                                if (d.exists()) {
                                                    d.delete();
                                                }
                                            } catch (IOException e3222) {
                                                throw e3222;
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    randomAccessFile2 = randomAccessFile3;
                                    fileChannel = channel;
                                    th = th3;
                                    if (fileChannel != null) {
                                        fileChannel.close();
                                    }
                                    if (randomAccessFile2 != null) {
                                        randomAccessFile2.close();
                                    }
                                    if (d != null) {
                                        if (d.exists()) {
                                            d.delete();
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e12) {
                                randomAccessFile = randomAccessFile3;
                                file = d;
                                fileChannel = null;
                                c1512m = new C1512m(bitmap, config);
                                c1512m.run();
                                bitmap2 = (Bitmap) c1512m.m3088a();
                                if (fileChannel != null) {
                                    fileChannel.close();
                                }
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                if (file == null) {
                                    return bitmap2;
                                }
                                if (!file.exists()) {
                                    return bitmap2;
                                }
                                file.delete();
                                return bitmap2;
                            } catch (Throwable th4) {
                                th = th4;
                                fileChannel = null;
                                randomAccessFile2 = randomAccessFile3;
                                if (fileChannel != null) {
                                    fileChannel.close();
                                }
                                if (randomAccessFile2 != null) {
                                    randomAccessFile2.close();
                                }
                                if (d != null) {
                                    if (d.exists()) {
                                        d.delete();
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e13) {
                            randomAccessFile = null;
                            file = d;
                            fileChannel = null;
                            c1512m = new C1512m(bitmap, config);
                            c1512m.run();
                            bitmap2 = (Bitmap) c1512m.m3088a();
                            if (fileChannel != null) {
                                fileChannel.close();
                            }
                            if (randomAccessFile != null) {
                                randomAccessFile.close();
                            }
                            if (file == null) {
                                return bitmap2;
                            }
                            if (!file.exists()) {
                                return bitmap2;
                            }
                            file.delete();
                            return bitmap2;
                        } catch (Throwable th5) {
                            th = th5;
                            fileChannel = null;
                            if (fileChannel != null) {
                                fileChannel.close();
                            }
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            if (d != null) {
                                if (d.exists()) {
                                    d.delete();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e14) {
                        randomAccessFile = null;
                        file = null;
                        fileChannel = null;
                        c1512m = new C1512m(bitmap, config);
                        c1512m.run();
                        bitmap2 = (Bitmap) c1512m.m3088a();
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        if (file == null) {
                            return bitmap2;
                        }
                        if (!file.exists()) {
                            return bitmap2;
                        }
                        file.delete();
                        return bitmap2;
                    } catch (Throwable th6) {
                        th = th6;
                        d = null;
                        fileChannel = null;
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        if (d != null) {
                            if (d.exists()) {
                                d.delete();
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e32222) {
                throw e32222;
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    public static Bitmap m10499e(Bitmap bitmap) {
        return bitmap;
    }

    /* renamed from: f */
    public static Bitmap m10500f(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        return C1508i.m10491a(matrix, 3, bitmap.getWidth(), bitmap.getHeight()) ? C1508i.m10478a(bitmap, matrix) : bitmap;
    }

    /* renamed from: z */
    private static String m10501z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 19;
                    break;
                case 1:
                    i2 = 105;
                    break;
                case 2:
                    i2 = 97;
                    break;
                case 3:
                    i2 = 122;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10502z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }
}
