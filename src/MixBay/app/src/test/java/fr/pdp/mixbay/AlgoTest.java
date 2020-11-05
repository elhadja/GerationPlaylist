/**
 * Application MixBay
 *
 * @authors E. Bah, N. Deguillaume, L. Jolliet, J. Loison, P. Vigneau
 * @version 1.0
 * Génération de playlistes musicales pour un groupe d'utilisateurs
 * PdP 2019-2020 Université de Bordeaux
 */

package fr.pdp.mixbay;

import org.junit.Before;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import fr.pdp.mixbay.business.models.Playlist;
import fr.pdp.mixbay.business.models.Track;
import fr.pdp.mixbay.business.models.TrackFeatures;
import fr.pdp.mixbay.business.models.User;

public class AlgoTest {
    User u1 = new User("1","1");
    User u2 = new User("2","2");
    User u3 = new User("3","3");
    Set<User> users = new HashSet<>();
    Playlist p1 = new Playlist("1","1");
    Playlist p2 = new Playlist("2","2");
    Playlist p3 = new Playlist("3","3");
    Playlist p4 = new Playlist("4","4");
    Playlist p5 = new Playlist("5","5");
    Track t1 = new Track("1","1",null, null, null);
    Track t2 = new Track("2","2",null, null, null);
    Track t3 = new Track("3","3",null, null, null);
    Track t4 = new Track("4","4",null, null, null);
    Track t5 = new Track("5","5",null, null, null);
    Track t6 = new Track("6","6",null, null, null);
    Track t7 = new Track("7","7",null, null, null);
    Track t8 = new Track("8","8",null, null, null);
    Track t9 = new Track("9","9",null, null, null);
    Track t10 = new Track("10","10",null, null, null);
    Track t11 = new Track("11","11",null, null, null);
    Track t12 = new Track("12","12",null, null, null);
    Track t13 = new Track("13","13",null, null, null);
    Track t14 = new Track("14","14",null, null, null);
    Track t15 = new Track("15","15",null, null, null);
    Track t16 = new Track("16","16",null, null, null);
    Track t17 = new Track("17","17",null, null, null);
    Track t18 = new Track("18","18",null, null, null);
    Track t19 = new Track("19","19",null, null, null);
    Track t20 = new Track("20","20",null, null, null);
    Track t21 = new Track("21","21",null, null, null);
    Track t22 = new Track("22","22",null, null, null);
    Track t23 = new Track("23","23",null, null, null);
    Track t24 = new Track("24","24",null, null, null);
    Track t25 = new Track("25","25",null, null, null);
    Track t26 = new Track("26","26",null, null, null);
    Track t27 = new Track("27","27",null, null, null);
    Track t28 = new Track("28","28",null, null, null);
    Track t29 = new Track("29","29",null, null, null);
    Track t30 = new Track("30","30",null, null, null);
    Track t31 = new Track("31","31",null, null, null);
    Track t32 = new Track("32","32",null, null, null);
    Track t33 = new Track("33","33",null, null, null);
    Track t34 = new Track("34","34",null, null, null);
    Track t35 = new Track("35","35",null, null, null);
    Track t36 = new Track("36","36",null, null, null);
    Track t37 = new Track("37","37",null, null, null);
    Track t38 = new Track("38","38",null, null, null);
    Track t39 = new Track("39","39",null, null, null);
    Track t40 = new Track("40","40",null, null, null);
    Track t41 = new Track("41","41",null, null, null);
    Track t42 = new Track("42","42",null, null, null);
    Track t43 = new Track("43","43",null, null, null);
    Track t44 = new Track("44","44",null, null, null);
    Track t45 = new Track("45","45",null, null, null);
    Track t46 = new Track("46","46",null, null, null);
    Track t47 = new Track("47","47",null, null, null);
    Track t48 = new Track("48","48",null, null, null);
    Track t49 = new Track("49","49",null, null, null);
    Track t50 = new Track("50","50",null, null, null);
    TrackFeatures tf1 = new TrackFeatures(0.1,0.7,0.2,0.8,0.5,0.3,0.6);
    TrackFeatures tf2 = new TrackFeatures(0.1,0.6,0.2,0.3,0.1,0.8,0.5);
    TrackFeatures tf3 = new TrackFeatures(0.1,0.1,0.3,0.5,0.7,0.4,0.2);
    TrackFeatures tf4 = new TrackFeatures(0.5,0.1,0.7,0.1,0.2,0.4,0.8);
    TrackFeatures tf5 = new TrackFeatures(0.1,0.3,0.3,0.3,0.6,0.4,0.6);
    TrackFeatures tf6 = new TrackFeatures(0.2,0.2,0.4,0.6,0.3,0.4,0.8);
    TrackFeatures tf7 = new TrackFeatures(0.8,0.1,0.6,0.3,0.5,0.7,0.6);
    TrackFeatures tf8 = new TrackFeatures(0.8,0.5,0.3,0.6,0.2,0.2,0.8);
    TrackFeatures tf9 = new TrackFeatures(0.1,0.7,0.7,0.6,0.8,0.3,0.7);
    TrackFeatures tf10 = new TrackFeatures(0.7,0.7,0.1,0.7,0.5,0.8,0.8);
    TrackFeatures tf11 = new TrackFeatures(0.7,0.4,0.1,0.6,0.2,0.3,0.2);
    TrackFeatures tf12 = new TrackFeatures(0.5,0.7,0.5,0.2,0.1,0.6,0.7);
    TrackFeatures tf13 = new TrackFeatures(0.8,0.6,0.6,0.6,0.2,0.2,0.4);
    TrackFeatures tf14 = new TrackFeatures(0.8,0.8,0.8,0.2,0.1,0.3,0.8);
    TrackFeatures tf15 = new TrackFeatures(0.4,0.5,0.1,0.7,0.5,0.1,0.2);
    TrackFeatures tf16 = new TrackFeatures(0.1,0.3,0.1,0.8,0.6,0.3,0.4);
    TrackFeatures tf17 = new TrackFeatures(0.8,0.6,0.5,0.7,0.3,0.3,0.1);
    TrackFeatures tf18 = new TrackFeatures(0.1,0.8,0.6,0.7,0.6,0.8,0.3);
    TrackFeatures tf19 = new TrackFeatures(0.7,0.1,0.1,0.1,0.4,0.8,0.1);
    TrackFeatures tf20 = new TrackFeatures(0.8,0.7,0.4,0.6,0.8,0.7,0.5);
    TrackFeatures tf21 = new TrackFeatures(0.5,0.5,0.2,0.3,0.6,0.2,0.2);
    TrackFeatures tf22 = new TrackFeatures(0.8,0.8,0.1,0.3,0.6,0.2,0.5);
    TrackFeatures tf23 = new TrackFeatures(0.4,0.7,0.1,0.6,0.3,0.6,0.7);
    TrackFeatures tf24 = new TrackFeatures(0.8,0.1,0.7,0.1,0.2,0.6,0.8);
    TrackFeatures tf25 = new TrackFeatures(0.3,0.8,0.3,0.8,0.8,0.5,0.8);
    TrackFeatures tf26 = new TrackFeatures(0.2,0.1,0.6,0.5,0.8,0.3,0.3);
    TrackFeatures tf27 = new TrackFeatures(0.4,0.4,0.3,0.8,0.4,0.3,0.5);
    TrackFeatures tf28 = new TrackFeatures(0.7,0.8,0.8,0.7,0.2,0.8,0.3);
    TrackFeatures tf29 = new TrackFeatures(0.3,0.3,0.3,0.1,0.5,0.2,0.8);
    TrackFeatures tf30 = new TrackFeatures(0.7,0.3,0.3,0.5,0.4,0.2,0.3);
    TrackFeatures tf31 = new TrackFeatures(0.2,0.8,0.8,0.4,0.4,0.6,0.5);
    TrackFeatures tf32 = new TrackFeatures(0.5,0.4,0.7,0.5,0.7,0.4,0.3);
    TrackFeatures tf33 = new TrackFeatures(0.5,0.3,0.7,0.4,0.3,0.4,0.4);
    TrackFeatures tf34 = new TrackFeatures(0.1,0.1,0.5,0.8,0.8,0.6,0.3);
    TrackFeatures tf35 = new TrackFeatures(0.6,0.1,0.7,0.5,0.2,0.3,0.5);
    TrackFeatures tf36 = new TrackFeatures(0.1,0.3,0.3,0.6,0.6,0.3,0.7);
    TrackFeatures tf37 = new TrackFeatures(0.4,0.7,0.2,0.4,0.6,0.2,0.7);
    TrackFeatures tf38 = new TrackFeatures(0.7,0.2,0.4,0.2,0.8,0.3,0.7);
    TrackFeatures tf39 = new TrackFeatures(0.7,0.3,0.6,0.2,0.5,0.7,0.1);
    TrackFeatures tf40 = new TrackFeatures(0.5,0.7,0.8,0.3,0.1,0.2,0.5);
    TrackFeatures tf41 = new TrackFeatures(0.5,0.2,0.6,0.8,0.7,0.7,0.8);
    TrackFeatures tf42 = new TrackFeatures(0.3,0.1,0.5,0.5,0.5,0.6,0.8);
    TrackFeatures tf43 = new TrackFeatures(0.2,0.8,0.1,0.8,0.3,0.1,0.1);
    TrackFeatures tf44 = new TrackFeatures(0.5,0.1,0.4,0.3,0.4,0.6,0.5);
    TrackFeatures tf45 = new TrackFeatures(0.2,0.5,0.2,0.8,0.3,0.2,0.5);
    TrackFeatures tf46 = new TrackFeatures(0.4,0.6,0.7,0.8,0.6,0.6,0.1);
    TrackFeatures tf47 = new TrackFeatures(0.2,0.4,0.2,0.4,0.6,0.6,0.3);
    TrackFeatures tf48 = new TrackFeatures(0.6,0.3,0.2,0.6,0.4,0.7,0.7);
    TrackFeatures tf49 = new TrackFeatures(0.5,0.1,0.1,0.6,0.1,0.6,0.5);
    TrackFeatures tf50 = new TrackFeatures(0.8,0.8,0.6,0.5,0.8,0.5,0.2);
    HashMap<String, Track> trackList = new HashMap<>();
    Map<String, Map<String, Double>> scoreMap = new HashMap<>();

    @Before
    public void init(){
        users.add(u1);
        users.add(u2);
        users.add(u3);
        trackList.put("1", t1);
        trackList.put("2", t2);
        trackList.put("3", t3);
        trackList.put("4", t4);
        trackList.put("5", t5);
        trackList.put("6", t6);
        trackList.put("7", t7);
        trackList.put("8", t8);
        trackList.put("9", t9);
        trackList.put("10", t10);
        trackList.put("11", t11);
        trackList.put("12", t12);
        trackList.put("13", t13);
        trackList.put("14", t14);
        trackList.put("15", t15);
        trackList.put("16", t16);
        trackList.put("17", t17);
        trackList.put("18", t18);
        trackList.put("19", t19);
        trackList.put("20", t20);
        trackList.put("21", t21);
        trackList.put("22", t22);
        trackList.put("23", t23);
        trackList.put("24", t24);
        trackList.put("25", t25);
        trackList.put("26", t26);
        trackList.put("27", t27);
        trackList.put("28", t28);
        trackList.put("29", t29);
        trackList.put("30", t30);
        trackList.put("31", t31);
        trackList.put("32", t32);
        trackList.put("33", t33);
        trackList.put("34", t34);
        trackList.put("35", t35);
        trackList.put("36", t36);
        trackList.put("37", t37);
        trackList.put("38", t38);
        trackList.put("39", t39);
        trackList.put("40", t40);
        trackList.put("41", t41);
        trackList.put("42", t42);
        trackList.put("43", t43);
        trackList.put("44", t44);
        trackList.put("45", t45);
        trackList.put("46", t46);
        trackList.put("47", t47);
        trackList.put("48", t48);
        trackList.put("49", t49);
        trackList.put("50", t50);
        t1.setFeatures(tf1);
        t2.setFeatures(tf2);
        t3.setFeatures(tf3);
        t4.setFeatures(tf4);
        t5.setFeatures(tf5);
        t6.setFeatures(tf6);
        t7.setFeatures(tf7);
        t8.setFeatures(tf8);
        t9.setFeatures(tf9);
        t10.setFeatures(tf10);
        t11.setFeatures(tf11);
        t12.setFeatures(tf12);
        t13.setFeatures(tf13);
        t14.setFeatures(tf14);
        t15.setFeatures(tf15);
        t16.setFeatures(tf16);
        t17.setFeatures(tf17);
        t18.setFeatures(tf18);
        t19.setFeatures(tf19);
        t20.setFeatures(tf20);
        t21.setFeatures(tf21);
        t22.setFeatures(tf22);
        t23.setFeatures(tf23);
        t24.setFeatures(tf24);
        t25.setFeatures(tf25);
        t26.setFeatures(tf26);
        t27.setFeatures(tf27);
        t28.setFeatures(tf28);
        t29.setFeatures(tf29);
        t30.setFeatures(tf30);
        t31.setFeatures(tf31);
        t32.setFeatures(tf32);
        t33.setFeatures(tf33);
        t34.setFeatures(tf34);
        t35.setFeatures(tf35);
        t36.setFeatures(tf36);
        t37.setFeatures(tf37);
        t38.setFeatures(tf38);
        t39.setFeatures(tf39);
        t40.setFeatures(tf40);
        t41.setFeatures(tf41);
        t42.setFeatures(tf42);
        t43.setFeatures(tf43);
        t44.setFeatures(tf44);
        t45.setFeatures(tf45);
        t46.setFeatures(tf46);
        t47.setFeatures(tf47);
        t48.setFeatures(tf48);
        t49.setFeatures(tf49);
        t50.setFeatures(tf50);
        p1.addTrack(t1);
        p1.addTrack(t2);
        p1.addTrack(t3);
        p1.addTrack(t4);
        p1.addTrack(t5);
        p1.addTrack(t6);
        p1.addTrack(t7);
        p1.addTrack(t8);
        p1.addTrack(t9);
        p1.addTrack(t10);
        p2.addTrack(t11);
        p2.addTrack(t12);
        p2.addTrack(t13);
        p2.addTrack(t14);
        p2.addTrack(t15);
        p2.addTrack(t16);
        p2.addTrack(t17);
        p2.addTrack(t18);
        p2.addTrack(t19);
        p2.addTrack(t20);
        p3.addTrack(t21);
        p3.addTrack(t22);
        p3.addTrack(t23);
        p3.addTrack(t24);
        p3.addTrack(t25);
        p3.addTrack(t26);
        p3.addTrack(t27);
        p3.addTrack(t28);
        p3.addTrack(t29);
        p3.addTrack(t30);
        p4.addTrack(t31);
        p4.addTrack(t32);
        p4.addTrack(t33);
        p4.addTrack(t34);
        p4.addTrack(t35);
        p4.addTrack(t36);
        p4.addTrack(t37);
        p4.addTrack(t38);
        p4.addTrack(t39);
        p4.addTrack(t40);
        p5.addTrack(t41);
        p5.addTrack(t42);
        p5.addTrack(t43);
        p5.addTrack(t44);
        p5.addTrack(t45);
        p5.addTrack(t46);
        p5.addTrack(t47);
        p5.addTrack(t48);
        p5.addTrack(t49);
        p5.addTrack(t50);
        u1.addPlaylist(p1);
        u1.addPlaylist(p2);
        u2.addPlaylist(p3);
        u2.addPlaylist(p4);
        u3.addPlaylist(p5);
        Map<String, Double> subScoreMap = new HashMap<>();
        subScoreMap.put("44", 0.8381507931022892);
        subScoreMap.put("45", 0.6735508566635335);
        subScoreMap.put("46", 1.2442567869325214);
        subScoreMap.put("47", 0.6929117815898969);
        subScoreMap.put("48", 0.9127113552928978);
        subScoreMap.put("49", 0.7168169126829412);
        subScoreMap.put("50", 1.433555188510158);
        subScoreMap.put("10", 1.2769452135397052);
        subScoreMap.put("11", 0.6781810262709351);
        subScoreMap.put("12", 0.851048149285133);
        subScoreMap.put("13", 1.0344649709989062);
        subScoreMap.put("14", 1.1057252000816875);
        subScoreMap.put("15", 0.8460608088152737);
        subScoreMap.put("16", 0.9320059053515193);
        subScoreMap.put("17", 1.0879233287788415);
        subScoreMap.put("18", 1.1002632921644855);
        subScoreMap.put("19", 0.8493419404469326);
        subScoreMap.put("1", 0.9361791299396012);
        subScoreMap.put("2", 0.9484312643137861);
        subScoreMap.put("3", 0.6103315808583171);
        subScoreMap.put("4", 1.0324727554930964);
        subScoreMap.put("5", 0.7421275007553355);
        subScoreMap.put("6", 0.7930046179514189);
        subScoreMap.put("7", 1.0308626517467938);
        subScoreMap.put("8", 1.1265542751123965);
        subScoreMap.put("9", 1.2167800894636098);
        subScoreMap.put("20", 1.3854021780679384);
        subScoreMap.put("21", 0.5132192838586517);
        subScoreMap.put("22", 1.030083646669803);
        subScoreMap.put("23", 1.0183193578740928);
        subScoreMap.put("24", 1.1082245418355086);
        subScoreMap.put("25", 1.2210506846637286);
        subScoreMap.put("26", 0.8856568460844034);
        subScoreMap.put("27", 0.8224255371640852);
        subScoreMap.put("28", 1.4137045069098135);
        subScoreMap.put("29", 0.5708933837100839);
        subScoreMap.put("30", 0.7378351053018831);
        subScoreMap.put("31", 0.9942554698666517);
        subScoreMap.put("32", 0.8570783369547923);
        subScoreMap.put("33", 0.7854592555007414);
        subScoreMap.put("34", 1.1703657366941136);
        subScoreMap.put("35", 0.8708524812930208);
        subScoreMap.put("36", 0.7092338026234156);
        subScoreMap.put("37", 0.9601396427848216);
        subScoreMap.put("38", 0.9588441305667578);
        subScoreMap.put("39", 1.0119656614313626);
        subScoreMap.put("40", 1.0511667484517102);
        subScoreMap.put("41", 1.2074408361855484);
        subScoreMap.put("42", 1.0720263054437238);
        subScoreMap.put("43", 1.018456746442036);
        scoreMap.put("1", subScoreMap);
        subScoreMap = new HashMap<>();
        subScoreMap.put("44", 0.7265973742216336);
        subScoreMap.put("45", 0.6759164738702568);
        subScoreMap.put("46", 1.1483433262694287);
        subScoreMap.put("47", 0.7416934049561605);
        subScoreMap.put("48", 1.0449097137642713);
        subScoreMap.put("49", 0.8694021066529631);
        subScoreMap.put("50", 1.3022972433342779);
        subScoreMap.put("10", 1.1679540487041558);
        subScoreMap.put("11", 0.7802744159487691);
        subScoreMap.put("12", 0.9808342103139286);
        subScoreMap.put("13", 0.9509899815130813);
        subScoreMap.put("14", 1.1497236395111785);
        subScoreMap.put("15", 0.7860466418164496);
        subScoreMap.put("16", 0.8173813140616771);
        subScoreMap.put("17", 1.0745259722378016);
        subScoreMap.put("18", 1.2718241972850661);
        subScoreMap.put("19", 0.7895518114829151);
        subScoreMap.put("1", 0.8447840413203342);
        subScoreMap.put("2", 0.8180102633353442);
        subScoreMap.put("3", 0.6084810512486819);
        subScoreMap.put("4", 0.906500796831043);
        subScoreMap.put("5", 0.5302642511540049);
        subScoreMap.put("6", 0.8574419641386464);
        subScoreMap.put("7", 1.1268217219568961);
        subScoreMap.put("8", 0.8285429385839064);
        subScoreMap.put("9", 1.272807386440652);
        subScoreMap.put("20", 1.158023063218694);
        subScoreMap.put("21", 0.7328664640865081);
        subScoreMap.put("22", 0.878299891524916);
        subScoreMap.put("23", 0.9274055671933976);
        subScoreMap.put("24", 1.1072748919607627);
        subScoreMap.put("25", 1.3203655419235967);
        subScoreMap.put("26", 0.8138630341303417);
        subScoreMap.put("27", 0.938150245047598);
        subScoreMap.put("28", 1.1995203714170821);
        subScoreMap.put("29", 0.6387686813596257);
        subScoreMap.put("30", 0.7594418133005274);
        subScoreMap.put("31", 1.1438959200005552);
        subScoreMap.put("32", 0.9338835095233025);
        subScoreMap.put("33", 0.6299887383296608);
        subScoreMap.put("34", 1.145951670064645);
        subScoreMap.put("35", 0.7892788142374548);
        subScoreMap.put("36", 0.690729167458266);
        subScoreMap.put("37", 0.91573412374267);
        subScoreMap.put("38", 0.9475285839159677);
        subScoreMap.put("39", 1.039793954520909);
        subScoreMap.put("40", 0.9730016447157298);
        subScoreMap.put("41", 1.3218815978471816);
        subScoreMap.put("42", 0.9878498153565124);
        subScoreMap.put("43", 0.7855030133029872);
        scoreMap.put("2", subScoreMap);
        subScoreMap = new HashMap<>();
        subScoreMap.put("44", 1.0959082390103463);
        subScoreMap.put("45", 0.8945265065058192);
        subScoreMap.put("46", 1.285398898974895);
        subScoreMap.put("47", 0.878565720861931);
        subScoreMap.put("48", 1.1529859565335228);
        subScoreMap.put("49", 0.8855230244577846);
        subScoreMap.put("50", 1.5790712851806998);
        subScoreMap.put("10", 1.5679610716877705);
        subScoreMap.put("11", 0.9688049184757485);
        subScoreMap.put("12", 1.2275655699494536);
        subScoreMap.put("13", 1.152806053236732);
        subScoreMap.put("14", 1.459792087510341);
        subScoreMap.put("15", 1.0049171224082905);
        subScoreMap.put("16", 0.9576016163382752);
        subScoreMap.put("17", 1.141866524692437);
        subScoreMap.put("18", 1.2800845664007878);
        subScoreMap.put("19", 1.008181039064086);
        subScoreMap.put("1", 1.0627928228807566);
        subScoreMap.put("2", 1.1798880173936626);
        subScoreMap.put("3", 0.8431458681491342);
        subScoreMap.put("4", 1.1388890190502894);
        subScoreMap.put("5", 0.9322016257422568);
        subScoreMap.put("6", 0.9917737730495635);
        subScoreMap.put("7", 1.2705184193958006);
        subScoreMap.put("8", 1.2266129101380054);
        subScoreMap.put("9", 1.607914207453508);
        subScoreMap.put("20", 1.4131094180505095);
        subScoreMap.put("21", 0.7541325806831883);
        subScoreMap.put("22", 1.1191517562528581);
        subScoreMap.put("23", 1.1567571125129865);
        subScoreMap.put("24", 1.1200468334904377);
        subScoreMap.put("25", 1.4995628796257263);
        subScoreMap.put("26", 0.9955493653618496);
        subScoreMap.put("27", 0.8280046904358133);
        subScoreMap.put("28", 1.3816622229353608);
        subScoreMap.put("29", 0.8255692939378625);
        subScoreMap.put("30", 0.8830590622749056);
        subScoreMap.put("31", 1.372590438122624);
        subScoreMap.put("32", 1.2026780414156661);
        subScoreMap.put("33", 0.7458339692926526);
        subScoreMap.put("34", 1.31157701407033);
        subScoreMap.put("35", 1.0613437811909512);
        subScoreMap.put("36", 0.9537196293104611);
        subScoreMap.put("37", 1.199008293621353);
        subScoreMap.put("38", 1.1285121342898168);
        subScoreMap.put("39", 1.0187103914067);
        subScoreMap.put("40", 1.1697274294526392);
        subScoreMap.put("41", 1.256062292455531);
        subScoreMap.put("42", 1.233196007821067);
        subScoreMap.put("43", 0.9161903065272056);
        scoreMap.put("3", subScoreMap);
    }
}