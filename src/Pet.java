import java.util.Random;

public class Pet {
   private int age;
    private Color color;
    private Shelter shelter;


        public Pet(Color color, Shelter shelter) {

        this.color = color;
        this.shelter = shelter;
    }

    public Pet() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }



    public static int  generateDefaultAge(){

   return new Random().nextInt(10)+1;
    }

    public String getInfo(){

    return "Age:"+age+"\nColor: "+color+"\nShelter name:"+shelter.getName()+"\nShelter address:"+shelter.getAddress();
    }

}
