package out.SelfStudy.MentorTasks.April_May;


public class AnimalDish {
    public static void main(String[] args) {

        System.out.println(animalDish("chickhadee","chocolate cake"));




    }

    public static boolean animalDish(String animal, String dish){

return animal.substring(0,1).equals(dish.substring(0,1)) && animal.substring(animal.length()-1).equals(dish.substring(dish.length()-1));




    }




}
