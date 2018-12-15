package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.gesture.C1290a;
import fr.pcsoft.wdjava.ui.p072i.C1293e;
import fr.pcsoft.wdjava.ui.p072i.C1434f;
import java.util.Iterator;

public class db extends AbstractRepetitionView implements C1293e {
    /* renamed from: z */
    private static final String[] f3843z = new String[]{m9048z(m9049z("M}\u001b\u001dh,k\u0019\u000bni(\b\u0007s~(\u0014\t&~á\bre|\u0011\u0007h,k\u0017\u001dtmf\f\r(")), m9048z(m9049z("\\g\u000b\u0001reg\u0016Hb+a\f\rk,l\u001dH|~(\u0011\u0006pmd\u0011\fc\""))};
    final C1294e this$0;

    public db(C1294e c1294e, Context context) {
        this.this$0 = c1294e;
        super(context);
        if (c1294e.f3849g != null) {
            setWillNotCacheDrawing(true);
            setDrawingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private final void m9047a(C1434f c1434f, Canvas canvas) {
        Bitmap c = c1434f.m10090c();
        C1290a gestureControler = this.this$0.b.getGestureControler();
        if (gestureControler == null || gestureControler.m9036r() != 1) {
            canvas.drawBitmap(c, 0.0f, 0.0f, null);
        } else {
            canvas.drawBitmap(c, 0.0f, (float) (getHeight() - c.getHeight()), null);
        }
    }

    /* renamed from: z */
    private static String m9048z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 12;
                    break;
                case 1:
                    i2 = 8;
                    break;
                case 2:
                    i2 = C0607n.co;
                    break;
                case 3:
                    i2 = 104;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9049z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 6);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected ViewGroup mo3533a(Context context, WDRuptureZR wDRuptureZR) {
        return new ib(this, context, wDRuptureZR);
    }

    /* renamed from: a */
    public gc mo3534a(int i, int i2) {
        Rect rect = new Rect();
        Iterator champIterator = this.this$0.b.getChampIterator();
        gc gcVar = null;
        while (champIterator.hasNext()) {
            gc gcVar2 = (gc) champIterator.next();
            if (gcVar2.isChampEditableDansZR()) {
                View compPrincipal = gcVar2.getCompPrincipal();
                View compConteneur = gcVar2.getCompConteneur();
                compConteneur.getHitRect(rect);
                if (rect.contains(i, i2)) {
                    Object obj = null;
                    if (compPrincipal == compConteneur) {
                        obj = 1;
                    } else {
                        compPrincipal.getHitRect(rect);
                        rect.bottom += compConteneur.getBottom();
                        rect.top += compConteneur.getTop();
                        rect.right += compConteneur.getRight();
                        rect.left += compConteneur.getLeft();
                        if (rect.contains(i, i2)) {
                            int i3 = 1;
                        }
                    }
                    if (obj != null) {
                        ec ecVar = (ec) this.this$0.b.getDataModel().mo3593b(this.a);
                        if (ecVar != null) {
                            this.this$0.b.affecterAttributVersPropChamp(ecVar, gcVar2);
                        }
                        if (!this.this$0.b.isCanEditChamp(this.a, gcVar2)) {
                            gcVar2 = null;
                        } else if (gcVar2._isVisible()) {
                        }
                        gcVar = gcVar2;
                    }
                }
            }
            gcVar2 = gcVar;
            gcVar = gcVar2;
        }
        return gcVar;
    }

    /* renamed from: a */
    protected void mo3535a() {
    }

    /* renamed from: a */
    protected void mo3536a(Context context) {
        C1290a gestureControler = this.this$0.b.getGestureControler();
        if (this.this$0.b.isAvecRupture() || (gestureControler != null && gestureControler.m9025h() == this.this$0.b)) {
            super.mo3536a(context);
        }
    }

    /* renamed from: a */
    protected void m9054a(Canvas canvas, ViewGroup viewGroup) {
        C1307p.access$000(this.this$0.f3851j, canvas, this.a, m8953b(), viewGroup.getWidth(), viewGroup.getHeight());
    }

    /* renamed from: a */
    public void mo3537a(ec ecVar) {
        View c = mo3541c();
        if (c != null && c.getVisibility() == 0) {
            int cellHeight;
            if (ecVar.m9111d()) {
                Integer num = (Integer) ecVar.m9123k(10);
                cellHeight = num == null ? this.this$0.b.getCellHeight() : num.intValue();
            } else {
                cellHeight = 0;
            }
            LayoutParams layoutParams = c.getLayoutParams();
            if (cellHeight != layoutParams.height) {
                layoutParams.height = cellHeight;
                c.requestLayout();
            }
        }
    }

    /* renamed from: a */
    public boolean mo3538a(boolean z) {
        if (!super.mo3538a(z)) {
            return false;
        }
        if (!(this.this$0.f3849g == null || z)) {
            C1434f b = this.this$0.f3849g.m10059b(this.this$0.b.convertirIndiceModeleVersVue(this.a));
            if (b != null) {
                b.m10091d();
            }
        }
        return true;
    }

    /* renamed from: b */
    protected ViewGroup mo3539b(Context context) {
        return new C1314w(this, context);
    }

    /* renamed from: b */
    public void mo3540b(int i) {
    }

    /* renamed from: c */
    public ViewGroup mo3541c() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return this;
        }
        if (childCount != 1) {
            return super.mo3541c();
        }
        View childAt = getChildAt(0);
        return (childAt == this.this$0.f3851j || childAt == this.this$0.b.getEditor().mo3603b()) ? this : (ViewGroup) getChildAt(0);
    }

    protected void dispatchDraw(Canvas canvas) {
        int i = 0;
        C1434f c1434f = null;
        if (!(this.this$0.f3849g == null || this.this$0.f3849g.m10066e())) {
            c1434f = this.this$0.f3849g.m10059b(this.this$0.b.convertirIndiceModeleVersVue(this.a));
            if (c1434f == null) {
                C0691a.m2856a(f3843z[0]);
            } else if (!c1434f.m10086a()) {
                c1434f.m10082a(getWidth(), getHeight());
                c1434f.m10084a((View) this);
            }
        }
        m9061f();
        View c = mo3541c();
        if (c == this) {
            i = 1;
        }
        if (i != 0) {
            m9054a(canvas, (ViewGroup) this);
        }
        if (c1434f == null || !c1434f.m10086a()) {
            super.dispatchDraw(canvas);
        } else if (i != 0) {
            m9047a(c1434f, canvas);
            super.dispatchDraw(canvas);
        } else {
            c.invalidate();
            super.dispatchDraw(canvas);
            m9047a(c1434f, canvas);
        }
    }

    protected void dispatchSetPressed(boolean z) {
    }

    /* renamed from: e */
    public void mo3542e(int i) {
        super.mo3542e(i);
        C1315x editor = this.this$0.b.getEditor();
        if (this.this$0.b.isEditing() && editor.mo3605h() == 1 && editor.mo3603b().getParent() == mo3541c() && this.this$0.b.convertirIndiceVueVersModele(editor.m9261j()) != i) {
            editor.m9262k();
        }
    }

    /* renamed from: f */
    public final void m9061f() {
        ec e = m8958e();
        if (e == null) {
            C0691a.m2856a(f3843z[1]);
            return;
        }
        if (this.this$0.f3849g == null || !this.this$0.f3849g.m10066e()) {
            this.this$0.f3852k = m8950b(e);
        }
        if (this.this$0.f3849g == null || this.this$0.f3849g.m10066e()) {
            View c = mo3541c();
            int width = c.getWidth();
            int height = c.getHeight();
            this.this$0.f3851j.m9173c();
            this.this$0.f3851j.measure(MeasureSpec.makeMeasureSpec(width, 1073741824), MeasureSpec.makeMeasureSpec(height, 1073741824));
            this.this$0.f3851j.layout(0, 0, width, height);
            this.this$0.m9074a(e, this.a, (AbstractRepetitionView) this);
        }
    }

    public void setPressed(boolean z) {
        boolean isPressed = isPressed();
        super.setPressed(z);
        if (isPressed != z && this.this$0.b.isInvalidateCacheOnPressed()) {
            C1434f b = this.this$0.f3849g.m10059b(this.this$0.b.convertirIndiceModeleVersVue(this.a));
            if (b != null && b.m10086a()) {
                b.m10092e();
            }
        }
    }
}
