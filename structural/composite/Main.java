package structural.composite;

public class Main {
    public static void main(String[] args) {
        MilitaryUnit army = new ConcreteMilitaryUnit("陸軍");
        army.add(new NormalSoldier("司令"));
        army.add(new NormalSoldier("陸軍通訊兵"));

        MilitaryUnit division = new ConcreteMilitaryUnit("第一師");
        division.add(new NormalSoldier("師長"));
        division.add(new NormalSoldier("第一師通訊兵"));
        army.add(division);

        MilitaryUnit brigade = new ConcreteMilitaryUnit("第一旅");
        brigade.add(new NormalSoldier("旅長"));
        brigade.add(new NormalSoldier("第一旅通訊兵"));
        division.add(brigade);

        MilitaryUnit regiment = new ConcreteMilitaryUnit("第一團");
        regiment.add(new NormalSoldier("團長"));
        regiment.add(new NormalSoldier("第一團通訊兵"));
        brigade.add(regiment);

        MilitaryUnit battalion = new ConcreteMilitaryUnit("第一營");
        battalion.add(new NormalSoldier("營長"));
        battalion.add(new NormalSoldier("第一營通訊兵"));
        regiment.add(battalion);

        MilitaryUnit company = new ConcreteMilitaryUnit("第一連");
        company.add(new NormalSoldier("連長"));
        company.add(new NormalSoldier("第一連通訊兵"));
        battalion.add(company);

        MilitaryUnit platoon = new ConcreteMilitaryUnit("第一排");
        platoon.add(new NormalSoldier("排長"));
        platoon.add(new NormalSoldier("第一排通訊兵"));
        company.add(platoon);

        MilitaryUnit squad1 = new ConcreteMilitaryUnit("第一班");
        squad1.add(new NormalSoldier("班長"));
        squad1.add(new NormalSoldier("第一班通訊兵"));
        platoon.add(squad1);

        MilitaryUnit fireTeam11 = new ConcreteMilitaryUnit("第一伍");
        fireTeam11.add(new NormalSoldier("伍長"));
        fireTeam11.add(new NormalSoldier("第一伍通訊兵"));
        fireTeam11.add(new NormalSoldier("Roger"));
        fireTeam11.add(new NormalSoldier("Jason"));
        squad1.add(fireTeam11);

        MilitaryUnit fireTeam12 = new ConcreteMilitaryUnit("第二伍");
        fireTeam12.add(new NormalSoldier("伍長"));
        fireTeam12.add(new LazySoldier("第二伍通訊兵"));
        fireTeam12.add(new DrunkSoldier("Rick"));
        fireTeam12.add(new DeserterSoldier("Jay"));
        squad1.add(fireTeam12);

        MilitaryUnit squad2 = new ConcreteMilitaryUnit("第二班");
        squad2.add(new NormalSoldier("班長"));
        squad2.add(new NormalSoldier("第二班通訊兵"));
        platoon.add(squad2);

        MilitaryUnit fireTeam21 = new ConcreteMilitaryUnit("第三伍");
        fireTeam21.add(new NormalSoldier("伍長"));
        fireTeam21.add(new DrunkSoldier("第三伍通訊兵"));
        fireTeam21.add(new NormalSoldier("Allen"));
        fireTeam21.add(new NormalSoldier("Bill"));
        squad2.add(fireTeam21);

        MilitaryUnit fireTeam22 = new ConcreteMilitaryUnit("第四伍");
        fireTeam22.add(new NormalSoldier("伍長"));
        fireTeam22.add(new LazySoldier("第四伍通訊兵"));
        fireTeam22.add(new DrunkSoldier("Charlie"));
        fireTeam22.add(new DeserterSoldier("Dave"));
        squad2.add(fireTeam22);

        System.out.println("結構圖：");
        army.display(1);
        System.out.println("陸軍人員回報：" + army.reportUnitCounts());
        System.out.println("陸軍武器數量回報：" + army.reportWeaponCounts());
    }
}
