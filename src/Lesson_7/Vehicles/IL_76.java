package Lesson_7.Vehicles;

import Lesson_7.Vehilces_subtype.MilitaryAirplane;

public class IL_76 {
    public static void main(String[] args) {
        MilitaryAirplane il_76 = new MilitaryAirplane(12000, 835, 72000,
                "ИЛ-76", 50, 1500, true, 4);
        il_76.pintInfoAboutMilitaryAirplane();
        il_76.conversionToKilowatts();
//        il_76.shoot();
//        il_76.shoot();
//        il_76.shoot();
//        il_76.shoot();
        il_76.shootWithRequest();
        il_76.catapult();

    }
}
