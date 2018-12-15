package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import java.util.Iterator;

public class eb extends AbstractRepetitionView {
    /* renamed from: b */
    private boolean f3853b = false;
    final C1295f this$0;

    public eb(C1295f c1295f, Context context) {
        this.this$0 = c1295f;
        super(context);
    }

    /* renamed from: f */
    private final void m9088f() {
        ec e = m8958e();
        if (e != null) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof jb) {
                    C1308q c = ((jb) childAt).m9161c();
                    if (c != null) {
                        c.mo3574a(e, false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected ViewGroup mo3533a(Context context, WDRuptureZR wDRuptureZR) {
        return new lb(this, context, wDRuptureZR);
    }

    /* renamed from: a */
    public gc mo3534a(int i, int i2) {
        C1309r c1309r = (C1309r) mo3541c();
        Rect rect = new Rect();
        Iterator d = c1309r.m9188d();
        gc gcVar = null;
        while (d.hasNext()) {
            gc gcVar2 = (gc) d.next();
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
                    if (obj != null && gcVar2._isVisible()) {
                        if (!this.this$0.b.isCanEditChamp(this.a, gcVar2)) {
                            gcVar2 = null;
                        }
                        gcVar = gcVar2;
                    }
                }
            }
            gcVar2 = gcVar;
            gcVar = gcVar2;
        }
        return gcVar != null ? gcVar.getChampSourceClone() : null;
    }

    /* renamed from: a */
    protected void mo3535a() {
        ec e = m8958e();
        if (e != null) {
            ((C1309r) mo3541c()).mo3574a(e, this.f3853b);
        }
    }

    /* renamed from: a */
    public void mo3561a(int i) {
        super.mo3561a(i);
        m9088f();
    }

    /* renamed from: a */
    public void mo3562a(int i, boolean z) {
        super.mo3562a(i, z);
        m9088f();
    }

    /* renamed from: a */
    public void mo3537a(ec ecVar) {
        C1309r c1309r = (C1309r) mo3541c();
        if (c1309r != null && c1309r.getVisibility() == 0) {
            c1309r.m9196a(ecVar);
        }
    }

    /* renamed from: b */
    protected ViewGroup mo3539b(Context context) {
        return new C1309r(this.this$0, context);
    }

    /* renamed from: b */
    public void mo3540b(int i) {
        C1309r c1309r = (C1309r) mo3541c();
        if (c1309r != null) {
            Iterator d = c1309r.m9188d();
            while (d.hasNext()) {
                ((gc) d.next()).setAgencement(i);
            }
        }
    }

    /* renamed from: e */
    public void mo3542e(int i) {
        this.f3853b = this.a != i;
        if (this.f3853b) {
            C1315x editor = this.this$0.b.getEditor();
            if (this.this$0.b.isEditing() && editor.mo3605h() == 1 && this.this$0.b.convertirIndiceVueVersModele(editor.m9261j()) == this.a) {
                editor.m9262k();
                C1503b.m10425a();
            }
        }
        super.mo3542e(i);
    }
}
