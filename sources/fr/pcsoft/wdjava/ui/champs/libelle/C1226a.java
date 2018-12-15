package fr.pcsoft.wdjava.ui.champs.libelle;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.cadre.C1120j;

/* renamed from: fr.pcsoft.wdjava.ui.champs.libelle.a */
public final class C1226a extends TextView {
    /* renamed from: z */
    private static final String f3662z = C1226a.m8660z(C1226a.m8661z("%t8"));
    /* renamed from: a */
    private boolean f3663a = false;
    /* renamed from: b */
    private boolean f3664b = false;
    /* renamed from: c */
    private float f3665c = 1.0f;
    /* renamed from: d */
    private float f3666d = 0.0f;
    /* renamed from: e */
    private CharSequence f3667e;
    final WDLibelle this$0;

    public C1226a(WDLibelle wDLibelle, Context context) {
        this.this$0 = wDLibelle;
        super(context);
    }

    @TargetApi(23)
    /* renamed from: a */
    private Layout m8658a(CharSequence charSequence) {
        Alignment alignment;
        boolean z = false;
        switch (getGravity() & 7) {
            case 1:
            case 17:
                alignment = Alignment.ALIGN_CENTER;
                break;
            case 5:
                alignment = Alignment.ALIGN_OPPOSITE;
                break;
            default:
                alignment = Alignment.ALIGN_NORMAL;
                break;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (kb.m3965a(C0657a.MARSHMALLOW)) {
            return Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), width).setAlignment(alignment).setIncludePad(getIncludeFontPadding()).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setHyphenationFrequency(getHyphenationFrequency()).setBreakStrategy(getBreakStrategy()).build();
        }
        if (kb.m3965a(C0657a.JELLY_BEAN)) {
            z = getIncludeFontPadding();
        }
        return new StaticLayout(charSequence, getPaint(), width, alignment, this.f3665c, this.f3666d, z);
    }

    /* renamed from: a */
    private void m8659a() {
        if (this.f3667e == null) {
            this.f3667e = getText();
        }
        CharSequence charSequence = this.f3667e;
        Layout a = m8658a(charSequence);
        int height = ((getHeight() - getExtendedPaddingTop()) - getExtendedPaddingTop()) + WDLibelle.Gc;
        int lineCount = a.getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount && a.getLineBottom(i) <= height) {
            i++;
            i2++;
        }
        int i3 = i2 < 1 ? 1 : i2;
        if (i3 < lineCount) {
            String q = C0808l.m4059q(this.f3667e.toString().substring(0, a.getLineEnd(i3 - 1)));
            while (m8658a(q + f3662z).getLineCount() > i3) {
                i = q.length();
                if (i == 0) {
                    break;
                }
                i--;
                while (i >= 0) {
                    if (Character.isWhitespace(q.charAt(i))) {
                        break;
                    }
                    i--;
                }
                i = -1;
                q = i >= 0 ? q.substring(0, i) : q.substring(0, q.length() - 1);
            }
            CharSequence charSequence2 = q + f3662z;
            if (this.f3667e instanceof Spanned) {
                charSequence = new SpannableStringBuilder(charSequence2);
                TextUtils.copySpansFrom((Spanned) this.f3667e, 0, charSequence2.length(), null, charSequence, 0);
            } else {
                charSequence = charSequence2;
            }
        } else {
            this.f3667e = null;
        }
        if (!charSequence.equals(getText())) {
            this.f3663a = true;
            try {
                setText(charSequence);
            } finally {
                this.f3663a = false;
            }
        }
        this.f3664b = false;
    }

    /* renamed from: z */
    private static String m8660z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 22;
                    break;
                case 3:
                    i2 = 114;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8661z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 67);
        }
        return toCharArray;
    }

    public int getExtendedPaddingTop() {
        return super.getExtendedPaddingTop() - WDLibelle.Gc;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if ((this.this$0.Kc == 2 || (this.this$0.kc instanceof C1120j)) && !kb.m3965a(C0657a.LOLLIPOP) && isHardwareAccelerated()) {
            C1014a.m7327b().mo3294c(this);
        }
        this.this$0.updateLabelTextColor();
    }

    protected void onDraw(Canvas canvas) {
        if (this.f3664b && getEllipsize() == TruncateAt.END) {
            m8659a();
        }
        if (this.this$0.kc != null) {
            this.this$0.kc.mo3370a(canvas, (View) this, null);
        }
        if (this.this$0.S) {
            super.onDraw(canvas);
        }
        this.this$0.dessinerContourCadreExterieur(canvas, this.this$0.Kc);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3664b = true;
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f3663a) {
            this.f3667e = null;
            this.f3664b = true;
        }
    }

    public void setLineSpacing(float f, float f2) {
        this.f3666d = f;
        this.f3665c = f2;
        super.setLineSpacing(f, f2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.f3664b = true;
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }
}
