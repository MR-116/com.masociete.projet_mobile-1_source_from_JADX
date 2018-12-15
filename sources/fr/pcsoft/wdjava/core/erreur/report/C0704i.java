package fr.pcsoft.wdjava.core.erreur.report;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.ressources.C0743a;
import java.util.ArrayList;

/* renamed from: fr.pcsoft.wdjava.core.erreur.report.i */
final class C0704i extends ArrayAdapter<C0698g> {
    /* renamed from: z */
    private static final String[] f1803z = new String[]{C0704i.m2931z(C0704i.m2932z("0DJi,\nD]v1'Bgc20[]h*\n_Ug90")), C0704i.m2931z(C0704i.m2932z("0DJi,\nD]v1'Bge?!S_i,,iVg30")), C0704i.m2931z(C0704i.m2932z("0DJi,\nD]v1'Bg`70Z\\Y78W_c")), C0704i.m2931z(C0704i.m2932z("0DJi,\nD]v1'Bgc20[]h*\nPQc21")), C0704i.m2931z(C0704i.m2932z("0DJi,\nD]v1'Bgc20[]h*\nUYr;2YJ")), C0704i.m2931z(C0704i.m2932z("0DJi,\nD]v1'Bg`70Z\\Y04[]")), C0704i.m2931z(C0704i.m2932z("0DJi,\nD]v1'Bg`70Z\\Y(4ZMc")), C0704i.m2931z(C0704i.m2932z("9WAi+!iQh89WLc,"))};
    /* renamed from: a */
    private LayoutInflater f1804a;
    /* renamed from: b */
    private ArrayList<C0698g> f1805b;

    public C0704i(Context context, ArrayList<C0698g> arrayList) {
        super(context, 0, arrayList);
        this.f1805b = arrayList;
        this.f1804a = (LayoutInflater) context.getSystemService(f1803z[7]);
    }

    /* renamed from: z */
    private static String m2931z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 54;
                    break;
                case 2:
                    i2 = 56;
                    break;
                case 3:
                    i2 = 6;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2932z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 94);
        }
        return toCharArray;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0698g c0698g = (C0698g) this.f1805b.get(i);
        if (c0698g == null) {
            return view;
        }
        if (c0698g.mo2594a()) {
            C0703h c0703h = (C0703h) c0698g;
            view = this.f1804a.inflate(C0743a.m3208d(f1803z[4]), null);
            view.setOnClickListener(null);
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            ((TextView) view.findViewById(C0743a.m3213i(f1803z[1]))).setText(c0703h.m2930b());
            return view;
        } else if (c0698g instanceof C0699c) {
            C0699c c0699c = (C0699c) c0698g;
            view = this.f1804a.inflate(C0743a.m3208d(f1803z[3]), null);
            TextView textView = (TextView) view.findViewById(C0743a.m3213i(f1803z[5]));
            TextView textView2 = (TextView) view.findViewById(C0743a.m3213i(f1803z[6]));
            if (textView != null) {
                textView.setText(c0699c.m2926c());
            }
            if (textView2 == null) {
                return view;
            }
            textView2.setText(c0699c.m2925b());
            return view;
        } else {
            C0709n c0709n = (C0709n) c0698g;
            view = this.f1804a.inflate(C0743a.m3208d(f1803z[0]), null);
            ((ImageView) view.findViewById(C0743a.m3213i(f1803z[2]))).setImageDrawable(Drawable.createFromPath(c0709n.m2948b()));
            return view;
        }
    }
}
