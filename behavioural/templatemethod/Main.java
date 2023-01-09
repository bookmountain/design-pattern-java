package behavioural.templatemethod;

public class Main {
    public static void main(String[] args) {
        Housekeeping housekeeping = null;
        String washClothesResult = null;
        String cleanUpResult = null;

        System.out.println("沒什麼閒錢，整理家務簡單即可");
        housekeeping = new SimpleHousekeeping();
        washClothesResult = housekeeping.washClothes();
        cleanUpResult = housekeeping.cleanUp();
        System.out.println("清理結果： " + washClothesResult + "；" + cleanUpResult);

        System.out.println("\n有點錢了，買些家電幫忙整理家務");
        housekeeping = new AppliancesHousekeeping();
        washClothesResult = housekeeping.washClothes();
        cleanUpResult = housekeeping.cleanUp();
        System.out.println("\n清理結果： " + washClothesResult + "；" + cleanUpResult);
    }
}
