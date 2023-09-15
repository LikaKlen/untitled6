//big comment pls work
public class Toy {
    private int Weight, Size, numberOfDetails;
    boolean Softness;
    public Toy(int Weight, int Size, boolean Softness, int numberOfDetails){
        this.Weight=Weight;
        this.Size=Size;
        this.Softness=Softness;
        this.numberOfDetails=numberOfDetails;
    }
    public int getWeight() {
        return Weight;
    }
    public void setWeight(int Weight){
        this.Weight = Weight;
    }
    public int getSize() {
        return Size;
    }
    public void setSize(int Size){
        this.Size = Size;
    }
    public boolean getSoftness() {
        return Softness;
    }
    public void setSoftness(boolean Softness) {
        this.Softness= Softness;
    }
    public int getNumberOfDetails() {
        return numberOfDetails;
    }
    public void setNumberOfDetails(int numberOfDetails) {
        this.numberOfDetails= numberOfDetails;
    }
    private static class PlushToy extends Toy {
        int cost;
        String material,manufacturer,owner;
        private PlushToy(int Weight, int Size,boolean Softness, int numberOfDetails,String material,String manufacturer,int cost, String owner){
            super(Weight, Size, Softness,numberOfDetails);
            this.material=material;
            this.manufacturer=manufacturer;
            this.cost=cost;
            this.owner=owner;
        }
        public String getMaterial() {
            return material;
        }
        public void setMaterial(String material) {
            this.material = material;
        }
        public String getManufacturer() {
            return manufacturer;
        }
        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
        public int getCost() {
            return cost;
        }
        public void setCost(int cost) {
            this.cost = cost;
        }
        public String getOwner() {
            return owner;
        }
        public void setOwner(String owner) {
            this.owner = owner;
        }
    }
    public static void main(String[]args) {
        PlushToy Bear = new PlushToy( 5, 114, true, 12, "Plush", "China", 1000, "Angelina");

        System.out.println("Игрушка произведена в - " + Bear.getManufacturer());

        Bear.setSize(115);

        System.out.println("Материал игрушки: - " + Bear.getMaterial());
    }

}
