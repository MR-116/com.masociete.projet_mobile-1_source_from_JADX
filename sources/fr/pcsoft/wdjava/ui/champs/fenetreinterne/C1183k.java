package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.k */
class C1183k extends AccessibilityDelegateCompat {
    final C1189p this$0;

    C1183k(C1189p c1189p) {
        this.this$0 = c1189p;
    }

    /* renamed from: a */
    private boolean m8414a() {
        return this.this$0.f3557I != null && this.this$0.f3557I.getCount() > 1;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
        obtain.setScrollable(m8414a());
        if (accessibilityEvent.getEventType() == 4096 && this.this$0.f3557I != null) {
            obtain.setItemCount(this.this$0.f3557I.getCount());
            obtain.setFromIndex(this.this$0.f3579k);
            obtain.setToIndex(this.this$0.f3579k);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
        accessibilityNodeInfoCompat.setScrollable(m8414a());
        if (this.this$0.m8488d(1)) {
            accessibilityNodeInfoCompat.addAction(4096);
        }
        if (this.this$0.m8488d(-1)) {
            accessibilityNodeInfoCompat.addAction(8192);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.this$0.m8488d(1)) {
                    return false;
                }
                this.this$0.m8497i(this.this$0.f3579k + 1);
                return true;
            case 8192:
                if (!this.this$0.m8488d(-1)) {
                    return false;
                }
                this.this$0.m8497i(this.this$0.f3579k - 1);
                return true;
            default:
                return false;
        }
    }
}
