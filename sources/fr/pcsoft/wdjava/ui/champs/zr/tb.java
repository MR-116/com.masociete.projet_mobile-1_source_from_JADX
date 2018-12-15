package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;

class tb extends sb {
    final C1295f this$0;

    public tb(C1295f c1295f, Context context, int[] iArr) {
        this.this$0 = c1295f;
        super(c1295f, context, iArr);
    }

    /* renamed from: a */
    public void mo3584a(Context context) {
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            addView(new kb(this, getContext(), this.this$0.b.getLiaisonRuptureAt(i).m9182c(), i));
        }
    }

    /* renamed from: a */
    protected void mo3585a(ec ecVar, hb hbVar, int i) {
        ((jb) hbVar).m9161c().mo3574a(ecVar, false);
        hbVar.m9152b(!ecVar.m9121i(i));
    }
}
