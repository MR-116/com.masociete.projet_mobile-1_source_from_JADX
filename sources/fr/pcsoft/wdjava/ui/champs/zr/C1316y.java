package fr.pcsoft.wdjava.ui.champs.zr;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.y */
public class C1316y extends C1315x {
    /* renamed from: z */
    private static final String f3929z = C1316y.m9266z(C1316y.m9267z("z\u001ai\u001cqS['MaE\u000fi\u001aeE[?\u0003`S"));
    /* renamed from: g */
    public C1151p f3930g;

    public C1316y(WDZoneRepetee wDZoneRepetee) {
        super(wDZoneRepetee);
        this.f3930g = null;
        this.f3930g = new C1304n(this, C1056i.m7562a());
        m9264m();
    }

    /* renamed from: m */
    private final void m9264m() {
        C0691a.m2860a(this.f3930g.getChildCount() == 0, f3929z);
        Iterator champIterator = this.f.getChampIterator();
        while (champIterator.hasNext()) {
            gc gcVar = (gc) champIterator.next();
            if (gcVar.isChampEditableDansZR()) {
                gcVar = gcVar.cloneChampForZR(true, true);
                if (gcVar != null) {
                    this.f3930g.addView(gcVar.getCompConteneur());
                    gcVar.appliquerVisibilite(false);
                }
            }
        }
    }

    /* renamed from: n */
    private final void m9265n() {
        int childCount = this.f3930g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f3930g.getChildAt(i).setVisibility(4);
        }
        ViewParent parent = this.f3930g.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f3930g);
        }
    }

    /* renamed from: z */
    private static String m9266z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 54;
                    break;
                case 1:
                    i2 = 123;
                    break;
                case 2:
                    i2 = 73;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9267z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 4);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3599a(int i, int i2) {
        super.mo3599a(i, i2);
        m9262k();
        mo3603b().measure(i + 1073741824, 1073741824 + i2);
        mo3603b().layout(0, 0, i, i2);
    }

    /* renamed from: a */
    protected void mo3600a(int i, AbstractRepetitionView abstractRepetitionView, gc gcVar) {
        boolean z = true;
        boolean e = m9256e();
        if (e) {
            if (i != this.d) {
                m9262k();
            } else if (this.e != gcVar) {
                mo3604c(false);
            } else {
                return;
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.f3930g.getParent();
        if (viewGroup != abstractRepetitionView.mo3541c()) {
            if (viewGroup != null) {
                viewGroup.removeView(this.f3930g);
            }
            abstractRepetitionView.mo3541c().addView(this.f3930g, new LayoutParams(-1, -1));
        } else {
            z = !e;
        }
        this.d = i;
        this.e = gcVar;
        this.f.getRenderer().mo3550a(z);
        m9263l();
        if (z) {
            this.f.appelPCode(19);
        }
    }

    /* renamed from: a */
    public void mo3601a(Rect rect) {
        rect.set(0, 0, 0, 0);
        if (this.e != null) {
            gc cloneForEdition = this.e.getCloneForEdition();
            if (cloneForEdition != null) {
                View compConteneur = cloneForEdition.getCompConteneur();
                View view = (ViewGroup) compConteneur.getParent();
                while (view != null && !(view instanceof AbstractRepetitionView) && (view instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                }
                if (view != null) {
                    int[] iArr = new int[]{0, 0};
                    C1503b.m10427a(compConteneur, iArr, view);
                    rect.left = iArr[0];
                    rect.top = iArr[1];
                    rect.right = iArr[0] + compConteneur.getWidth();
                    rect.bottom = iArr[1] + compConteneur.getHeight();
                }
            }
        }
    }

    /* renamed from: a */
    protected void mo3602a(boolean z) {
        View b = mo3603b();
        if (!(b == null || b.findFocus() == null)) {
            this.f.getCompPrincipal().requestFocus();
        }
        super.mo3602a(z);
        m9265n();
    }

    /* renamed from: b */
    public View mo3603b() {
        return this.f3930g;
    }

    /* renamed from: c */
    protected void mo3604c(boolean z) {
        if (this.e != null) {
            this.e.getCloneForEdition().appliquerVisibilite(false);
        }
        super.mo3604c(z);
    }

    /* renamed from: h */
    public int mo3605h() {
        return 1;
    }
}
