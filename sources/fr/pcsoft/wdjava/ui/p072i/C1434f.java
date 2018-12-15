package fr.pcsoft.wdjava.ui.p072i;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.View;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.fb;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.p065b.C1099j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.ui.i.f */
public class C1434f extends Canvas {
    /* renamed from: z */
    private static final String f4247z = C1434f.m10080z(C1434f.m10081z("{e\nZ\\Aa\u0018YJ\u0012l\u001f\u0015L@á\u001fG\u000f^iZWFFe\u001bE\u0001"));
    /* renamed from: a */
    private HashMap<String, Drawable> f4248a = null;
    /* renamed from: b */
    private boolean f4249b = false;
    /* renamed from: c */
    private boolean f4250c = false;
    /* renamed from: d */
    private LinkedList<AsyncTask> f4251d = null;
    /* renamed from: e */
    private Bitmap f4252e = null;
    final C1431a this$0;

    public C1434f(C1431a c1431a) {
        this.this$0 = c1431a;
    }

    /* renamed from: a */
    private final void m10076a(int i, int i2, int i3, int i4) {
        if (i > 0 || i3 < getWidth() || i2 > 0 || i4 < getHeight()) {
            clipRect((float) i, (float) i2, (float) i3, (float) i4, Op.REPLACE);
            this.f4250c = true;
            return;
        }
        m10078b();
    }

    /* renamed from: a */
    private final void m10077a(AsyncTask asyncTask) {
        if (this.f4251d != null) {
            this.f4251d.remove(asyncTask);
        }
    }

    static void access$100(C1434f c1434f, AsyncTask asyncTask) {
        c1434f.m10077a(asyncTask);
    }

    static HashMap access$200(C1434f c1434f) {
        return c1434f.f4248a;
    }

    static HashMap access$202(C1434f c1434f, HashMap hashMap) {
        c1434f.f4248a = hashMap;
        return hashMap;
    }

    static boolean access$302(C1434f c1434f, boolean z) {
        c1434f.f4249b = z;
        return z;
    }

    /* renamed from: b */
    private final void m10078b() {
        if (this.f4250c) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                clipRect(0.0f, 0.0f, (float) width, (float) height, Op.REPLACE);
                this.f4250c = false;
            }
        }
    }

    /* renamed from: b */
    private final void m10079b(AsyncTask asyncTask) {
        if (this.f4251d == null) {
            this.f4251d = new LinkedList();
        }
        this.f4251d.add(asyncTask);
    }

    /* renamed from: z */
    private static String m10080z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 50;
                    break;
                case 1:
                    i2 = 8;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 53;
                    break;
                default:
                    i2 = 47;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10081z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 47);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m10082a(int i, int i2) {
        try {
            this.f4249b = false;
            if (this.f4252e != null) {
                if (this.f4252e.getWidth() == i) {
                    try {
                        if (this.f4252e.getHeight() == i2) {
                            drawColor(0, Mode.CLEAR);
                            this.this$0.f4244c = this;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            try {
                if (this.f4252e != null) {
                    this.f4252e.recycle();
                    this.f4252e = null;
                }
                if (i > 0 && i2 > 0) {
                    fb c1433d = new C1433d(this, i, i2);
                    c1433d.run();
                    try {
                        this.f4252e = (Bitmap) c1433d.m3088a();
                        setBitmap(this.f4252e);
                    } catch (Exception e2) {
                        C0691a.m2857a(f4247z, e2);
                    }
                }
                this.this$0.f4244c = this;
            } catch (Exception e22) {
                throw e22;
            }
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    public final void m10083a(Rect rect) {
        if (this.f4252e != null && !this.f4252e.isRecycled()) {
            this.f4249b = false;
            m10076a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: a */
    public final void m10084a(View view) {
        if (!(this.f4252e == null || this.f4252e.isRecycled())) {
            view.draw(this);
            this.f4249b = true;
            m10078b();
        }
        this.this$0.f4244c = null;
    }

    /* renamed from: a */
    public void m10085a(C1099j c1099j, C0520c c0520c, C1306c c1306c) {
        AsyncTask c1432b = new C1432b(this, c1099j, c0520c, c1306c);
        m10079b(c1432b);
        c1432b.m7952a(false);
    }

    /* renamed from: a */
    public final boolean m10086a() {
        return (!this.f4249b || this.f4252e == null || this.f4252e.isRecycled()) ? false : true;
    }

    /* renamed from: a */
    public boolean m10087a(C0520c c0520c) {
        return this.f4248a != null ? this.f4248a.containsKey(((gc) c0520c).getName()) : false;
    }

    /* renamed from: b */
    public Drawable m10088b(C0520c c0520c) {
        return this.f4248a != null ? (this.f4251d == null || this.f4251d.isEmpty()) ? (Drawable) this.f4248a.remove(((gc) c0520c).getName()) : (Drawable) this.f4248a.get(((gc) c0520c).getName()) : null;
    }

    /* renamed from: b */
    final void m10089b(Rect rect) {
        if (this.f4252e != null && !this.f4252e.isRecycled()) {
            int i = rect.top;
            int i2 = rect.left;
            int i3 = rect.right;
            int i4 = rect.bottom;
            getClipBounds(rect);
            m10076a(i2, i, i3, i4);
            drawColor(0, Mode.CLEAR);
            m10076a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: c */
    public final Bitmap m10090c() {
        return this.f4252e;
    }

    /* renamed from: d */
    public final void m10091d() {
        m10092e();
        if (this.f4252e != null) {
            this.f4252e.recycle();
            this.f4252e = null;
        }
    }

    /* renamed from: e */
    public final void m10092e() {
        this.f4249b = false;
        m10078b();
        if (this.f4248a != null) {
            this.f4248a.clear();
        }
        if (this.f4251d != null) {
            Iterator it = this.f4251d.iterator();
            while (it.hasNext()) {
                AsyncTask asyncTask = (AsyncTask) it.next();
                if (!asyncTask.isCancelled()) {
                    asyncTask.cancel(true);
                }
            }
            this.f4251d.clear();
        }
    }
}
