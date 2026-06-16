public class BuilderTest {
    public static void main(String[] args) {


        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 4080")
                .setOS("Windows 11")
                .build();

        gamingPC.displayConfig();

        System.out.println("\n-------------------\n");


        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .setOS("Windows 10")
                .build();

        officePC.displayConfig();
    }
}