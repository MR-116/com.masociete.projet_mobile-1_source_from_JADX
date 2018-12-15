package fr.pcsoft.wdjava.ui.champs.saisie;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: fr.pcsoft.wdjava.ui.champs.saisie.j */
class C1257j implements TextWatcher {
    final C0517i this$0;

    C1257j(C0517i c0517i) {
        this.this$0 = c0517i;
    }

    public void afterTextChanged(Editable editable) {
        if (this.this$0.Ec == 0) {
            this.this$0.Lc = this.this$0.Yc.getText().toString();
        }
        if (this.this$0.hd) {
            this.this$0.m1434k();
        }
        this.this$0.m1432i();
        this.this$0.wrapSizeToContent();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
