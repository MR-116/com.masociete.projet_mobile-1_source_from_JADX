package fr.pcsoft.wdjava.ui.utils;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0727l;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.context.C0671c;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.ib;
import fr.pcsoft.wdjava.ui.champs.image.C0520c;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.champs.wc;
import fr.pcsoft.wdjava.ui.p033c.C0510b;
import fr.pcsoft.wdjava.ui.p033c.C1106a;
import fr.pcsoft.wdjava.ui.p033c.C1108e;
import fr.pcsoft.wdjava.ui.p064a.C1033c;
import java.util.Collection;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.ui.utils.b */
public class C1503b extends C1502a {
    /* renamed from: z */
    private static final String[] f4557z = new String[]{C1503b.m10452z(C1503b.m10453z("INGfBMRg^OD")), C1503b.m10452z(C1503b.m10453z("rEGûDE\u0000^}@AL^wS\u000e"))};

    /* renamed from: a */
    public static final int m10421a(TextView textView) {
        switch (textView.getGravity() & 7) {
            case 1:
            case 17:
                return 1;
            case 5:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static final int m10422a(Collection collection, boolean z) {
        int i = Integer.MIN_VALUE;
        for (Object next : collection) {
            int computeRequiredParentSizeChangeToReachPreferredHeight;
            if (next instanceof gc) {
                gc gcVar = (gc) next;
                if (C0727l.m3092b(gcVar.getAnchorOptions(), 7) && gcVar.isVisibleExt()) {
                    computeRequiredParentSizeChangeToReachPreferredHeight = gcVar.computeRequiredParentSizeChangeToReachPreferredHeight(z);
                    if (computeRequiredParentSizeChangeToReachPreferredHeight > i) {
                        i = computeRequiredParentSizeChangeToReachPreferredHeight;
                    }
                }
            }
            computeRequiredParentSizeChangeToReachPreferredHeight = i;
            i = computeRequiredParentSizeChangeToReachPreferredHeight;
        }
        return i > Integer.MIN_VALUE ? i : 0;
    }

    /* renamed from: a */
    public static <T extends ViewGroup> T m10423a(View view, Class<T> cls) {
        ViewParent parent = view.getParent();
        return parent instanceof ViewGroup ? cls.isAssignableFrom(parent.getClass()) ? (ViewGroup) parent : C1503b.m10423a((View) parent, (Class) cls) : null;
    }

    /* renamed from: a */
    public static <T extends View> Collection<T> m10424a(ViewGroup viewGroup, Class<T> cls, Collection<T> collection) {
        Collection linkedList;
        if (collection == null) {
            linkedList = new LinkedList();
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isAssignableFrom(childAt.getClass())) {
                linkedList.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                C1503b.m10424a((ViewGroup) childAt, (Class) cls, linkedList);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public static void m10425a() {
        WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
        if (wDFenetre == null || wDFenetre.isInitialisee()) {
            C0671c l = WDAppelContexte.getContexte().m2726l();
            if (l == null || !(l.m2766b() == 11 || l.m2766b() == 15)) {
                C1503b.m10436a(false);
                return;
            } else {
                C1504c.m10454a(new C1514o());
                return;
            }
        }
        wDFenetre.setAfficheClavierEnOuverture(false);
    }

    /* renamed from: a */
    public static void m10426a(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (ib) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ib(0, 0, 0, 0);
        }
        if (layoutParams.width != i3 || layoutParams.height != i4 || layoutParams.x != i || layoutParams.y != i2) {
            layoutParams.x = i;
            layoutParams.y = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static final void m10427a(View view, int[] iArr, View view2) {
        r0 = new int[2];
        view.getLocationInWindow(r0);
        iArr[0] = iArr[0] + r0[0];
        iArr[1] = iArr[1] + r0[1];
        view2.getLocationInWindow(r0);
        iArr[0] = iArr[0] - r0[0];
        iArr[1] = iArr[1] - r0[1];
    }

    /* renamed from: a */
    public static final void m10428a(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt instanceof TextView) {
                    C1503b.m10432a((TextView) childAt, i, i2);
                } else if (childAt instanceof ViewGroup) {
                    C1503b.m10428a((ViewGroup) childAt, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m10429a(ViewGroup viewGroup, View view, LayoutParams layoutParams) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        if (viewGroup2 != null) {
            int indexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.setLayoutParams(view.getLayoutParams());
            viewGroup2.removeView(view);
            if (layoutParams != null) {
                viewGroup.addView(view, layoutParams);
            } else {
                viewGroup.addView(view);
            }
            viewGroup2.addView(viewGroup, indexOfChild);
        } else if (layoutParams != null) {
            viewGroup.addView(view, layoutParams);
        } else {
            viewGroup.addView(view);
        }
    }

    /* renamed from: a */
    public static final void m10430a(ViewGroup viewGroup, boolean z) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    C1503b.m10433a((TextView) childAt, z);
                } else if (childAt instanceof ViewGroup) {
                    C1503b.m10430a((ViewGroup) childAt, z);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m10431a(TextView textView, int i) {
        int i2 = 3;
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 5;
                break;
        }
        textView.setGravity((i2 & 7) | (textView.getGravity() & 112));
    }

    /* renamed from: a */
    public static final void m10432a(TextView textView, int i, int i2) {
        if (textView.isEnabled() && i == i2) {
            textView.setTextColor(i);
        } else if (i != i2) {
            textView.setTextColor(new C1033c(i, i2));
        } else {
            textView.setTextColor(new C1033c(i));
        }
    }

    /* renamed from: a */
    public static final void m10433a(TextView textView, boolean z) {
        if (textView.isEnabled() != z) {
            ColorStateList textColors = textView.getTextColors();
            if (z) {
                textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            } else {
                if (!(textColors instanceof C1033c)) {
                    textView.setTextColor(new C1033c(textColors.getDefaultColor()));
                }
                int i = C1511l.f4632f;
                textView.setShadowLayer((float) i, (float) i, (float) i, -1);
            }
            textView.setEnabled(z);
        }
    }

    /* renamed from: a */
    public static final void m10434a(C1108e c1108e, View view, int i, int i2, boolean z) {
        int c;
        View childAt;
        if (i <= i2 || !z) {
            int c2 = C1503b.m10449c(view);
            c = C1503b.m10449c(c1108e);
            if (i != i2 || c2 < c) {
                if (c2 >= c) {
                    c = c2;
                }
                C1503b.m10448b(view, i2, c);
            }
            childAt = c1108e.getChildAt(0);
            if (childAt != view) {
                if (childAt != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    c1108e.removeAllViews();
                }
                c1108e.addView(view);
                return;
            }
            return;
        }
        childAt = c1108e.getChildAt(0);
        if (childAt == view || childAt == null) {
            c1108e.removeAllViews();
            childAt = new C1106a(C1056i.m7562a());
            childAt.addView(view);
            C0510b g = c1108e.mo3362g();
            if (g != null) {
                childAt.mo3351a(g);
            }
            c1108e.addView(childAt);
        }
        c = C1503b.m10449c(c1108e);
        if (C1503b.m10449c(view) < c) {
            C1503b.m10448b(view, C1503b.m10442b(view), c);
        }
    }

    /* renamed from: a */
    public static final void m10435a(gc gcVar) {
        WDFenetre wDFenetre = (WDFenetre) gcVar.getFenetreMere();
        if (wDFenetre != null && !wDFenetre.isMaximisee()) {
            WindowManager.LayoutParams attributes = wDFenetre.getActivite().getWindow().getAttributes();
            attributes.dimAmount = 0.0f;
            wDFenetre.getActivite().getWindow().setAttributes(attributes);
        }
    }

    /* renamed from: a */
    private static final void m10436a(boolean z) {
        if (z) {
            ((InputMethodManager) WDAppManager.m2544C().getSystemService(f4557z[0])).toggleSoftInput(0, 1);
            return;
        }
        Activity a = C1056i.m7562a();
        InputMethodManager inputMethodManager = (InputMethodManager) a.getSystemService(f4557z[0]);
        View decorView = a.getWindow().getDecorView();
        if (decorView != null) {
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    public static final boolean m10437a(int i, int i2, View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        return ((int) Math.sqrt(Math.pow((double) ((height / 2) - i2), 2.0d) + Math.pow((double) ((width / 2) - i), 2.0d))) <= Math.min(width / 2, height / 2);
    }

    /* renamed from: a */
    public static boolean m10438a(View view) {
        Rect rect = new Rect();
        return (!view.getGlobalVisibleRect(rect)) || rect.width() < view.getWidth() || rect.height() < view.getHeight();
    }

    /* renamed from: a */
    public static boolean m10439a(View view, int i, int i2) {
        LayoutParams layoutParams = (ib) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ib(0, 0, 0, 0);
        }
        if (layoutParams.x == i && layoutParams.y == i2) {
            return false;
        }
        layoutParams.x = i;
        layoutParams.y = i2;
        view.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: a */
    public static final boolean m10440a(wc wcVar, int i) {
        AbsListView listView = wcVar.getListView();
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            return childCount + firstVisiblePosition < wcVar.getNbElement() || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight() - listView.getPaddingBottom();
        } else {
            return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < listView.getPaddingTop();
        }
    }

    /* renamed from: a */
    public static final int[] m10441a(int i, int i2, nb nbVar, int i3) {
        int[] iArr = new int[]{i, i2};
        View compPrincipal = ((gc) nbVar).getCompPrincipal();
        switch (i3) {
            case 0:
                nbVar.getLocationInWindow(iArr);
                iArr[0] = (int) C1511l.m10515a((float) (iArr[0] + i), 1, nbVar.getDisplayUnit());
                iArr[1] = (int) C1511l.m10515a((float) (iArr[1] + i2), 1, nbVar.getDisplayUnit());
                break;
            case 1:
                compPrincipal.getLocationOnScreen(iArr);
                iArr[0] = (int) C1511l.m10515a((float) (iArr[0] + i), 1, nbVar.getDisplayUnit());
                iArr[1] = (int) C1511l.m10515a((float) (iArr[1] + i2), 1, nbVar.getDisplayUnit());
                break;
            case 3:
                C0520c c0520c = (C0520c) ((WDObjet) nbVar).checkType(C0520c.class);
                if (c0520c == null) {
                    iArr[1] = -1;
                    iArr[0] = -1;
                    break;
                }
                c0520c.convertirPositionDansImage(iArr);
                break;
            default:
                C0691a.m2860a(i3 == 2, f4557z[1]);
                break;
        }
        return iArr;
    }

    /* renamed from: b */
    public static final int m10442b(View view) {
        if (view == null) {
            return 0;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams == null || layoutParams.width < 0) ? view.getMeasuredWidth() : layoutParams.width;
    }

    /* renamed from: b */
    public static final int m10443b(TextView textView) {
        switch (textView.getGravity() & 112) {
            case 16:
            case 17:
                return 1;
            case 80:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static final int m10444b(Collection collection, boolean z) {
        int i = Integer.MIN_VALUE;
        for (Object next : collection) {
            int computeRequiredParentSizeChangeToReachPreferredWidth;
            if (next instanceof gc) {
                gc gcVar = (gc) next;
                if (C0727l.m3092b(gcVar.getAnchorOptions(), 8) && gcVar.isVisibleExt()) {
                    computeRequiredParentSizeChangeToReachPreferredWidth = gcVar.computeRequiredParentSizeChangeToReachPreferredWidth(z);
                    if (computeRequiredParentSizeChangeToReachPreferredWidth > i) {
                        i = computeRequiredParentSizeChangeToReachPreferredWidth;
                    }
                }
            }
            computeRequiredParentSizeChangeToReachPreferredWidth = i;
            i = computeRequiredParentSizeChangeToReachPreferredWidth;
        }
        return i > Integer.MIN_VALUE ? i : 0;
    }

    /* renamed from: b */
    public static void m10445b() {
        WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
        if (wDFenetre == null || wDFenetre.isInitialisee()) {
            C1503b.m10436a(true);
        } else {
            wDFenetre.setAfficheClavierEnOuverture(true);
        }
    }

    /* renamed from: b */
    public static final void m10446b(TextView textView, int i) {
        int i2 = 48;
        switch (i) {
            case 1:
                i2 = 16;
                break;
            case 2:
                i2 = 80;
                break;
        }
        textView.setGravity((i2 & 112) | (textView.getGravity() & 7));
    }

    /* renamed from: b */
    public static final void m10447b(TextView textView, int i, int i2) {
        switch (i) {
            case 1:
                textView.setShadowLayer((float) C1511l.f4632f, (float) C1511l.f4632f, (float) C1511l.f4632f, i2);
                return;
            case 2:
                textView.setShadowLayer((float) C1511l.f4632f, (float) (-C1511l.f4632f), (float) (-C1511l.f4632f), i2);
                return;
            case 3:
                textView.setShadowLayer((float) C1511l.f4632f, (float) (-C1511l.f4632f), (float) C1511l.f4632f, i2);
                return;
            case 4:
                textView.setShadowLayer((float) C1511l.f4632f, (float) C1511l.f4632f, (float) (-C1511l.f4632f), i2);
                return;
            case 9:
                textView.setShadowLayer((float) C1511l.f4632f, 0.0f, (float) C1511l.f4632f, i2);
                return;
            case 10:
                textView.setShadowLayer((float) C1511l.f4632f, 0.0f, (float) (-C1511l.f4632f), i2);
                return;
            case 11:
                textView.setShadowLayer((float) C1511l.f4632f, (float) (-C1511l.f4632f), 0.0f, i2);
                return;
            case 12:
                textView.setShadowLayer((float) C1511l.f4632f, (float) C1511l.f4632f, 0.0f, i2);
                return;
            default:
                textView.setShadowLayer((float) C1511l.f4632f, (float) (-C1511l.f4632f), (float) (-C1511l.f4632f), i2);
                return;
        }
    }

    /* renamed from: b */
    public static boolean m10448b(View view, int i, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ib(0, 0, 0, 0);
        }
        if (layoutParams.width == i && layoutParams.height == i2) {
            return false;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: c */
    public static final int m10449c(View view) {
        if (view == null) {
            return 0;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams == null || layoutParams.height < 0) ? view.getMeasuredHeight() : layoutParams.height;
    }

    /* renamed from: d */
    public static final void m10450d(View view) {
        if (view.isFocusable()) {
            boolean isFocusableInTouchMode = view.isFocusableInTouchMode();
            if (!isFocusableInTouchMode) {
                try {
                    view.setFocusableInTouchMode(true);
                } catch (Throwable th) {
                    if (!isFocusableInTouchMode) {
                        view.setFocusableInTouchMode(false);
                    }
                }
            }
            view.requestFocus();
            if ((view instanceof EditText) && view.isEnabled() && view.onCheckIsTextEditor()) {
                C1503b.m10445b();
            }
            if (!isFocusableInTouchMode) {
                view.setFocusableInTouchMode(false);
            }
        }
    }

    /* renamed from: e */
    public static Handler m10451e(View view) {
        Handler handler = null;
        if (view != null) {
            handler = view.getHandler();
        }
        return handler == null ? new Handler() : handler;
    }

    /* renamed from: z */
    private static String m10452z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 32;
                    break;
                case 1:
                    i2 = 32;
                    break;
                case 2:
                    i2 = 55;
                    break;
                case 3:
                    i2 = 19;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10453z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 54);
        }
        return toCharArray;
    }
}
