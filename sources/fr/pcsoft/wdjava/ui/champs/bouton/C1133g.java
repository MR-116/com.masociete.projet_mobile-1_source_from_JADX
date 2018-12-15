package fr.pcsoft.wdjava.ui.champs.bouton;

import android.graphics.Bitmap;
import android.graphics.Rect;
import fr.pcsoft.wdjava.ui.p065b.C1094e;
import fr.pcsoft.wdjava.ui.utils.ab;

/* renamed from: fr.pcsoft.wdjava.ui.champs.bouton.g */
final class C1133g extends ab {
    final WDBouton this$0;

    public C1133g(WDBouton wDBouton, Bitmap bitmap) {
        this.this$0 = wDBouton;
        super(bitmap);
    }

    public boolean isStateful() {
        return C1094e.m7936a(this.this$0.Pc, 32) > (byte) 1;
    }

    protected boolean onStateChange(int[] iArr) {
        byte a = C1094e.m7936a(this.this$0.Pc, 32);
        if (a <= (byte) 1) {
            return false;
        }
        int width = getBitmap().getWidth() / a;
        int height = getBitmap().getHeight();
        Rect rect = new Rect(0, 0, width, height);
        if (this.this$0.Kc.isEnabled() || a < (byte) 3) {
            for (int i = 0; i < iArr.length; i++) {
                if (iArr[i] == 16842919 && a >= (byte) 2) {
                    rect.set(width, 0, width * 2, height);
                    break;
                }
                if (iArr[i] == 16842908 && a >= (byte) 4) {
                    rect.set(width * 3, 0, width * 4, height);
                }
            }
        } else {
            rect.set(width * 2, 0, width * 3, height);
        }
        if (this.a.equals(rect)) {
            return false;
        }
        m8299a(rect.left, rect.top, rect.right, rect.bottom);
        invalidateSelf();
        return true;
    }
}
