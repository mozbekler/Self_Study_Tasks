package out.SelfStudy.MentorTasks.july.realEstateTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Database {

        static Square seaview = new Square("seaview", 20);
        static Square houseOfLords = new Square("House of Lords", 25);
        static Square twinTowers = new Square("The Twin Towers", 30);

        static Rectangle skyLine = new Rectangle("Skyline Condo", 20, 30);
        static Rectangle broadway = new Rectangle("Broadway Lofts", 20, 25);

        static Circle quay = new Circle("One Circular Quay", 15);
        static Circle hillSide = new Circle("Hillside Apartments", 20);
        static Circle thePeak = new Circle("The Peak", 10);



        static ArrayList<Square> squareShapedApartments = new ArrayList<>(Arrays.asList(seaview, houseOfLords, twinTowers));
        static ArrayList<Rectangle> rectangleShapedApartments = new ArrayList<>((Arrays.asList(skyLine, broadway)));
        static ArrayList<Circle> circleShapedApartments = new ArrayList<>((Arrays.asList(quay, hillSide, thePeak)));



        //squareShapedApartments.addAll(Arrays.asList(seaview, houseOfLords, twinTowers));
        //rectangleShapedApartments.addAll(Arrays.asList(skyLine, broadway));
        //circleShapedApartments.addAll(Arrays.asList(quay, hillSide, thePeak));

        //Ask kichi how to add all these arrylists into a one arraylist

        ArrayList<LandShapes> apartmentsList= new ArrayList<>();

       // apartmentsList.addAll(Arrays.asList((LandShapes) (squareShapedApartments,rectangleShapedApartments,circleShapedApartments));

        //apartmentsList.addAll((ArrayList<LandShapes>) squareShapedApartments);





}
