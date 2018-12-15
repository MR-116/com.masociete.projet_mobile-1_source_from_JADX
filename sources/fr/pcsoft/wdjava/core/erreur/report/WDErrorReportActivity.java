package fr.pcsoft.wdjava.core.erreur.report;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class WDErrorReportActivity extends Activity {
    /* renamed from: a */
    public static final String f1786a = m2916z(m2917z("%:\u00194%\u0003\f\n)2\u00121\u001a38\u0003"));
    /* renamed from: b */
    public static final String f1787b = m2916z(m2917z("#6\u001d72"));
    /* renamed from: d */
    public static final String f1788d = m2916z(m2917z("%:\u00194%\u0003\u001b\b/6#'\u001d"));
    /* renamed from: f */
    public static final String f1789f = m2916z(m2917z("22\b2;6;\r)2\u0004,"));
    /* renamed from: h */
    public static final String f1790h = m2916z(m2917z("%:\u00194%\u0003\u001b\b/6=\f&\u0015"));
    /* renamed from: z */
    private static final String[] f1791z;
    /* renamed from: c */
    private int f1792c = 0;
    /* renamed from: e */
    private int f1793e = 0;
    /* renamed from: g */
    private int f1794g = 0;

    static {
        r0 = new String[18];
        r0[0] = m2916z(m2917z("\u0016<\u001d28\u0019\u0000\n4'\u000e"));
        r0[1] = m2916z(m2917z("\u0016<\u001d28\u0019\u0000\f66\u001e3"));
        r0[2] = m2916z(m2917z("\u0016<\u001d28\u0019\u0000\u001a36\u0005:"));
        r0[3] = m2916z(m2917z("\u0012-\u001b4%(-\f+8\u0005+6:4\u00036\u001f2#\u000e\u0000\u0004>9\u0002"));
        r0[4] = m2916z(m2917z("\u00143\u0000+5\u0018>\u001b?"));
        r0[5] = m2916z(m2917z("T\r,\u000b\u0018%\u000b6\u001e\u0019!\u0010 \u0004\u0012:\u001e \u0017"));
        r0[6] = m2916z(m2917z("\u00161\r)8\u001e;G29\u0003:\u0007/y\u0012'\u001d)6Y\u000b,\u0003\u0003"));
        r0[7] = m2916z(m2917z("T\r,\u000b\u0018%\u000b6\u0018\u0018'\u0016,\u0004\u0007%\u001a:\b\u0012(\u000f(\u000b\u001e2\r"));
        r0[8] = m2916z(m2917z("\u00161\r)8\u001e;G29\u0003:\u0007/y\u0012'\u001d)6Y\f=\t\u00126\u0012"));
        r0[9] = m2916z(m2917z("\u00161\r)8\u001e;G29\u0003:\u0007/y\u0012'\u001d)6Y\u001a$\u001a\u001e;"));
        r0[10] = m2916z(m2917z("\u00161\r)8\u001e;G29\u0003:\u0007/y\u0012'\u001d)6Y\f<\u0019\u001d2\u001c="));
        r0[11] = m2916z(m2917z("]pC"));
        r0[12] = m2916z(m2917z("T\r,\u000b\u0018%\u000b6\u000b\u0016%\u000b(\u001c\u0012"));
        r0[13] = m2916z(m2917z("\u001a:\u001a(6\u0010:F)1\u0014mQie"));
        r0[14] = m2916z(m2917z("\u00161\r)8\u001e;G29\u0003:\u0007/y\u0016<\u001d28\u0019q:\u001e\u00193"));
        r0[15] = m2916z(m2917z("2-\u001b>\"\u0005\r.%\u00161\u001d{;\u0016\u0005>4\u0003*\u001b>w\u0013*I)6\u0007/\u0006)#W;N>%\u0005:\u001c)w\u0016*I=8\u00052\b/w=\f&\u0015"));
        r0[16] = m2916z(m2917z("%>\u0019+8\u0005+I?p\u0012-\u001b>\"\u0005\b9$\u00121\u001du"));
        r0[17] = m2916z(m2917z("\u00116\u0005>mXp"));
        f1791z = r0;
    }

    /* renamed from: z */
    private static String m2916z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 95;
                    break;
                case 2:
                    i2 = 105;
                    break;
                case 3:
                    i2 = 91;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2917z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 87);
        }
        return toCharArray;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        setTitle(intent.getStringExtra(f1787b));
        String stringExtra = intent.getStringExtra(f1790h);
        try {
            if (C0808l.m4053k(stringExtra)) {
                C0691a.m2856a(f1791z[16]);
                finish();
            }
            ArrayList arrayList = new ArrayList();
            ListAdapter c0704i = new C0704i(this, arrayList);
            try {
                JSONObject jSONObject = (JSONObject) new JSONTokener(stringExtra).nextValue();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    arrayList.add(new C0703h(str));
                    JSONObject jSONObject2 = (JSONObject) jSONObject.get(str);
                    if (jSONObject2 instanceof JSONObject) {
                        Iterator keys2 = jSONObject2.keys();
                        while (keys2.hasNext()) {
                            String str2 = (String) keys2.next();
                            String obj = jSONObject2.get(str2).toString();
                            if (obj.startsWith(f1791z[17])) {
                                arrayList.add(new C0709n(obj.substring(f1791z[17].length())));
                            } else {
                                arrayList.add(new C0699c(str2, obj));
                            }
                        }
                        continue;
                    }
                }
            } catch (JSONException e) {
                throw e;
            } catch (Exception e2) {
                C0691a.m2857a(f1791z[15], e2);
                finish();
            }
            View listView = new ListView(this);
            listView.setOnItemClickListener(new C0708m(this, c0704i));
            listView.setAdapter(c0704i);
            setContentView(listView);
        } catch (JSONException e3) {
            throw e3;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0743a.m3209e(f1791z[3]), menu);
        super.onCreateOptionsMenu(menu);
        this.f1794g = C0743a.m3213i(f1791z[0]);
        menu.findItem(this.f1794g).setShowAsAction(2);
        this.f1793e = C0743a.m3213i(f1791z[2]);
        menu.findItem(this.f1793e).setShowAsAction(2);
        this.f1792c = C0743a.m3213i(f1791z[1]);
        MenuItem findItem = menu.findItem(this.f1792c);
        if (C0808l.m4053k(getIntent().getStringExtra(f1789f))) {
            findItem.setVisible(false);
        } else {
            findItem.setShowAsAction(2);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == this.f1794g) {
            ((ClipboardManager) getSystemService(f1791z[4])).setPrimaryClip(ClipData.newPlainText("", getIntent().getStringExtra(f1788d)));
            Toast.makeText(this, C0745b.m3224c(f1791z[7], new String[0]), 0).show();
        } else if (itemId == this.f1793e || itemId == this.f1792c) {
            CharSequence c;
            Intent intent = new Intent();
            Intent intent2 = getIntent();
            intent.setAction(f1791z[14]);
            String stringExtra = intent2.getStringExtra(f1786a);
            if (!C0808l.m4053k(stringExtra)) {
                intent.putExtra(f1791z[8], Uri.parse(stringExtra));
            }
            intent.putExtra(f1791z[6], intent2.getStringExtra(f1788d));
            if (itemId == this.f1792c) {
                c = C0745b.m3224c(f1791z[5], new String[0]);
                intent.setType(f1791z[13]);
                if (!C0808l.m4053k(intent2.getStringExtra(f1789f))) {
                    intent.putExtra(f1791z[9], new String[]{r2});
                }
                intent.putExtra(f1791z[10], getTitle());
            } else {
                c = C0745b.m3224c(f1791z[12], new String[0]);
                intent.setType(f1791z[11]);
            }
            List queryIntentActivities = getPackageManager().queryIntentActivities(intent, 65536);
            if (!(queryIntentActivities == null || queryIntentActivities.isEmpty())) {
                startActivity(Intent.createChooser(intent, c));
            }
        }
        return true;
    }
}
