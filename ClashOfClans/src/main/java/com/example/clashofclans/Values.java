package com.example.clashofclans;

public class Values {

    // Max health = 100; Max hit/second = 50; Max speed = 20; Max hit range(HERO) = 10; Max hit range(BUILDING) = 10;
    // Max Damage = 500;

    // Knight - middle
    public static int KNIGHT_HEALTH = 60;
    public static int KNIGHT_HIT = 30;
    public static int KNIGHT_SPEED = 10;
    public static int KNIGHT_HITRANGE = 2;

    // Green - weak
    public static int GREEN_HEALTH = 45;
    public static int GREEN_HIT = 15;
    public static int GREEN_SPEED = 40;
    public static int GREEN_HITRANGE = 2;

    // Spear - middle
    public static int SPEAR_HEALTH = 80;
    public static int SPEAR_HIT = 15;
    public static int SPEAR_SPEED = 15;
    public static int SPEAR_HITRANGE = 5;

    // Dragon - Strong
    public static int DRAGON_HEALTH = 60;
    public static int DRAGON_HIT = 40;
    public static int DRAGON_SPEED = 30;
    public static int DRAGON_HITRANGE = 10;

    //Troll - Strong
    public static int TROLL_HEALTH = 80;
    public static int TROLL_HIT = 50;
    public static int TROLL_SPEED = 10;
    public static int TROLL_HITRANGE = 2;

    public enum DefensiveType {
        DEFENSIVE,
        NORMAL
    }

    // Canon - middle
    public static int CANON_HIT = 20;
    public static int CANON_HITRANGE = 15;
    public static int CANON_DAMAGE = 200;

    // Thrower - middle
    public static int THROWER_HIT = 20;
    public static int THROWER_HITRANGE = 15;
    public static int THROWER_DAMAGE = 200;

    // Powder - Strong
    public static int POWDER_HIT = 20;
    public static int POWDER_HITRANGE = 15;
    public static int POWDER_DAMAGE = 200;
}
