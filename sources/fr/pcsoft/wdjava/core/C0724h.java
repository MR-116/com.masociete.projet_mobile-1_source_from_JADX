package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;

/* renamed from: fr.pcsoft.wdjava.core.h */
/* synthetic */ class C0724h {
    /* renamed from: a */
    static final int[] f1835a = new int[EWDPropriete.values().length];

    static {
        try {
            f1835a[EWDPropriete.PROP_VALEUR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1835a[EWDPropriete.PROP_VALEURINITIALE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1835a[EWDPropriete.PROP_VALEURAFFICHEE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1835a[EWDPropriete.PROP_VALEURMEMORISEE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOM.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOMCOMPLET.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f1835a[EWDPropriete.PROP_TYPE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f1835a[EWDPropriete.PROP_LIBELLE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f1835a[EWDPropriete.PROP_LIGNE.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f1835a[EWDPropriete.PROP_COLONNE.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f1835a[EWDPropriete.PROP_XINITIAL.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f1835a[EWDPropriete.PROP_YINITIAL.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
        }
        try {
            f1835a[EWDPropriete.PROP_X.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
        }
        try {
            f1835a[EWDPropriete.PROP_Y.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEUR.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEURINITIALE.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEURMAX.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEURMIN.ordinal()] = 18;
        } catch (NoSuchFieldError e18) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEUR.ordinal()] = 19;
        } catch (NoSuchFieldError e19) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURINITIALE.ordinal()] = 20;
        } catch (NoSuchFieldError e20) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURMAX.ordinal()] = 21;
        } catch (NoSuchFieldError e21) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURMIN.ordinal()] = 22;
        } catch (NoSuchFieldError e22) {
        }
        try {
            f1835a[EWDPropriete.PROP_COULEUR.ordinal()] = 23;
        } catch (NoSuchFieldError e23) {
        }
        try {
            f1835a[EWDPropriete.PROP_COULEURFOND.ordinal()] = 24;
        } catch (NoSuchFieldError e24) {
        }
        try {
            f1835a[EWDPropriete.PROP_BULLE.ordinal()] = 25;
        } catch (NoSuchFieldError e25) {
        }
        try {
            f1835a[EWDPropriete.PROP_BULLETITRE.ordinal()] = 26;
        } catch (NoSuchFieldError e26) {
        }
        try {
            f1835a[EWDPropriete.PROP_CADRAGEHORIZONTAL.ordinal()] = 27;
        } catch (NoSuchFieldError e27) {
        }
        try {
            f1835a[EWDPropriete.PROP_CADRAGEVERTICAL.ordinal()] = 28;
        } catch (NoSuchFieldError e28) {
        }
        try {
            f1835a[EWDPropriete.PROP_POLICENOM.ordinal()] = 29;
        } catch (NoSuchFieldError e29) {
        }
        try {
            f1835a[EWDPropriete.PROP_POLICETAILLE.ordinal()] = 30;
        } catch (NoSuchFieldError e30) {
        }
        try {
            f1835a[EWDPropriete.PROP_POLICEGRAS.ordinal()] = 31;
        } catch (NoSuchFieldError e31) {
        }
        try {
            f1835a[EWDPropriete.PROP_POLICEITALIQUE.ordinal()] = 32;
        } catch (NoSuchFieldError e32) {
        }
        try {
            f1835a[EWDPropriete.PROP_POLICEBARREE.ordinal()] = 33;
        } catch (NoSuchFieldError e33) {
        }
        try {
            f1835a[EWDPropriete.PROP_POLICESOULIGNEE.ordinal()] = 34;
        } catch (NoSuchFieldError e34) {
        }
        try {
            f1835a[EWDPropriete.PROP_ANCRAGE.ordinal()] = 35;
        } catch (NoSuchFieldError e35) {
        }
        try {
            f1835a[EWDPropriete.PROP_TAUXANCRAGEBAS.ordinal()] = 36;
        } catch (NoSuchFieldError e36) {
        }
        try {
            f1835a[EWDPropriete.PROP_TAUXANCRAGEHAUTEUR.ordinal()] = 37;
        } catch (NoSuchFieldError e37) {
        }
        try {
            f1835a[EWDPropriete.PROP_TAUXANCRAGELARGEUR.ordinal()] = 38;
        } catch (NoSuchFieldError e38) {
        }
        try {
            f1835a[EWDPropriete.PROP_TAUXANCRAGEDROITE.ordinal()] = 39;
        } catch (NoSuchFieldError e39) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOMBRECOLONNE.ordinal()] = 40;
        } catch (NoSuchFieldError e40) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEURCOLONNE.ordinal()] = 41;
        } catch (NoSuchFieldError e41) {
        }
        try {
            f1835a[EWDPropriete.PROP_TITRE.ordinal()] = 42;
        } catch (NoSuchFieldError e42) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURLIGNE.ordinal()] = 43;
        } catch (NoSuchFieldError e43) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURLIGNEMAX.ordinal()] = 44;
        } catch (NoSuchFieldError e44) {
        }
        try {
            f1835a[EWDPropriete.PROP_VISIBLE.ordinal()] = 45;
        } catch (NoSuchFieldError e45) {
        }
        try {
            f1835a[EWDPropriete.PROP_VISIBLEINITIAL.ordinal()] = 46;
        } catch (NoSuchFieldError e46) {
        }
        try {
            f1835a[EWDPropriete.PROP_ETAT.ordinal()] = 47;
        } catch (NoSuchFieldError e47) {
        }
        try {
            f1835a[EWDPropriete.PROP_ETATINITIAL.ordinal()] = 48;
        } catch (NoSuchFieldError e48) {
        }
        try {
            f1835a[EWDPropriete.PROP_BARREDEMESSAGE.ordinal()] = 49;
        } catch (NoSuchFieldError e49) {
        }
        try {
            f1835a[EWDPropriete.PROP_PLAN.ordinal()] = 50;
        } catch (NoSuchFieldError e50) {
        }
        try {
            f1835a[EWDPropriete.PROP_NUMTAB.ordinal()] = 51;
        } catch (NoSuchFieldError e51) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGEMODE.ordinal()] = 52;
        } catch (NoSuchFieldError e52) {
        }
        try {
            f1835a[EWDPropriete.PROP_CONTENUINITIAL.ordinal()] = 53;
        } catch (NoSuchFieldError e53) {
        }
        try {
            f1835a[EWDPropriete.PROP_CURSEURSOURIS.ordinal()] = 54;
        } catch (NoSuchFieldError e54) {
        }
        try {
            f1835a[EWDPropriete.PROP_CLICDROIT.ordinal()] = 55;
        } catch (NoSuchFieldError e55) {
        }
        try {
            f1835a[EWDPropriete.PROP_DOUBLECLIC.ordinal()] = 56;
        } catch (NoSuchFieldError e56) {
        }
        try {
            f1835a[EWDPropriete.PROP_ANIMATION.ordinal()] = 57;
        } catch (NoSuchFieldError e57) {
        }
        try {
            f1835a[EWDPropriete.PROP_ANIMATIONINITIALE.ordinal()] = 58;
        } catch (NoSuchFieldError e58) {
        }
        try {
            f1835a[EWDPropriete.PROP_TRIEE.ordinal()] = 59;
        } catch (NoSuchFieldError e59) {
        }
        try {
            f1835a[EWDPropriete.PROP_MOTDEPASSE.ordinal()] = 60;
        } catch (NoSuchFieldError e60) {
        }
        try {
            f1835a[EWDPropriete.PROP_SELECTIONNEE.ordinal()] = 61;
        } catch (NoSuchFieldError e61) {
        }
        try {
            f1835a[EWDPropriete.PROP_DEPLACABLE.ordinal()] = 62;
        } catch (NoSuchFieldError e62) {
        }
        try {
            f1835a[EWDPropriete.PROP_TRIABLE.ordinal()] = 63;
        } catch (NoSuchFieldError e63) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENFONCE.ordinal()] = 64;
        } catch (NoSuchFieldError e64) {
        }
        try {
            f1835a[EWDPropriete.PROP_CURSEUR.ordinal()] = 65;
        } catch (NoSuchFieldError e65) {
        }
        try {
            f1835a[EWDPropriete.PROP_FINCURSEUR.ordinal()] = 66;
        } catch (NoSuchFieldError e66) {
        }
        try {
            f1835a[EWDPropriete.PROP_TAILLE.ordinal()] = 67;
        } catch (NoSuchFieldError e67) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEURIMAGE.ordinal()] = 68;
        } catch (NoSuchFieldError e68) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURIMAGE.ordinal()] = 69;
        } catch (NoSuchFieldError e69) {
        }
        try {
            f1835a[EWDPropriete.PROP_XIMAGE.ordinal()] = 70;
        } catch (NoSuchFieldError e70) {
        }
        try {
            f1835a[EWDPropriete.PROP_YIMAGE.ordinal()] = 71;
        } catch (NoSuchFieldError e71) {
        }
        try {
            f1835a[EWDPropriete.PROP_OCCURRENCE.ordinal()] = 72;
        } catch (NoSuchFieldError e72) {
        }
        try {
            f1835a[EWDPropriete.PROP_ALTITUDE.ordinal()] = 73;
        } catch (NoSuchFieldError e73) {
        }
        try {
            f1835a[EWDPropriete.PROP_GROUPE.ordinal()] = 74;
        } catch (NoSuchFieldError e74) {
        }
        try {
            f1835a[EWDPropriete.PROP_MENUCONTEXTUEL.ordinal()] = 75;
        } catch (NoSuchFieldError e75) {
        }
        try {
            f1835a[EWDPropriete.PROP_VALEURRENVOYEE.ordinal()] = 76;
        } catch (NoSuchFieldError e76) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOUVEAU.ordinal()] = 77;
        } catch (NoSuchFieldError e77) {
        }
        try {
            f1835a[EWDPropriete.PROP_MODIFIE.ordinal()] = 78;
        } catch (NoSuchFieldError e78) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGE.ordinal()] = 79;
        } catch (NoSuchFieldError e79) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGEETAT.ordinal()] = 80;
        } catch (NoSuchFieldError e80) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGEFOND.ordinal()] = 81;
        } catch (NoSuchFieldError e81) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGEFONDETAT.ordinal()] = 82;
        } catch (NoSuchFieldError e82) {
        }
        try {
            f1835a[EWDPropriete.PROP_VIDE.ordinal()] = 83;
        } catch (NoSuchFieldError e83) {
        }
        try {
            f1835a[EWDPropriete.PROP_TYPESAISIE.ordinal()] = 84;
        } catch (NoSuchFieldError e84) {
        }
        try {
            f1835a[EWDPropriete.PROP_MASQUESAISIE.ordinal()] = 85;
        } catch (NoSuchFieldError e85) {
        }
        try {
            f1835a[EWDPropriete.PROP_MASQUEAFFICHAGE.ordinal()] = 86;
        } catch (NoSuchFieldError e86) {
        }
        try {
            f1835a[EWDPropriete.PROP_FORMATMEMORISE.ordinal()] = 87;
        } catch (NoSuchFieldError e87) {
        }
        try {
            f1835a[EWDPropriete.PROP_PARTIEDATE.ordinal()] = 88;
        } catch (NoSuchFieldError e88) {
        }
        try {
            f1835a[EWDPropriete.PROP_PARTIEHEURE.ordinal()] = 89;
        } catch (NoSuchFieldError e89) {
        }
        try {
            f1835a[EWDPropriete.PROP_ANNEE.ordinal()] = 90;
        } catch (NoSuchFieldError e90) {
        }
        try {
            f1835a[EWDPropriete.PROP_MOIS.ordinal()] = 91;
        } catch (NoSuchFieldError e91) {
        }
        try {
            f1835a[EWDPropriete.PROP_JOUR.ordinal()] = 92;
        } catch (NoSuchFieldError e92) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENJOURS.ordinal()] = 93;
        } catch (NoSuchFieldError e93) {
        }
        try {
            f1835a[EWDPropriete.PROP_HEURE.ordinal()] = 94;
        } catch (NoSuchFieldError e94) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENHEURES.ordinal()] = 95;
        } catch (NoSuchFieldError e95) {
        }
        try {
            f1835a[EWDPropriete.PROP_MINUTE.ordinal()] = 96;
        } catch (NoSuchFieldError e96) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENMINUTES.ordinal()] = 97;
        } catch (NoSuchFieldError e97) {
        }
        try {
            f1835a[EWDPropriete.PROP_SECONDE.ordinal()] = 98;
        } catch (NoSuchFieldError e98) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENSECONDES.ordinal()] = 99;
        } catch (NoSuchFieldError e99) {
        }
        try {
            f1835a[EWDPropriete.PROP_MILLISECONDE.ordinal()] = 100;
        } catch (NoSuchFieldError e100) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENMILLISECONDES.ordinal()] = 101;
        } catch (NoSuchFieldError e101) {
        }
        try {
            f1835a[EWDPropriete.PROP_MULTILIGNE.ordinal()] = 102;
        } catch (NoSuchFieldError e102) {
        }
        try {
            f1835a[EWDPropriete.PROP_COCHEE.ordinal()] = 103;
        } catch (NoSuchFieldError e103) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOTE.ordinal()] = 104;
        } catch (NoSuchFieldError e104) {
        }
        try {
            f1835a[EWDPropriete.PROP_FICHIERPARCOURU.ordinal()] = 105;
        } catch (NoSuchFieldError e105) {
        }
        try {
            f1835a[EWDPropriete.PROP_RUBRIQUEPARCOURUE.ordinal()] = 106;
        } catch (NoSuchFieldError e106) {
        }
        try {
            f1835a[EWDPropriete.PROP_RUBRIQUEAFFICHEE.ordinal()] = 107;
        } catch (NoSuchFieldError e107) {
        }
        try {
            f1835a[EWDPropriete.PROP_RUBRIQUEMEMORISEE.ordinal()] = 108;
        } catch (NoSuchFieldError e108) {
        }
        try {
            f1835a[EWDPropriete.PROP_FILTRE.ordinal()] = 109;
        } catch (NoSuchFieldError e109) {
        }
        try {
            f1835a[EWDPropriete.PROP_LIAISONFICHIER.ordinal()] = 110;
        } catch (NoSuchFieldError e110) {
        }
        try {
            f1835a[EWDPropriete.PROP_ALIAS.ordinal()] = 111;
        } catch (NoSuchFieldError e111) {
        }
        try {
            f1835a[EWDPropriete.PROP_DNDCIBLE.ordinal()] = 112;
        } catch (NoSuchFieldError e112) {
        }
        try {
            f1835a[EWDPropriete.PROP_DNDSOURCE.ordinal()] = 113;
        } catch (NoSuchFieldError e113) {
        }
        try {
            f1835a[EWDPropriete.PROP_AVANCERAPIDE.ordinal()] = 114;
        } catch (NoSuchFieldError e114) {
        }
        try {
            f1835a[EWDPropriete.PROP_MODELISTEIMAGE.ordinal()] = 115;
        } catch (NoSuchFieldError e115) {
        }
        try {
            f1835a[EWDPropriete.PROP_MEMOIRE.ordinal()] = 116;
        } catch (NoSuchFieldError e116) {
        }
        try {
            f1835a[EWDPropriete.PROP_ORIENTATIONVERTICALE.ordinal()] = 117;
        } catch (NoSuchFieldError e117) {
        }
        try {
            f1835a[EWDPropriete.PROP_MINIATURE.ordinal()] = 118;
        } catch (NoSuchFieldError e118) {
        }
        try {
            f1835a[EWDPropriete.PROP_FENETRESOURCE.ordinal()] = 119;
        } catch (NoSuchFieldError e119) {
        }
        try {
            f1835a[EWDPropriete.PROP_ABREVIATION.ordinal()] = C0607n.co;
        } catch (NoSuchFieldError e120) {
        }
        try {
            f1835a[EWDPropriete.PROP_BASEDEDONNEES.ordinal()] = 121;
        } catch (NoSuchFieldError e121) {
        }
        try {
            f1835a[EWDPropriete.PROP_CONDITIONFILTRE.ordinal()] = 122;
        } catch (NoSuchFieldError e122) {
        }
        try {
            f1835a[EWDPropriete.PROP_BORNEMAX.ordinal()] = 123;
        } catch (NoSuchFieldError e123) {
        }
        try {
            f1835a[EWDPropriete.PROP_BORNEMIN.ordinal()] = C0607n.Hn;
        } catch (NoSuchFieldError e124) {
        }
        try {
            f1835a[EWDPropriete.PROP_FILTREAVECBORNES.ordinal()] = 125;
        } catch (NoSuchFieldError e125) {
        }
        try {
            f1835a[EWDPropriete.PROP_CONNEXION.ordinal()] = 126;
        } catch (NoSuchFieldError e126) {
        }
        try {
            f1835a[EWDPropriete.PROP_NBRUBRIQUE.ordinal()] = C0607n.bx;
        } catch (NoSuchFieldError e127) {
        }
        try {
            f1835a[EWDPropriete.PROP_NBRUBRIQUECLE.ordinal()] = 128;
        } catch (NoSuchFieldError e128) {
        }
        try {
            f1835a[EWDPropriete.PROP_NBRUBRIQUEMEMO.ordinal()] = C0607n.Wj;
        } catch (NoSuchFieldError e129) {
        }
        try {
            f1835a[EWDPropriete.PROP_NULLSUPPORTE.ordinal()] = 130;
        } catch (NoSuchFieldError e130) {
        }
        try {
            f1835a[EWDPropriete.PROP_RUBRIQUEFILTREE.ordinal()] = 131;
        } catch (NoSuchFieldError e131) {
        }
        try {
            f1835a[EWDPropriete.PROP_BINAIRE.ordinal()] = C0538a.tb;
        } catch (NoSuchFieldError e132) {
        }
        try {
            f1835a[EWDPropriete.PROP_CLECOMPOSEE.ordinal()] = 133;
        } catch (NoSuchFieldError e133) {
        }
        try {
            f1835a[EWDPropriete.PROP_FICHIERORIGINE.ordinal()] = C0607n.Fb;
        } catch (NoSuchFieldError e134) {
        }
        try {
            f1835a[EWDPropriete.PROP_RUBRIQUEORIGINE.ordinal()] = C0538a.Nb;
        } catch (NoSuchFieldError e135) {
        }
        try {
            f1835a[EWDPropriete.PROP_INDICE.ordinal()] = 136;
        } catch (NoSuchFieldError e136) {
        }
        try {
            f1835a[EWDPropriete.PROP_MEMO.ordinal()] = 137;
        } catch (NoSuchFieldError e137) {
        }
        try {
            f1835a[EWDPropriete.PROP_NBCOMPOSANTE.ordinal()] = 138;
        } catch (NoSuchFieldError e138) {
        }
        try {
            f1835a[EWDPropriete.PROP_NULL.ordinal()] = 139;
        } catch (NoSuchFieldError e139) {
        }
        try {
            f1835a[EWDPropriete.PROP_NUMERIQUE.ordinal()] = C0542t.f1193i;
        } catch (NoSuchFieldError e140) {
        }
        try {
            f1835a[EWDPropriete.PROP_TEXTE.ordinal()] = 141;
        } catch (NoSuchFieldError e141) {
        }
        try {
            f1835a[EWDPropriete.PROP_TYPECLE.ordinal()] = C0536n.f995G;
        } catch (NoSuchFieldError e142) {
        }
        try {
            f1835a[EWDPropriete.PROP_TYPETRI.ordinal()] = 143;
        } catch (NoSuchFieldError e143) {
        }
        try {
            f1835a[EWDPropriete.PROP_VALEURPARDEFAUT.ordinal()] = C0538a.Lb;
        } catch (NoSuchFieldError e144) {
        }
        try {
            f1835a[EWDPropriete.PROP_SOURCE.ordinal()] = 145;
        } catch (NoSuchFieldError e145) {
        }
        try {
            f1835a[EWDPropriete.PROP_UTILISATEUR.ordinal()] = 146;
        } catch (NoSuchFieldError e146) {
        }
        try {
            f1835a[EWDPropriete.PROP_PROVIDER.ordinal()] = 147;
        } catch (NoSuchFieldError e147) {
        }
        try {
            f1835a[EWDPropriete.PROP_ACCES.ordinal()] = 148;
        } catch (NoSuchFieldError e148) {
        }
        try {
            f1835a[EWDPropriete.PROP_SERVEUR.ordinal()] = 149;
        } catch (NoSuchFieldError e149) {
        }
        try {
            f1835a[EWDPropriete.PROP_INFOSETENDUES.ordinal()] = C0536n.f1006y;
        } catch (NoSuchFieldError e150) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOMDECRIT.ordinal()] = 151;
        } catch (NoSuchFieldError e151) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOMPHYSIQUEDECRIT.ordinal()] = 152;
        } catch (NoSuchFieldError e152) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOMPHYSIQUE.ordinal()] = 153;
        } catch (NoSuchFieldError e153) {
        }
        try {
            f1835a[EWDPropriete.PROP_VERTICAL.ordinal()] = 154;
        } catch (NoSuchFieldError e154) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGEDEROULEE.ordinal()] = 155;
        } catch (NoSuchFieldError e155) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGEENROULEE.ordinal()] = 156;
        } catch (NoSuchFieldError e156) {
        }
        try {
            f1835a[EWDPropriete.PROP_SOUSLIBELLE.ordinal()] = 157;
        } catch (NoSuchFieldError e157) {
        }
        try {
            f1835a[EWDPropriete.PROP_CONTENU.ordinal()] = 158;
        } catch (NoSuchFieldError e158) {
        }
        try {
            f1835a[EWDPropriete.PROP_STYLEFOND.ordinal()] = 159;
        } catch (NoSuchFieldError e159) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENROULE.ordinal()] = 160;
        } catch (NoSuchFieldError e160) {
        }
        try {
            f1835a[EWDPropriete.PROP_TYPEREMPLISSAGE.ordinal()] = C0607n.kh;
        } catch (NoSuchFieldError e161) {
        }
        try {
            f1835a[EWDPropriete.PROP_ELLIPSE.ordinal()] = C0607n.Ru;
        } catch (NoSuchFieldError e162) {
        }
        try {
            f1835a[EWDPropriete.PROP_NOUVELENREGISTREMENT.ordinal()] = C0607n.Ao;
        } catch (NoSuchFieldError e163) {
        }
        try {
            f1835a[EWDPropriete.PROP_COULEURJAUGE.ordinal()] = 164;
        } catch (NoSuchFieldError e164) {
        }
        try {
            f1835a[EWDPropriete.PROP_MULTISELECTION.ordinal()] = 165;
        } catch (NoSuchFieldError e165) {
        }
        try {
            f1835a[EWDPropriete.PROP_DATEDEBUT.ordinal()] = 166;
        } catch (NoSuchFieldError e166) {
        }
        try {
            f1835a[EWDPropriete.PROP_DATEFIN.ordinal()] = 167;
        } catch (NoSuchFieldError e167) {
        }
        try {
            f1835a[EWDPropriete.PROP_INDICATION.ordinal()] = 168;
        } catch (NoSuchFieldError e168) {
        }
        try {
            f1835a[EWDPropriete.PROP_SECURITEHTML.ordinal()] = 169;
        } catch (NoSuchFieldError e169) {
        }
        try {
            f1835a[EWDPropriete.PROP_ZOOM.ordinal()] = C0536n.f1002n;
        } catch (NoSuchFieldError e170) {
        }
        try {
            f1835a[EWDPropriete.PROP_MODECARTE.ordinal()] = 171;
        } catch (NoSuchFieldError e171) {
        }
        try {
            f1835a[EWDPropriete.PROP_INFOTRAFICROUTIER.ordinal()] = 172;
        } catch (NoSuchFieldError e172) {
        }
        try {
            f1835a[EWDPropriete.PROP_INFOREALITEAUGMENTEE.ordinal()] = 173;
        } catch (NoSuchFieldError e173) {
        }
        try {
            f1835a[EWDPropriete.PROP_MODETEST.ordinal()] = 174;
        } catch (NoSuchFieldError e174) {
        }
        try {
            f1835a[EWDPropriete.PROP_PUBLICITECHARGEE.ordinal()] = C0607n.hu;
        } catch (NoSuchFieldError e175) {
        }
        try {
            f1835a[EWDPropriete.PROP_FOCUSAUCLIC.ordinal()] = C0607n.aw;
        } catch (NoSuchFieldError e176) {
        }
        try {
            f1835a[EWDPropriete.PROP_AXEXMIN.ordinal()] = C0607n.Nr;
        } catch (NoSuchFieldError e177) {
        }
        try {
            f1835a[EWDPropriete.PROP_AXEXMAX.ordinal()] = C0607n.Gk;
        } catch (NoSuchFieldError e178) {
        }
        try {
            f1835a[EWDPropriete.PROP_AXEYMIN.ordinal()] = C0607n.yt;
        } catch (NoSuchFieldError e179) {
        }
        try {
            f1835a[EWDPropriete.PROP_AXEYMAX.ordinal()] = 180;
        } catch (NoSuchFieldError e180) {
        }
        try {
            f1835a[EWDPropriete.PROP_DUREEANIMATION.ordinal()] = 181;
        } catch (NoSuchFieldError e181) {
        }
        try {
            f1835a[EWDPropriete.PROP_LANGUE.ordinal()] = 182;
        } catch (NoSuchFieldError e182) {
        }
        try {
            f1835a[EWDPropriete.PROP_LANGUEDECRIT.ordinal()] = 183;
        } catch (NoSuchFieldError e183) {
        }
        try {
            f1835a[EWDPropriete.PROP_VALEURRECHERCHE.ordinal()] = 184;
        } catch (NoSuchFieldError e184) {
        }
        try {
            f1835a[EWDPropriete.PROP_OPACITE.ordinal()] = 185;
        } catch (NoSuchFieldError e185) {
        }
        try {
            f1835a[EWDPropriete.PROP_BALAYAGEACTIF.ordinal()] = C0607n.pw;
        } catch (NoSuchFieldError e186) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURUTILE.ordinal()] = 187;
        } catch (NoSuchFieldError e187) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEURUTILE.ordinal()] = 188;
        } catch (NoSuchFieldError e188) {
        }
        try {
            f1835a[EWDPropriete.PROP_ENSAISIE.ordinal()] = 189;
        } catch (NoSuchFieldError e189) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURTITRE.ordinal()] = 190;
        } catch (NoSuchFieldError e190) {
        }
        try {
            f1835a[EWDPropriete.PROP_DEBUTETENDUETOTALE.ordinal()] = 191;
        } catch (NoSuchFieldError e191) {
        }
        try {
            f1835a[EWDPropriete.PROP_DEBUTETENDUEVISIBLE.ordinal()] = 192;
        } catch (NoSuchFieldError e192) {
        }
        try {
            f1835a[EWDPropriete.PROP_FINETENDUETOTALE.ordinal()] = 193;
        } catch (NoSuchFieldError e193) {
        }
        try {
            f1835a[EWDPropriete.PROP_FINETENDUEVISIBLE.ordinal()] = C0607n.nn;
        } catch (NoSuchFieldError e194) {
        }
        try {
            f1835a[EWDPropriete.PROP_DEPLACEMENTRDV.ordinal()] = C0607n.oq;
        } catch (NoSuchFieldError e195) {
        }
        try {
            f1835a[EWDPropriete.PROP_GRANULARITEDEPLACEMENT.ordinal()] = C0607n.Uk;
        } catch (NoSuchFieldError e196) {
        }
        try {
            f1835a[EWDPropriete.PROP_GRANULARITEDUREE.ordinal()] = C0607n.Eg;
        } catch (NoSuchFieldError e197) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURRESSOURCE.ordinal()] = C0607n.jk;
        } catch (NoSuchFieldError e198) {
        }
        try {
            f1835a[EWDPropriete.PROP_HEUREOUVRABLEDEBUT.ordinal()] = 199;
        } catch (NoSuchFieldError e199) {
        }
        try {
            f1835a[EWDPropriete.PROP_HEUREOUVRABLEFIN.ordinal()] = C0607n.Dt;
        } catch (NoSuchFieldError e200) {
        }
        try {
            f1835a[EWDPropriete.PROP_MASQUETITREDATE.ordinal()] = C0607n.Bf;
        } catch (NoSuchFieldError e201) {
        }
        try {
            f1835a[EWDPropriete.PROP_MASQUETITREHEURE.ordinal()] = C0607n.Ug;
        } catch (NoSuchFieldError e202) {
        }
        try {
            f1835a[EWDPropriete.PROP_VERIFIEORTHOGRAPHE.ordinal()] = C0607n.f1465w;
        } catch (NoSuchFieldError e203) {
        }
        try {
            f1835a[EWDPropriete.PROP_RESSOURCESELECTIONNEE.ordinal()] = 204;
        } catch (NoSuchFieldError e204) {
        }
        try {
            f1835a[EWDPropriete.PROP_AUTORISEMASQUAGEACTIONBAR.ordinal()] = C0607n.f1441Y;
        } catch (NoSuchFieldError e205) {
        }
        try {
            f1835a[EWDPropriete.PROP_TAUXPARALLAXEHAUTEUR.ordinal()] = C0607n.me;
        } catch (NoSuchFieldError e206) {
        }
        try {
            f1835a[EWDPropriete.PROP_TAUXPARALLAXEY.ordinal()] = C0607n.Px;
        } catch (NoSuchFieldError e207) {
        }
        try {
            f1835a[EWDPropriete.PROP_BOUTONSUPPRESSION.ordinal()] = C0607n.qj;
        } catch (NoSuchFieldError e208) {
        }
        try {
            f1835a[EWDPropriete.PROP_IMAGEFONDLIGNE.ordinal()] = C0607n.af;
        } catch (NoSuchFieldError e209) {
        }
        try {
            f1835a[EWDPropriete.PROP_SAISIEDIRECTERDV.ordinal()] = C0607n.Bs;
        } catch (NoSuchFieldError e210) {
        }
        try {
            f1835a[EWDPropriete.PROP_SELECTIONPERIODE.ordinal()] = C0607n.lh;
        } catch (NoSuchFieldError e211) {
        }
        try {
            f1835a[EWDPropriete.PROP_RESSOURCE.ordinal()] = C0607n.Ep;
        } catch (NoSuchFieldError e212) {
        }
        try {
            f1835a[EWDPropriete.PROP_NBTHREADATTENTE.ordinal()] = 213;
        } catch (NoSuchFieldError e213) {
        }
        try {
            f1835a[EWDPropriete.PROP_AJOUTTERMINE.ordinal()] = 214;
        } catch (NoSuchFieldError e214) {
        }
        try {
            f1835a[EWDPropriete.PROP_COULEURTEXTEAUTOMATIQUE.ordinal()] = 215;
        } catch (NoSuchFieldError e215) {
        }
        try {
            f1835a[EWDPropriete.PROP_LARGEURELEMENT.ordinal()] = 216;
        } catch (NoSuchFieldError e216) {
        }
        try {
            f1835a[EWDPropriete.PROP_HAUTEURELEMENT.ordinal()] = 217;
        } catch (NoSuchFieldError e217) {
        }
        try {
            f1835a[EWDPropriete.PROP_MARGEHAUTEUR.ordinal()] = 218;
        } catch (NoSuchFieldError e218) {
        }
        try {
            f1835a[EWDPropriete.PROP_MARGELARGEUR.ordinal()] = 219;
        } catch (NoSuchFieldError e219) {
        }
        try {
            f1835a[EWDPropriete.PROP_COMPACTEOPTION.ordinal()] = C0607n.Tv;
        } catch (NoSuchFieldError e220) {
        }
        try {
            f1835a[EWDPropriete.PROP_CRYPTAGE.ordinal()] = C0607n.Qt;
        } catch (NoSuchFieldError e221) {
        }
        try {
            f1835a[EWDPropriete.PROP_MEMBRE.ordinal()] = C0607n.Cv;
        } catch (NoSuchFieldError e222) {
        }
        try {
            f1835a[EWDPropriete.PROP_OPTION.ordinal()] = 223;
        } catch (NoSuchFieldError e223) {
        }
        try {
            f1835a[EWDPropriete.PROP_TIMESTAMPUTC.ordinal()] = 224;
        } catch (NoSuchFieldError e224) {
        }
        try {
            f1835a[EWDPropriete.PROP_PERSISTANCERUBRIQUECALCULEE.ordinal()] = 225;
        } catch (NoSuchFieldError e225) {
        }
        try {
            f1835a[EWDPropriete.PROP_FORMULERUBRIQUECALCULEE.ordinal()] = 226;
        } catch (NoSuchFieldError e226) {
        }
        try {
            f1835a[EWDPropriete.PROP_VALEURPARDEFAUTCALCULEE.ordinal()] = 227;
        } catch (NoSuchFieldError e227) {
        }
        try {
            f1835a[EWDPropriete.PROP_TIMESTAMPTYPE.ordinal()] = 228;
        } catch (NoSuchFieldError e228) {
        }
        try {
            f1835a[EWDPropriete.PROP_TITRENOTE.ordinal()] = C0607n.Yw;
        } catch (NoSuchFieldError e229) {
        }
        try {
            f1835a[EWDPropriete.PROP_COULEURBARRESYSTEME.ordinal()] = C0607n.no;
        } catch (NoSuchFieldError e230) {
        }
        try {
            f1835a[EWDPropriete.PROP_SCROLLAUDOIGT.ordinal()] = 231;
        } catch (NoSuchFieldError e231) {
        }
        try {
            f1835a[EWDPropriete.PROP_ZOOMAUDOIGT.ordinal()] = 232;
        } catch (NoSuchFieldError e232) {
        }
        try {
            f1835a[EWDPropriete.PROP_RENDEZVOUSCONTINU.ordinal()] = 233;
        } catch (NoSuchFieldError e233) {
        }
        try {
            f1835a[EWDPropriete.PROP_BALAYAGEVERTICAL.ordinal()] = C0607n.Jn;
        } catch (NoSuchFieldError e234) {
        }
        try {
            f1835a[EWDPropriete.PROP_RETRAITGAUCHE.ordinal()] = 235;
        } catch (NoSuchFieldError e235) {
        }
        try {
            f1835a[EWDPropriete.PROP_RETRAITDROIT.ordinal()] = 236;
        } catch (NoSuchFieldError e236) {
        }
        try {
            f1835a[EWDPropriete.PROP_RETRAITHAUT.ordinal()] = C0607n.yk;
        } catch (NoSuchFieldError e237) {
        }
        try {
            f1835a[EWDPropriete.PROP_RETRAITBAS.ordinal()] = 238;
        } catch (NoSuchFieldError e238) {
        }
        try {
            f1835a[EWDPropriete.PROP_COULEURFONDTITRE.ordinal()] = C0607n.Au;
        } catch (NoSuchFieldError e239) {
        }
        try {
            f1835a[EWDPropriete.PROP_ANCRAGEAUCONTENU.ordinal()] = 240;
        } catch (NoSuchFieldError e240) {
        }
        try {
            f1835a[EWDPropriete.PROP_MARGEINTERCELLULES.ordinal()] = C0607n.bh;
        } catch (NoSuchFieldError e241) {
        }
        try {
            f1835a[EWDPropriete.PROP_AVECZOOM.ordinal()] = 242;
        } catch (NoSuchFieldError e242) {
        }
        try {
            f1835a[EWDPropriete.PROP_NUM1ERJOURDELASEMAINE.ordinal()] = C0607n.Xn;
        } catch (NoSuchFieldError e243) {
        }
        try {
            f1835a[EWDPropriete.PROP_UNDEF.ordinal()] = C0607n.uw;
        } catch (NoSuchFieldError e244) {
        }
        try {
            f1835a[EWDPropriete.PROP_AVANT.ordinal()] = 245;
        } catch (NoSuchFieldError e245) {
        }
        try {
            f1835a[EWDPropriete.PROP_APRES.ordinal()] = 246;
        } catch (NoSuchFieldError e246) {
        }
    }
}